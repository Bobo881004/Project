package com.example.meilolbook

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONObject
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.graphics.toColorInt
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.ImageRequest
import com.android.volley.toolbox.Volley
import com.example.meilolbook.ListClickedActivity
import com.example.meilolbook.R
import kotlinx.android.synthetic.main.fragment_search.*
import java.text.SimpleDateFormat
import java.util.*

val idToName = JSONObject("""
        {"266":{"id":"Aatrox","name":"厄薩斯"},"103":{"id":"Ahri","name":"阿璃"},"84":{"id":"Akali","name":"阿卡莉"},"12":{"id":"Alistar","name":"亞歷斯塔"},"32":{"id":"Amumu","name":"阿姆姆"},"34":{"id":"Anivia","name":"艾妮維亞"},"1":{"id":"Annie","name":"安妮"},"523":{"id":"Aphelios","name":"亞菲利歐"},"22":{"id":"Ashe","name":"艾希"},"136":{"id":"AurelionSol","name":"翱銳龍獸"},"268":{"id":"Azir","name":"阿祈爾"},"432":{"id":"Bard","name":"巴德"},"53":{"id":"Blitzcrank","name":"布里茨"},"63":{"id":"Brand","name":"布蘭德"},"201":{"id":"Braum","name":"布郎姆"},"51":{"id":"Caitlyn","name":"凱特琳"},"164":{"id":"Camille","name":"卡蜜兒"},"69":{"id":"Cassiopeia","name":"卡莎碧雅"},"31":{"id":"Chogath","name":"科加斯"},"42":{"id":"Corki","name":"庫奇"},"122":{"id":"Darius","name":"達瑞斯"},"131":{"id":"Diana","name":"黛安娜"},"119":{"id":"Draven","name":"達瑞文"},"36":{"id":"DrMundo","name":"蒙多醫生"},"245":{"id":"Ekko","name":"艾克"},"60":{"id":"Elise","name":"伊莉絲"},"28":{"id":"Evelynn","name":"伊芙琳"},"81":{"id":"Ezreal","name":"伊澤瑞爾"},"9":{"id":"Fiddlesticks","name":"費德提克"},"114":{"id":"Fiora","name":"菲歐拉"},"105":{"id":"Fizz","name":"飛斯"},"3":{"id":"Galio","name":"加里歐"},"41":{"id":"Gangplank","name":"剛普朗克"},"86":{"id":"Garen","name":"蓋倫"},"150":{"id":"Gnar","name":"吶兒"},"79":{"id":"Gragas","name":"古拉格斯"},"104":{"id":"Graves","name":"葛雷夫"},"120":{"id":"Hecarim","name":"赫克林"},"74":{"id":"Heimerdinger","name":"漢默丁格"},"420":{"id":"Illaoi","name":"伊羅旖"},"39":{"id":"Irelia","name":"伊瑞莉雅"},"427":{"id":"Ivern","name":"埃爾文"},"40":{"id":"Janna","name":"珍娜"},"59":{"id":"JarvanIV","name":"嘉文四世"},"24":{"id":"Jax","name":"賈克斯"},"126":{"id":"Jayce","name":"杰西"},"202":{"id":"Jhin","name":"燼"},"222":{"id":"Jinx","name":"吉茵珂絲"},"145":{"id":"Kaisa","name":"凱莎"},"429":{"id":"Kalista","name":"克黎思妲"},"43":{"id":"Karma","name":"卡瑪"},"30":{"id":"Karthus","name":"卡爾瑟斯"},"38":{"id":"Kassadin","name":"卡薩丁"},"55":{"id":"Katarina","name":"卡特蓮娜"},"10":{"id":"Kayle","name":"凱爾"},"141":{"id":"Kayn","name":"慨影"},"85":{"id":"Kennen","name":"凱能"},"121":{"id":"Khazix","name":"卡力斯"},"203":{"id":"Kindred","name":"鏡爪"},"240":{"id":"Kled","name":"克雷德"},"96":{"id":"KogMaw","name":"寇格魔"},"7":{"id":"Leblanc","name":"勒布朗"},"64":{"id":"LeeSin","name":"李星"},"89":{"id":"Leona","name":"雷歐娜"},"127":{"id":"Lissandra","name":"麗珊卓"},"236":{"id":"Lucian","name":"路西恩"},"117":{"id":"Lulu","name":"露璐"},"99":{"id":"Lux","name":"拉克絲"},"54":{"id":"Malphite","name":"墨菲特"},"90":{"id":"Malzahar","name":"馬爾札哈"},"57":{"id":"Maokai","name":"茂凱"},"11":{"id":"MasterYi","name":"易大師"},"21":{"id":"MissFortune","name":"好運姐"},"62":{"id":"MonkeyKing","name":"悟空"},"82":{"id":"Mordekaiser","name":"魔鬥凱薩"},"25":{"id":"Morgana","name":"魔甘娜"},"267":{"id":"Nami","name":"娜米"},"75":{"id":"Nasus","name":"納瑟斯"},"111":{"id":"Nautilus","name":"納帝魯斯"},"518":{"id":"Neeko","name":"妮可"},"76":{"id":"Nidalee","name":"奈德麗"},"56":{"id":"Nocturne","name":"夜曲"},"20":{"id":"Nunu","name":"努努和威朗普"},"2":{"id":"Olaf","name":"歐拉夫"},"61":{"id":"Orianna","name":"奧莉安娜"},"516":{"id":"Ornn","name":"鄂爾"},"80":{"id":"Pantheon","name":"潘森"},"78":{"id":"Poppy","name":"波比"},"555":{"id":"Pyke","name":"派克"},"246":{"id":"Qiyana","name":"姬亞娜"},"133":{"id":"Quinn","name":"葵恩"},"497":{"id":"Rakan","name":"銳空"},"33":{"id":"Rammus","name":"拉姆斯"},"421":{"id":"RekSai","name":"雷珂煞"},"58":{"id":"Renekton","name":"雷尼克頓"},"107":{"id":"Rengar","name":"雷葛爾"},"92":{"id":"Riven","name":"雷玟"},"68":{"id":"Rumble","name":"藍寶"},"13":{"id":"Ryze","name":"雷茲"},"113":{"id":"Sejuani","name":"史瓦妮"},"235":{"id":"Senna","name":"姍娜"},"35":{"id":"Shaco","name":"薩科"},"98":{"id":"Shen","name":"慎"},"102":{"id":"Shyvana","name":"希瓦娜"},"27":{"id":"Singed","name":"辛吉德"},"14":{"id":"Sion","name":"賽恩"},"15":{"id":"Sivir","name":"希維爾"},"72":{"id":"Skarner","name":"史加納"},"37":{"id":"Sona","name":"索娜"},"16":{"id":"Soraka","name":"索拉卡"},"50":{"id":"Swain","name":"斯溫"},"517":{"id":"Sylas","name":"賽勒斯"},"134":{"id":"Syndra","name":"星朵拉"},"223":{"id":"TahmKench","name":"貪啃奇"},"163":{"id":"Taliyah","name":"塔莉雅"},"91":{"id":"Talon","name":"塔隆"},"44":{"id":"Taric","name":"塔里克"},"17":{"id":"Teemo","name":"提摩"},"412":{"id":"Thresh","name":"瑟雷西"},"18":{"id":"Tristana","name":"崔絲塔娜"},"48":{"id":"Trundle","name":"特朗德"},"23":{"id":"Tryndamere","name":"泰達米爾"},"4":{"id":"TwistedFate","name":"逆命"},"29":{"id":"Twitch","name":"圖奇"},"77":{"id":"Udyr","name":"烏迪爾"},"6":{"id":"Urgot","name":"烏爾加特"},"110":{"id":"Varus","name":"法洛士"},"67":{"id":"Vayne","name":"汎"},"45":{"id":"Veigar","name":"維迦"},"161":{"id":"Velkoz","name":"威寇茲"},"254":{"id":"Vi","name":"菲艾"},"112":{"id":"Viktor","name":"維克特"},"8":{"id":"Vladimir","name":"弗拉迪米爾"},"106":{"id":"Volibear","name":"弗力貝爾"},"19":{"id":"Warwick","name":"沃維克"},"498":{"id":"Xayah","name":"剎雅"},"101":{"id":"Xerath","name":"齊勒斯"},"5":{"id":"XinZhao","name":"趙信"},"157":{"id":"Yasuo","name":"犽宿"},"83":{"id":"Yorick","name":"約瑞科"},"350":{"id":"Yuumi","name":"悠咪"},"154":{"id":"Zac","name":"札克"},"238":{"id":"Zed","name":"劫"},"115":{"id":"Ziggs","name":"希格斯"},"26":{"id":"Zilean","name":"極靈"},"142":{"id":"Zoe","name":"柔依"},"143":{"id":"Zyra","name":"枷蘿"}}
    """)

class ListClickedActivity : Activity() {
    private var reqQueue: RequestQueue? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match_info)

        reqQueue = Volley.newRequestQueue(this)

        var getKey = intent.getBundleExtra("bundle").getString("key")
        Log.i("custom_1", getKey)
        val jsonReq = JsonObjectRequest(Request.Method.GET, getKey, null,
            Response.Listener {
                val player_name = it.getJSONArray("participantIdentities")
                val summonerName_1 = JSONObject(player_name.getJSONObject(0)["player"].toString())["summonerName"].toString()
//                Log.i("custom_2", summonerName_1)
                var summonerName_temp1 = findViewById<TextView>(R.id.blue_p1_id)
                summonerName_temp1.text = summonerName_1
                val summonerName_2 = JSONObject(player_name.getJSONObject(1)["player"].toString())["summonerName"].toString()
                var summonerName_temp2 = findViewById<TextView>(R.id.blue_p2_id)
                summonerName_temp2.text = summonerName_2
                val summonerName_3 = JSONObject(player_name.getJSONObject(2)["player"].toString())["summonerName"].toString()
                var summonerName_temp3 = findViewById<TextView>(R.id.blue_p3_id)
                summonerName_temp3.text = summonerName_3
                val summonerName_4 = JSONObject(player_name.getJSONObject(3)["player"].toString())["summonerName"].toString()
                var summonerName_temp4 = findViewById<TextView>(R.id.blue_p4_id)
                summonerName_temp4.text = summonerName_4
                val summonerName_5 = JSONObject(player_name.getJSONObject(4)["player"].toString())["summonerName"].toString()
                var summonerName_temp5 = findViewById<TextView>(R.id.blue_p5_id)
                summonerName_temp5.text = summonerName_5
                val summonerName_6 = JSONObject(player_name.getJSONObject(5)["player"].toString())["summonerName"].toString()
                var summonerName_temp6 = findViewById<TextView>(R.id.red_p1_id)
                summonerName_temp6.text = summonerName_6
                val summonerName_7 = JSONObject(player_name.getJSONObject(6)["player"].toString())["summonerName"].toString()
                var summonerName_temp7 = findViewById<TextView>(R.id.red_p2_id)
                summonerName_temp7.text = summonerName_7
                val summonerName_8 = JSONObject(player_name.getJSONObject(7)["player"].toString())["summonerName"].toString()
                var summonerName_temp8 = findViewById<TextView>(R.id.red_p3_id)
                summonerName_temp8.text = summonerName_8
                val summonerName_9 = JSONObject(player_name.getJSONObject(8)["player"].toString())["summonerName"].toString()
                var summonerName_temp9 = findViewById<TextView>(R.id.red_p4_id)
                summonerName_temp9.text = summonerName_9
                val summonerName_10 = JSONObject(player_name.getJSONObject(9)["player"].toString())["summonerName"].toString()
                var summonerName_temp10 = findViewById<TextView>(R.id.red_p5_id)
                summonerName_temp10.text = summonerName_10
                ////
                val gold = it.getJSONArray("participants")
                val blue_p1_gold = JSONObject(gold.getJSONObject(0)["stats"].toString())["goldEarned"].toString()
                var blue_p1_gold_tmp = findViewById<TextView>(R.id.blue_p1_gold) as TextView
                blue_p1_gold_tmp.text = blue_p1_gold
                val blue_p2_gold = JSONObject(gold.getJSONObject(1)["stats"].toString())["goldEarned"].toString()
                var blue_p2_gold_tmp = findViewById<TextView>(R.id.blue_p2_gold) as TextView
                blue_p2_gold_tmp.text = blue_p2_gold
                val blue_p3_gold = JSONObject(gold.getJSONObject(2)["stats"].toString())["goldEarned"].toString()
                var blue_p3_gold_tmp = findViewById<TextView>(R.id.blue_p3_gold) as TextView
                blue_p3_gold_tmp.text = blue_p3_gold
                val blue_p4_gold = JSONObject(gold.getJSONObject(3)["stats"].toString())["goldEarned"].toString()
                var blue_p4_gold_tmp = findViewById<TextView>(R.id.blue_p4_gold) as TextView
                blue_p4_gold_tmp.text = blue_p4_gold
                val blue_p5_gold = JSONObject(gold.getJSONObject(4)["stats"].toString())["goldEarned"].toString()
                var blue_p5_gold_tmp = findViewById<TextView>(R.id.blue_p5_gold) as TextView
                blue_p5_gold_tmp.text = blue_p5_gold
                val red_p1_gold = JSONObject(gold.getJSONObject(5)["stats"].toString())["goldEarned"].toString()
                var red_p1_gold_tmp = findViewById<TextView>(R.id.red_p1_gold) as TextView
                red_p1_gold_tmp.text = red_p1_gold
                val red_p2_gold = JSONObject(gold.getJSONObject(6)["stats"].toString())["goldEarned"].toString()
                var red_p2_gold_tmp = findViewById<TextView>(R.id.red_p2_gold) as TextView
                red_p2_gold_tmp.text = red_p2_gold
                val red_p3_gold = JSONObject(gold.getJSONObject(7)["stats"].toString())["goldEarned"].toString()
                var red_p3_gold_tmp = findViewById<TextView>(R.id.red_p3_gold) as TextView
                red_p3_gold_tmp.text = red_p3_gold
                val red_p4_gold = JSONObject(gold.getJSONObject(8)["stats"].toString())["goldEarned"].toString()
                var red_p4_gold_tmp = findViewById<TextView>(R.id.red_p4_gold) as TextView
                red_p4_gold_tmp.text = red_p4_gold
                val red_p5_gold = JSONObject(gold.getJSONObject(9)["stats"].toString())["goldEarned"].toString()
                var red_p5_gold_tmp = findViewById<TextView>(R.id.red_p5_gold) as TextView
                red_p5_gold_tmp.text = red_p5_gold
                ///
                val cs = it.getJSONArray("participants")
                val blue_p1_cs = JSONObject(gold.getJSONObject(0)["stats"].toString())["totalMinionsKilled"].toString()
                var blue_p1_cs_tmp = findViewById<TextView>(R.id.blue_p1_cs) as TextView
                blue_p1_cs_tmp.text = blue_p1_cs
                val blue_p2_cs = JSONObject(gold.getJSONObject(1)["stats"].toString())["totalMinionsKilled"].toString()
                var blue_p2_cs_tmp = findViewById<TextView>(R.id.blue_p2_cs) as TextView
                blue_p2_cs_tmp.text = blue_p2_cs
                val blue_p3_cs = JSONObject(gold.getJSONObject(2)["stats"].toString())["totalMinionsKilled"].toString()
                var blue_p3_cs_tmp = findViewById<TextView>(R.id.blue_p3_cs) as TextView
                blue_p3_cs_tmp.text = blue_p3_cs
                val blue_p4_cs = JSONObject(gold.getJSONObject(3)["stats"].toString())["totalMinionsKilled"].toString()
                var blue_p4_cs_tmp = findViewById<TextView>(R.id.blue_p4_cs) as TextView
                blue_p4_cs_tmp.text = blue_p4_cs
                val blue_p5_cs = JSONObject(gold.getJSONObject(4)["stats"].toString())["totalMinionsKilled"].toString()
                var blue_p5_cs_tmp = findViewById<TextView>(R.id.blue_p5_cs) as TextView
                blue_p5_cs_tmp.text = blue_p5_cs
                val red_p1_cs = JSONObject(gold.getJSONObject(5)["stats"].toString())["totalMinionsKilled"].toString()
                var red_p1_cs_tmp = findViewById<TextView>(R.id.red_p1_cs) as TextView
                red_p1_cs_tmp.text = red_p1_cs
                val red_p2_cs = JSONObject(gold.getJSONObject(6)["stats"].toString())["totalMinionsKilled"].toString()
                var red_p2_cs_tmp = findViewById<TextView>(R.id.red_p2_cs) as TextView
                red_p2_cs_tmp.text = red_p2_cs
                val red_p3_cs = JSONObject(gold.getJSONObject(7)["stats"].toString())["totalMinionsKilled"].toString()
                var red_p3_cs_tmp = findViewById<TextView>(R.id.red_p3_cs) as TextView
                red_p3_cs_tmp.text = red_p3_cs
                val red_p4_cs = JSONObject(gold.getJSONObject(8)["stats"].toString())["totalMinionsKilled"].toString()
                var red_p4_cs_tmp = findViewById<TextView>(R.id.red_p4_cs) as TextView
                red_p4_cs_tmp.text = red_p4_cs
                val red_p5_cs = JSONObject(gold.getJSONObject(9)["stats"].toString())["totalMinionsKilled"].toString()
                var red_p5_cs_tmp = findViewById<TextView>(R.id.red_p5_cs) as TextView
                red_p5_cs_tmp.text = red_p5_cs
                ///
                val score = it.getJSONArray("participants")
                val blue_p1_k = JSONObject(score.getJSONObject(0)["stats"].toString())["kills"].toString()
                val blue_p1_d = JSONObject(score.getJSONObject(0)["stats"].toString())["deaths"].toString()
                val blue_p1_a = JSONObject(score.getJSONObject(0)["stats"].toString())["assists"].toString()
                val kda1 = blue_p1_k+"/"+blue_p1_d+"/"+blue_p1_a
                val blue_p1_score = findViewById(R.id.blue_p1_score) as TextView
                blue_p1_score.text = kda1
                val blue_p2_k = JSONObject(score.getJSONObject(0)["stats"].toString())["kills"].toString()
                val blue_p2_d = JSONObject(score.getJSONObject(0)["stats"].toString())["deaths"].toString()
                val blue_p2_a = JSONObject(score.getJSONObject(0)["stats"].toString())["assists"].toString()
                val kda2 = blue_p2_k+"/"+blue_p2_d+"/"+blue_p2_a
                val blue_p2_score = findViewById(R.id.blue_p2_score) as TextView
                blue_p2_score.text = kda2
                val blue_p3_k = JSONObject(score.getJSONObject(0)["stats"].toString())["kills"].toString()
                val blue_p3_d = JSONObject(score.getJSONObject(0)["stats"].toString())["deaths"].toString()
                val blue_p3_a = JSONObject(score.getJSONObject(0)["stats"].toString())["assists"].toString()
                val kda3 = blue_p3_k+"/"+blue_p3_d+"/"+blue_p3_a
                val blue_p3_score = findViewById(R.id.blue_p3_score) as TextView
                blue_p3_score.text = kda3
                val blue_p4_k = JSONObject(score.getJSONObject(0)["stats"].toString())["kills"].toString()
                val blue_p4_d = JSONObject(score.getJSONObject(0)["stats"].toString())["deaths"].toString()
                val blue_p4_a = JSONObject(score.getJSONObject(0)["stats"].toString())["assists"].toString()
                val kda4 = blue_p1_k+"/"+blue_p1_d+"/"+blue_p1_a
                val blue_p1_score = findViewById(R.id.blue_p1_score) as TextView
                blue_p1_score.text = kda1
                val blue_p1_k = JSONObject(score.getJSONObject(0)["stats"].toString())["kills"].toString()
                val blue_p1_d = JSONObject(score.getJSONObject(0)["stats"].toString())["deaths"].toString()
                val blue_p1_a = JSONObject(score.getJSONObject(0)["stats"].toString())["assists"].toString()
                val kda1 = blue_p1_k+"/"+blue_p1_d+"/"+blue_p1_a
                val blue_p1_score = findViewById(R.id.blue_p1_score) as TextView
                blue_p1_score.text = kda1


            },
            Response.ErrorListener {})
        reqQueue!!.add(jsonReq)
    }
}