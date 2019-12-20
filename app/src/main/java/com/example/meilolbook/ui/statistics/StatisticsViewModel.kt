package com.example.meilolbook.ui.statistics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.json.JSONArray
import org.json.JSONObject
import java.net.CacheResponse
import android.util.Log
val idToName = JSONObject("""
    { "350":{"id":"Yuumi","name":"悠咪"},"246":{"id":"Qiyana","name":"姬亞娜"},"523":{"id":"Aphelios","name":"亞菲利歐"},"235":{"id":"Senna","name":"姍娜"},"266":{"id":"Aatrox","name":"厄薩斯"},"103":{"id":"Ahri","name":"阿璃"},"84":{"id":"Akali","name":"阿卡莉"},"12":{"id":"Alistar","name":"亞歷斯塔"},"32":{"id":"Amumu","name":"阿姆姆"},"34":{"id":"Anivia","name":"艾妮維亞"},"1":{"id":"Annie","name":"安妮"},"22":{"id":"Ashe","name":"艾希"},"136":{"id":"AurelionSol","name":"翱銳龍獸"},"268":{"id":"Azir","name":"阿祈爾"},"432":{"id":"Bard","name":"巴德"},"53":{"id":"Blitzcrank","name":"布里茨"},"63":{"id":"Brand","name":"布蘭德"},"201":{"id":"Braum","name":"布郎姆"},"51":{"id":"Caitlyn","name":"凱特琳"},"164":{"id":"Camille","name":"卡蜜兒"},"69":{"id":"Cassiopeia","name":"卡莎碧雅"},"31":{"id":"Chogath","name":"科加斯"},"42":{"id":"Corki","name":"庫奇"},"122":{"id":"Darius","name":"達瑞斯"},"131":{"id":"Diana","name":"黛安娜"},"119":{"id":"Draven","name":"達瑞文"},"36":{"id":"DrMundo","name":"蒙多醫生"},"245":{"id":"Ekko","name":"艾克"},"60":{"id":"Elise","name":"伊莉絲"},"28":{"id":"Evelynn","name":"伊芙琳"},"81":{"id":"Ezreal","name":"伊澤瑞爾"},"9":{"id":"Fiddlesticks","name":"費德提克"},"114":{"id":"Fiora","name":"菲歐拉"},"105":{"id":"Fizz","name":"飛斯"},"3":{"id":"Galio","name":"加里歐"},"41":{"id":"Gangplank","name":"剛普朗克"},"86":{"id":"Garen","name":"蓋倫"},"150":{"id":"Gnar","name":"吶兒"},"79":{"id":"Gragas","name":"古拉格斯"},"104":{"id":"Graves","name":"葛雷夫"},"120":{"id":"Hecarim","name":"赫克林"},"74":{"id":"Heimerdinger","name":"漢默丁格"},"420":{"id":"Illaoi","name":"伊羅旖"},"39":{"id":"Irelia","name":"伊瑞莉雅"},"427":{"id":"Ivern","name":"埃爾文"},"40":{"id":"Janna","name":"珍娜"},"59":{"id":"JarvanIV","name":"嘉文四世"},"24":{"id":"Jax","name":"賈克斯"},"126":{"id":"Jayce","name":"杰西"},"202":{"id":"Jhin","name":"燼"},"222":{"id":"Jinx","name":"吉茵珂絲"},"145":{"id":"Kaisa","name":"凱莎"},"429":{"id":"Kalista","name":"克黎思妲"},"43":{"id":"Karma","name":"卡瑪"},"30":{"id":"Karthus","name":"卡爾瑟斯"},"38":{"id":"Kassadin","name":"卡薩丁"},"55":{"id":"Katarina","name":"卡特蓮娜"},"10":{"id":"Kayle","name":"凱爾"},"141":{"id":"Kayn","name":"慨影"},"85":{"id":"Kennen","name":"凱能"},"121":{"id":"Khazix","name":"卡力斯"},"203":{"id":"Kindred","name":"鏡爪"},"240":{"id":"Kled","name":"克雷德"},"96":{"id":"KogMaw","name":"寇格魔"},"7":{"id":"Leblanc","name":"勒布朗"},"64":{"id":"LeeSin","name":"李星"},"89":{"id":"Leona","name":"雷歐娜"},"127":{"id":"Lissandra","name":"麗珊卓"},"236":{"id":"Lucian","name":"路西恩"},"117":{"id":"Lulu","name":"露璐"},"99":{"id":"Lux","name":"拉克絲"},"54":{"id":"Malphite","name":"墨菲特"},"90":{"id":"Malzahar","name":"馬爾札哈"},"57":{"id":"Maokai","name":"茂凱"},"11":{"id":"MasterYi","name":"易大師"},"21":{"id":"MissFortune","name":"好運姐"},"62":{"id":"MonkeyKing","name":"悟空"},"82":{"id":"Mordekaiser","name":"魔鬥凱薩"},"25":{"id":"Morgana","name":"魔甘娜"},"267":{"id":"Nami","name":"娜米"},"75":{"id":"Nasus","name":"納瑟斯"},"111":{"id":"Nautilus","name":"納帝魯斯"},"518":{"id":"Neeko","name":"妮可"},"76":{"id":"Nidalee","name":"奈德麗"},"56":{"id":"Nocturne","name":"夜曲"},"20":{"id":"Nunu","name":"努努和威朗普"},"2":{"id":"Olaf","name":"歐拉夫"},"61":{"id":"Orianna","name":"奧莉安娜"},"516":{"id":"Ornn","name":"鄂爾"},"80":{"id":"Pantheon","name":"潘森"},"78":{"id":"Poppy","name":"波比"},"555":{"id":"Pyke","name":"派克"},"133":{"id":"Quinn","name":"葵恩"},"497":{"id":"Rakan","name":"銳空"},"33":{"id":"Rammus","name":"拉姆斯"},"421":{"id":"RekSai","name":"雷珂煞"},"58":{"id":"Renekton","name":"雷尼克頓"},"107":{"id":"Rengar","name":"雷葛爾"},"92":{"id":"Riven","name":"雷玟"},"68":{"id":"Rumble","name":"藍寶"},"13":{"id":"Ryze","name":"雷茲"},"113":{"id":"Sejuani","name":"史瓦妮"},"35":{"id":"Shaco","name":"薩科"},"98":{"id":"Shen","name":"慎"},"102":{"id":"Shyvana","name":"希瓦娜"},"27":{"id":"Singed","name":"辛吉德"},"14":{"id":"Sion","name":"賽恩"},"15":{"id":"Sivir","name":"希維爾"},"72":{"id":"Skarner","name":"史加納"},"37":{"id":"Sona","name":"索娜"},"16":{"id":"Soraka","name":"索拉卡"},"50":{"id":"Swain","name":"斯溫"},"517":{"id":"Sylas","name":"賽勒斯"},"134":{"id":"Syndra","name":"星朵拉"},"223":{"id":"TahmKench","name":"貪啃奇"},"163":{"id":"Taliyah","name":"塔莉雅"},"91":{"id":"Talon","name":"塔隆"},"44":{"id":"Taric","name":"塔里克"},"17":{"id":"Teemo","name":"提摩"},"412":{"id":"Thresh","name":"瑟雷西"},"18":{"id":"Tristana","name":"崔絲塔娜"},"48":{"id":"Trundle","name":"特朗德"},"23":{"id":"Tryndamere","name":"泰達米爾"},"4":{"id":"TwistedFate","name":"逆命"},"29":{"id":"Twitch","name":"圖奇"},"77":{"id":"Udyr","name":"烏迪爾"},"6":{"id":"Urgot","name":"烏爾加特"},"110":{"id":"Varus","name":"法洛士"},"67":{"id":"Vayne","name":"汎"},"45":{"id":"Veigar","name":"維迦"},"161":{"id":"Velkoz","name":"威寇茲"},"254":{"id":"Vi","name":"菲艾"},"112":{"id":"Viktor","name":"維克特"},"8":{"id":"Vladimir","name":"弗拉迪米爾"},"106":{"id":"Volibear","name":"弗力貝爾"},"19":{"id":"Warwick","name":"沃維克"},"498":{"id":"Xayah","name":"剎雅"},"101":{"id":"Xerath","name":"齊勒斯"},"5":{"id":"XinZhao","name":"趙信"},"157":{"id":"Yasuo","name":"犽宿"},"83":{"id":"Yorick","name":"約瑞科"},"154":{"id":"Zac","name":"札克"},"238":{"id":"Zed","name":"劫"},"115":{"id":"Ziggs","name":"希格斯"},"26":{"id":"Zilean","name":"極靈"},"142":{"id":"Zoe","name":"柔依"},"143":{"id":"Zyra","name":"枷蘿"}}
""")
class StatisticsViewModel : ViewModel() {

    val hero_model : MutableList<Hero_Model> = arrayListOf()

    fun loaddata(response: JSONArray,index: Int)
    {
        hero_model.clear()
        var count = 0
        for(i in 0 until response.length())
        {
            val tmp = Hero_Model()
            val Arr = response.getJSONObject(i)
            val cid = Arr.getString("championId")
            Log.i("loadData123",response.getJSONObject(i).toString())
            tmp.heroName = JSONObject(idToName[cid].toString())["id"].toString().toLowerCase()
            tmp.heroPosition = index
            tmp.heroTier = count
            tmp.heroST = Arr.getString("rate").toDouble()
            count = count + 1
            Log.i("loadData123456",index.toString() +  " "+ count.toString() + " "+tmp.heroST)
            Log.i("aya",tmp.heroName +" " + tmp.heroPosition+  " "+ tmp.heroTier)
            hero_model.add(tmp)
        }

    }
    fun getURL(lane: Int): String
    {
        var url = "http://sql.chesskuo.tw/lol/v1/statistics/"
        if(lane == 0)
            url += "top"
        else if (lane == 1)
            url += "jg"
        else if (lane == 2)
            url += "mid"
        else if (lane == 3)
            url += "ad"
        else if (lane == 4)
            url += "sup"
        return  url
    }

    fun getheroName(n : Int): String
    {
        return hero_model[n].heroName
    }
    fun getheroST(n: Int): String
    {
        return hero_model[n].heroST.toString()
    }
}