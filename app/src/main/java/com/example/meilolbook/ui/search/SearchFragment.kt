package com.example.meilolbook.ui.search

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
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
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.meilolbook.R
import kotlinx.android.synthetic.main.fragment_search.*
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*



const val lol_ver = "9.24.2"

const val proto = "https://"
var region = ""
const val hosts = ".api.riotgames.com"
val mode = mapOf("summoner" to "/lol/summoner/v4/summoners/by-name/",
    "league" to "/lol/league/v4/entries/by-summoner/",
    "matchList" to "/lol/match/v4/matchlists/by-account/",
    "match" to "/lol/match/v4/matches/"
)
const val api_key = "?api_key=" + "RGAPI-9d877f40-5f36-4ce3-b3bb-f0830e54977d"

val idToName = JSONObject("""
    {"266":{"id":"Aatrox","name":"厄薩斯"},"103":{"id":"Ahri","name":"阿璃"},"84":{"id":"Akali","name":"阿卡莉"},"12":{"id":"Alistar","name":"亞歷斯塔"},"32":{"id":"Amumu","name":"阿姆姆"},"34":{"id":"Anivia","name":"艾妮維亞"},"1":{"id":"Annie","name":"安妮"},"523":{"id":"Aphelios","name":"亞菲利歐"},"22":{"id":"Ashe","name":"艾希"},"136":{"id":"AurelionSol","name":"翱銳龍獸"},"268":{"id":"Azir","name":"阿祈爾"},"432":{"id":"Bard","name":"巴德"},"53":{"id":"Blitzcrank","name":"布里茨"},"63":{"id":"Brand","name":"布蘭德"},"201":{"id":"Braum","name":"布郎姆"},"51":{"id":"Caitlyn","name":"凱特琳"},"164":{"id":"Camille","name":"卡蜜兒"},"69":{"id":"Cassiopeia","name":"卡莎碧雅"},"31":{"id":"Chogath","name":"科加斯"},"42":{"id":"Corki","name":"庫奇"},"122":{"id":"Darius","name":"達瑞斯"},"131":{"id":"Diana","name":"黛安娜"},"119":{"id":"Draven","name":"達瑞文"},"36":{"id":"DrMundo","name":"蒙多醫生"},"245":{"id":"Ekko","name":"艾克"},"60":{"id":"Elise","name":"伊莉絲"},"28":{"id":"Evelynn","name":"伊芙琳"},"81":{"id":"Ezreal","name":"伊澤瑞爾"},"9":{"id":"Fiddlesticks","name":"費德提克"},"114":{"id":"Fiora","name":"菲歐拉"},"105":{"id":"Fizz","name":"飛斯"},"3":{"id":"Galio","name":"加里歐"},"41":{"id":"Gangplank","name":"剛普朗克"},"86":{"id":"Garen","name":"蓋倫"},"150":{"id":"Gnar","name":"吶兒"},"79":{"id":"Gragas","name":"古拉格斯"},"104":{"id":"Graves","name":"葛雷夫"},"120":{"id":"Hecarim","name":"赫克林"},"74":{"id":"Heimerdinger","name":"漢默丁格"},"420":{"id":"Illaoi","name":"伊羅旖"},"39":{"id":"Irelia","name":"伊瑞莉雅"},"427":{"id":"Ivern","name":"埃爾文"},"40":{"id":"Janna","name":"珍娜"},"59":{"id":"JarvanIV","name":"嘉文四世"},"24":{"id":"Jax","name":"賈克斯"},"126":{"id":"Jayce","name":"杰西"},"202":{"id":"Jhin","name":"燼"},"222":{"id":"Jinx","name":"吉茵珂絲"},"145":{"id":"Kaisa","name":"凱莎"},"429":{"id":"Kalista","name":"克黎思妲"},"43":{"id":"Karma","name":"卡瑪"},"30":{"id":"Karthus","name":"卡爾瑟斯"},"38":{"id":"Kassadin","name":"卡薩丁"},"55":{"id":"Katarina","name":"卡特蓮娜"},"10":{"id":"Kayle","name":"凱爾"},"141":{"id":"Kayn","name":"慨影"},"85":{"id":"Kennen","name":"凱能"},"121":{"id":"Khazix","name":"卡力斯"},"203":{"id":"Kindred","name":"鏡爪"},"240":{"id":"Kled","name":"克雷德"},"96":{"id":"KogMaw","name":"寇格魔"},"7":{"id":"Leblanc","name":"勒布朗"},"64":{"id":"LeeSin","name":"李星"},"89":{"id":"Leona","name":"雷歐娜"},"127":{"id":"Lissandra","name":"麗珊卓"},"236":{"id":"Lucian","name":"路西恩"},"117":{"id":"Lulu","name":"露璐"},"99":{"id":"Lux","name":"拉克絲"},"54":{"id":"Malphite","name":"墨菲特"},"90":{"id":"Malzahar","name":"馬爾札哈"},"57":{"id":"Maokai","name":"茂凱"},"11":{"id":"MasterYi","name":"易大師"},"21":{"id":"MissFortune","name":"好運姐"},"62":{"id":"MonkeyKing","name":"悟空"},"82":{"id":"Mordekaiser","name":"魔鬥凱薩"},"25":{"id":"Morgana","name":"魔甘娜"},"267":{"id":"Nami","name":"娜米"},"75":{"id":"Nasus","name":"納瑟斯"},"111":{"id":"Nautilus","name":"納帝魯斯"},"518":{"id":"Neeko","name":"妮可"},"76":{"id":"Nidalee","name":"奈德麗"},"56":{"id":"Nocturne","name":"夜曲"},"20":{"id":"Nunu","name":"努努和威朗普"},"2":{"id":"Olaf","name":"歐拉夫"},"61":{"id":"Orianna","name":"奧莉安娜"},"516":{"id":"Ornn","name":"鄂爾"},"80":{"id":"Pantheon","name":"潘森"},"78":{"id":"Poppy","name":"波比"},"555":{"id":"Pyke","name":"派克"},"246":{"id":"Qiyana","name":"姬亞娜"},"133":{"id":"Quinn","name":"葵恩"},"497":{"id":"Rakan","name":"銳空"},"33":{"id":"Rammus","name":"拉姆斯"},"421":{"id":"RekSai","name":"雷珂煞"},"58":{"id":"Renekton","name":"雷尼克頓"},"107":{"id":"Rengar","name":"雷葛爾"},"92":{"id":"Riven","name":"雷玟"},"68":{"id":"Rumble","name":"藍寶"},"13":{"id":"Ryze","name":"雷茲"},"113":{"id":"Sejuani","name":"史瓦妮"},"235":{"id":"Senna","name":"姍娜"},"35":{"id":"Shaco","name":"薩科"},"98":{"id":"Shen","name":"慎"},"102":{"id":"Shyvana","name":"希瓦娜"},"27":{"id":"Singed","name":"辛吉德"},"14":{"id":"Sion","name":"賽恩"},"15":{"id":"Sivir","name":"希維爾"},"72":{"id":"Skarner","name":"史加納"},"37":{"id":"Sona","name":"索娜"},"16":{"id":"Soraka","name":"索拉卡"},"50":{"id":"Swain","name":"斯溫"},"517":{"id":"Sylas","name":"賽勒斯"},"134":{"id":"Syndra","name":"星朵拉"},"223":{"id":"TahmKench","name":"貪啃奇"},"163":{"id":"Taliyah","name":"塔莉雅"},"91":{"id":"Talon","name":"塔隆"},"44":{"id":"Taric","name":"塔里克"},"17":{"id":"Teemo","name":"提摩"},"412":{"id":"Thresh","name":"瑟雷西"},"18":{"id":"Tristana","name":"崔絲塔娜"},"48":{"id":"Trundle","name":"特朗德"},"23":{"id":"Tryndamere","name":"泰達米爾"},"4":{"id":"TwistedFate","name":"逆命"},"29":{"id":"Twitch","name":"圖奇"},"77":{"id":"Udyr","name":"烏迪爾"},"6":{"id":"Urgot","name":"烏爾加特"},"110":{"id":"Varus","name":"法洛士"},"67":{"id":"Vayne","name":"汎"},"45":{"id":"Veigar","name":"維迦"},"161":{"id":"Velkoz","name":"威寇茲"},"254":{"id":"Vi","name":"菲艾"},"112":{"id":"Viktor","name":"維克特"},"8":{"id":"Vladimir","name":"弗拉迪米爾"},"106":{"id":"Volibear","name":"弗力貝爾"},"19":{"id":"Warwick","name":"沃維克"},"498":{"id":"Xayah","name":"剎雅"},"101":{"id":"Xerath","name":"齊勒斯"},"5":{"id":"XinZhao","name":"趙信"},"157":{"id":"Yasuo","name":"犽宿"},"83":{"id":"Yorick","name":"約瑞科"},"350":{"id":"Yuumi","name":"悠咪"},"154":{"id":"Zac","name":"札克"},"238":{"id":"Zed","name":"劫"},"115":{"id":"Ziggs","name":"希格斯"},"26":{"id":"Zilean","name":"極靈"},"142":{"id":"Zoe","name":"柔依"},"143":{"id":"Zyra","name":"枷蘿"}}
""")






class SearchFragment : Fragment() {


    private lateinit var searchViewModel: SearchViewModel

    private var reqQueue: RequestQueue? = null

    private var id = ""
    private var accountId = ""
    private var sName = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        searchViewModel = ViewModelProviders.of(this).get(SearchViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_search, container, false)
        super.onCreate(savedInstanceState)

        reqQueue = Volley.newRequestQueue(context)

        val btn = root.findViewById(R.id.btnSearch) as Button
        btn.setOnClickListener {
            searchSummoner(it)
        }

        return root
    }

    private fun searchSummoner(view: View?)
    {
        scroll_list.removeAllViews()

        region = region_spinner.selectedItem.toString()

        if(region == "TW")
        {
            val a = "TLEÜICEJJ"
            val url = "https://acs-garena.leagueoflegends.com/v1/players?region=TW&name=" + a

            val jsonReq = JsonObjectRequest(Request.Method.GET, url, null,
                Response.Listener {

                    val tmpLayout = layoutInflater.inflate(R.layout.summoner_profile, null)

                    accountId = it["accountId"].toString()

                    addToListTW(tmpLayout)
                },
                Response.ErrorListener {
                    val tmp = TextView(this.context)

                    tmp.text = "Summoner Not Found!"
                    tmp.textSize = 30f
                    //                tmp.textAlignment = View.TEXT_ALIGNMENT_CENTER

                    scroll_list.addView(tmp)
                }
            )
            reqQueue!!.add(jsonReq)

        }
        else
        {
            val url = proto + region + hosts + mode["summoner"] + summonerName.text + api_key

            val jsonReq = JsonObjectRequest(Request.Method.GET, url, null,
                Response.Listener {
                    val tmpLayout = layoutInflater.inflate(R.layout.summoner_profile, null)

                    val imgReq = ImageRequest("http://ddragon.leagueoflegends.com/cdn/${lol_ver}/img/profileicon/${it["profileIconId"]}.png",
                        Response.Listener<Bitmap> {
                            (tmpLayout.findViewById(R.id.profile_icon) as ImageView).setImageBitmap(it)
                        }, 0, 0, Bitmap.Config.RGB_565, Response.ErrorListener {})
                    reqQueue!!.add(imgReq)

                    id = it["id"].toString()
                    accountId = it["accountId"].toString()

                    sName = it["name"].toString()
                    (tmpLayout.findViewById(R.id.profile_name) as TextView).text = sName
                    (tmpLayout.findViewById(R.id.profile_level) as TextView).text = it["summonerLevel"].toString()
                    (tmpLayout.findViewById(R.id.profile_revision) as TextView).text = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.TAIWAN).format(Date(it["revisionDate"].toString().toLong()))

                    val listview = tmpLayout.findViewById(R.id.match_list) as ListView

                    addToList(listview)

                    scroll_list.addView(tmpLayout)
                },
                Response.ErrorListener {
                    val tmp = TextView(this.context)

                    tmp.text = "Summoner Not Found!"
                    tmp.textSize = 30f
    //                tmp.textAlignment = View.TEXT_ALIGNMENT_CENTER

                    scroll_list.addView(tmp)
                }
            )
            reqQueue!!.add(jsonReq)
        }
    }

    private fun addToListTW(view: View)
    {
        val listview = view.findViewById(R.id.match_list) as ListView
        var url = "https://acs-garena.leagueoflegends.com/v1/stats/player_history/TW/${accountId}?begIndex=0&endIndex=20"

        val info: ArrayList<ListView_save> = ArrayList()

        val jsonReq = JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {

                val matchListArr = JSONObject(it["games"].toString()).getJSONArray("games")

                id = JSONObject(matchListArr.getJSONObject(0).getJSONArray("participantIdentities").getJSONObject(0)["player"].toString())["summonerId"].toString()
                sName = JSONObject(matchListArr.getJSONObject(0).getJSONArray("participantIdentities").getJSONObject(0)["player"].toString())["summonerName"].toString()
                val profileIcon = JSONObject(matchListArr.getJSONObject(0).getJSONArray("participantIdentities").getJSONObject(0)["player"].toString())["profileIcon"].toString()

                (view.findViewById(R.id.profile_name) as TextView).text = sName

                val imgReq = ImageRequest("http://ddragon.leagueoflegends.com/cdn/${lol_ver}/img/profileicon/${profileIcon}.png",
                    Response.Listener<Bitmap> {
                        (view.findViewById(R.id.profile_icon) as ImageView).setImageBitmap(it)
                    }, 0, 0, Bitmap.Config.RGB_565, Response.ErrorListener {})
                reqQueue!!.add(imgReq)


                for (i in matchListArr.length()-1 downTo 0)
                {
                    val matchObj = matchListArr.getJSONObject(i)

                    val pArr = matchObj.getJSONArray("participants")
                    val tmpPlayer = pArr.getJSONObject(0)
                    val tmpPlayerStatus = JSONObject(tmpPlayer["stats"].toString())

                    val cId = tmpPlayer["championId"].toString()

                    val cName = JSONObject(idToName[cId].toString())["name"].toString()
                    val cImgRId = resources.getIdentifier(
                        JSONObject(idToName[cId].toString())["id"].toString().toLowerCase(),
                        "drawable",
                        activity?.packageName
                    )
                    val date = SimpleDateFormat(
                        "yyyy-MM-dd",
                        Locale.TAIWAN
                    ).format(Date(matchObj["gameCreation"].toString().toLong()))
                    val time = SimpleDateFormat(
                        "mm:ss",
                        Locale.TAIWAN
                    ).format(Date(matchObj["gameDuration"].toString().toLong() * 1000))
                    val endGame = tmpPlayerStatus["win"].toString().toBoolean()
                    val kda =
                        "${tmpPlayerStatus["kills"]}/${tmpPlayerStatus["deaths"]}/${tmpPlayerStatus["assists"]}"
                    val cs = tmpPlayerStatus["totalMinionsKilled"].toString()
                    val gold = tmpPlayerStatus["goldEarned"].toString()

                    info.add(
                        ListView_save(
                            cName,
                            cImgRId,
                            date,
                            time,
                            endGame,
                            kda,
                            cs,
                            gold
                        )
                    )

                    listview.adapter = CustomAdapter(listview.context, info)
                }

                scroll_list.addView(view)
            },
            Response.ErrorListener {})
        reqQueue!!.add(jsonReq)
    }

    private fun addToList(listview: ListView)
    {
        val url = proto + region + hosts + mode["matchList"] + accountId + api_key + "&endIndex=20"

        val info: ArrayList<ListView_save> = ArrayList()

        val jsonReq = JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener {
                val item = it.getJSONArray("matches")
                for (i in 0 until item.length()) {

                    val matchId = item.getJSONObject(i)["gameId"].toString()

                    val url = proto + region + hosts + mode["match"] + matchId + api_key

                    val jsonReq = JsonObjectRequest(Request.Method.GET, url, null,
                        Response.Listener {
                            var inIndex = 0

                            val pIdJSONArr = it.getJSONArray("participantIdentities")

                            for (i in 0 until pIdJSONArr.length()) {
                                val tmpObj = pIdJSONArr.getJSONObject(i)
                                if (JSONObject(tmpObj["player"].toString())["summonerName"].toString() == sName) {
                                    inIndex = tmpObj["participantId"].toString().toInt() - 1
                                    break
                                }
                            }

                            val pArr = it.getJSONArray("participants")
                            val tmpPlayer = pArr.getJSONObject(inIndex)
                            val tmpPlayerStatus = JSONObject(tmpPlayer["stats"].toString())

                            val cId = tmpPlayer["championId"].toString()

                            val cName = JSONObject(idToName[cId].toString())["name"].toString()
                            val cImgRId = resources.getIdentifier(
                                JSONObject(idToName[cId].toString())["id"].toString().toLowerCase(),
                                "drawable",
                                activity?.packageName
                            )
                            val date = SimpleDateFormat(
                                "yyyy-MM-dd",
                                Locale.TAIWAN
                            ).format(Date(it["gameCreation"].toString().toLong()))
                            val time = SimpleDateFormat(
                                "mm:ss",
                                Locale.TAIWAN
                            ).format(Date(it["gameDuration"].toString().toLong() * 1000))
                            val endGame = tmpPlayerStatus["win"].toString().toBoolean()
                            val kda =
                                "${tmpPlayerStatus["kills"]}/${tmpPlayerStatus["deaths"]}/${tmpPlayerStatus["assists"]}"
                            val cs = tmpPlayerStatus["totalMinionsKilled"].toString()
                            val gold = tmpPlayerStatus["goldEarned"].toString()

                            info.add(
                                ListView_save(
                                    cName,
                                    cImgRId,
                                    date,
                                    time,
                                    endGame,
                                    kda,
                                    cs,
                                    gold
                                )
                            )

                            listview.adapter = CustomAdapter(listview.context, info)
                        },
                        Response.ErrorListener {})
                    reqQueue!!.add(jsonReq)
                }
            },
            Response.ErrorListener {})
        reqQueue!!.add(jsonReq)
    }
}





data class ListView_save(
    val cName: String,
    val cImgRId: Int,
    val date: String,
    val time: String,
    val endGame: Boolean,
    val kda: String,
    val cs: String,
    val gold: String
)

class CustomAdapter(val context: Context, val champion:ArrayList<ListView_save>):BaseAdapter() {

    private class ViewHolder(row:View?){
        var txtName : TextView = row?.findViewById(R.id.championName) as TextView
        var ivImage : ImageView = row?.findViewById(R.id.championPic) as ImageView
        var txtMatchend : TextView = row?.findViewById(R.id.matchEnd_id) as TextView
        var txtScore : TextView = row?.findViewById(R.id.Scroe_id) as TextView
        var txtCs : TextView = row?.findViewById(R.id.cs_id) as TextView
        var txtMoney : TextView = row?.findViewById(R.id.money_id) as TextView
        var txtDate : TextView = row?.findViewById(R.id.date_id) as TextView
        var txtTime : TextView = row?.findViewById(R.id.time_id) as TextView
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if(convertView==null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.match_list_row,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }


        val info: ListView_save = getItem(position) as ListView_save

        viewHolder.txtName.text = info.cName
        viewHolder.ivImage.setImageResource(info.cImgRId)
        viewHolder.txtDate.text = info.date
        viewHolder.txtTime.text = info.time
        viewHolder.txtScore.text = info.kda
        viewHolder.txtCs.text = info.cs
        viewHolder.txtMoney.text = info.gold

        if(info.endGame == true)
        {
            viewHolder.txtMatchend.text = "VICTORY"
            viewHolder.txtMatchend.setTextColor("#00ff00".toColorInt())
        }
        else
        {
            viewHolder.txtMatchend.text = "DEFEAT"
            viewHolder.txtMatchend.setTextColor("#ff0000".toColorInt())
        }

        return  view as View
    }

    override fun getItem(position: Int): Any {
        return champion[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return champion.count()
    }
}