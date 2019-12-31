package com.example.meilolbook

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.View
import android.content.Intent
import java.io.Serializable

class champion : Serializable{
    var name : String = ""
    var winrate : String = ""
    var pickrate : String = ""
    var position : String = ""
    var skillorder : String = ""
    var item1 : String = ""
    var item2 : String = ""
    var item3 : String = ""
    var item4 : String = ""
    var item5 : String = ""
    var item6 : String = ""
    var startitem1 : String = ""
    var startitem2 : String = ""
    var startitem3 : String = ""
    var summonerspell1 : String = ""
    var summonerspell2 : String = ""

}


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    var data = champion()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_search, R.id.nav_statistics
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    fun click_champion(v: View?){
        when(v?.id) {
            R.id.btn_aatrox -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "aatrox"
                data.winrate = "46.78%"
                data.pickrate = "2.97%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3047"
                data.item2 = "i3071"
                data.item3 = "i3812"
                data.item4 = "i3053"
                data.item5 = "i3026"
                data.item6 = "i3065"
                data.startitem1 = "i1054"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_akali -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "akali"
                data.winrate = "45.12%"
                data.pickrate = "3.42%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3146"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3089"
                data.item5 = "i3157"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_ahri -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "ahri"
                data.winrate = "51.27%"
                data.pickrate = "2.89%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3030"
                data.item2 = "i3020"
                data.item3 = "i3905"
                data.item4 = "i3165"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_alistar -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "alistar"
                data.winrate = "47.13%"
                data.pickrate = "1.28%"
                data.position = "輔助"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3117"
                data.item2 = "i3050"
                data.item3 = "i3109"
                data.item4 = "i3107"
                data.item5 = "i3190"
                data.item6 = "i3860"
                data.startitem1 = "i3858"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_amumu -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "amumu"
                data.winrate = "50.32%"
                data.pickrate = "1.42%"
                data.position = "打野"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i1402"
                data.item2 = "i3020"
                data.item3 = "i3157"
                data.item4 = "i3165"
                data.item5 = "i3151"
                data.item6 = "i3001"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_anivia -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "anivia"
                data.winrate = "51.75%"
                data.pickrate = "0.87%"
                data.position = "中路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3027"
                data.item2 = "i3020"
                data.item3 = "i3048"
                data.item4 = "i3157"
                data.item5 = "i3089"
                data.item6 = "i3151"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_annie-> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "annie"
                data.winrate = "53.28%"
                data.pickrate = "0.63%"
                data.position = "中路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3157"
                data.item4 = "i3165"
                data.item5 = "i3135"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_aphelios -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "aphelios"
                data.winrate = "48.14%"
                data.pickrate = "5.22%"
                data.position = "下路"
                data.skillorder = "Q>W>E"
                data.item1 = "i3508"
                data.item2 = "i3006"
                data.item3 = "i3085"
                data.item4 = "i3031"
                data.item5 = "i3046"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_ashe -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "ashe"
                data.winrate = "52.15%"
                data.pickrate = "4.55%"
                data.position = "下路"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3006"
                data.item2 = "i3153"
                data.item3 = "i3085"
                data.item4 = "i3031"
                data.item5 = "i3046"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_aurelionsol -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "aurelionsol"
                data.winrate = "55.47%"
                data.pickrate = "0.54%"
                data.position = "中路"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3116"
                data.item2 = "i3020"
                data.item3 = "i3151"
                data.item4 = "i3157"
                data.item5 = "i3089"
                data.item6 = "i3165"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_azir -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "azir"
                data.winrate = "45.49%"
                data.pickrate = "0.6%"
                data.position = "中路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3115"
                data.item4 = "i3157"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "SummonerBarrier"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_bard -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "bard"
                data.winrate = "53.07%"
                data.pickrate = "1.89%"
                data.position = "輔助"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3117"
                data.item2 = "i3107"
                data.item3 = "i3190"
                data.item4 = "i3109"
                data.item5 = "i3050"
                data.item6 = "i3853"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_blitzcrank -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "blitzcrank"
                data.winrate = "51.51%"
                data.pickrate = "4.56%"
                data.position = "輔助"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3117"
                data.item2 = "i3050"
                data.item3 = "i3109"
                data.item4 = "i3107"
                data.item5 = "i3193"
                data.item6 = "i3857"
                data.startitem1 = "i3854"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_brand -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "brand"
                data.winrate = "49.46%"
                data.pickrate = "1.68%"
                data.position = "輔助"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3020"
                data.item2 = "i3151"
                data.item3 = "i3116"
                data.item4 = "i3853"
                data.item5 = "i3089"
                data.item6 = "i3157"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_braum -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "braum"
                data.winrate = "48.69%"
                data.pickrate = "1.77%"
                data.position = "輔助"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3117"
                data.item2 = "i3190"
                data.item3 = "i3109"
                data.item4 = "i3050"
                data.item5 = "i3857"
                data.item6 = "i3193"
                data.startitem1 = "i3854"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_caitlyn -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "caitlyn"
                data.winrate = "50.76%"
                data.pickrate = "11.61%"
                data.position = "下路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3095"
                data.item2 = "i3117"
                data.item3 = "i3031"
                data.item4 = "i3094"
                data.item5 = "i3087"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_camille -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "camille"
                data.winrate = "51.62%"
                data.pickrate = "2.07%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3078"
                data.item2 = "i3047"
                data.item3 = "i3074"
                data.item4 = "i3053"
                data.item5 = "i3026"
                data.item6 = "i3065"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_cassiopeia -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "cassiopeia"
                data.winrate = "52.33%"
                data.pickrate = "2.12%"
                data.position = "中路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3027"
                data.item2 = "i3048"
                data.item3 = "i3116"
                data.item4 = "i3151"
                data.item5 = "i3157"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_chogath -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "chogath"
                data.winrate = "52.33%"
                data.pickrate = "2.12%"
                data.position = "中路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3027"
                data.item2 = "i3048"
                data.item3 = "i3116"
                data.item4 = "i3151"
                data.item5 = "i3157"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_corki -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "corki"
                data.winrate = "45.95%"
                data.pickrate = "0.25%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3078"
                data.item2 = "i3020"
                data.item3 = "i3031"
                data.item4 = "i3026"
                data.item5 = "i3094"
                data.item6 = "i3046"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_darius -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "darius"
                data.winrate = "50.88%"
                data.pickrate = "4.56%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3111"
                data.item2 = "i3078"
                data.item3 = "i3053"
                data.item4 = "i3065"
                data.item5 = "i3143"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerhaste"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_diana -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "diana"
                data.winrate = "51.91%"
                data.pickrate = "5.29%"
                data.position = "中路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3027"
                data.item2 = "i3020"
                data.item3 = "i3115"
                data.item4 = "i3157"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_draven -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "draven"
                data.winrate = "%49.42"
                data.pickrate = "1.82%"
                data.position = "下路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3072"
                data.item2 = "i3006"
                data.item3 = "i3031"
                data.item4 = "i3094"
                data.item5 = "i3046"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_drmundo -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "drmundo"
                data.winrate = "51.62%"
                data.pickrate = "1.3%"
                data.position = "打野"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i1413"
                data.item2 = "i3111"
                data.item3 = "i3065"
                data.item4 = "i3075"
                data.item5 = "i3083"
                data.item6 = "i3193"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_ekko -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "ekko"
                data.winrate = "51.96%"
                data.pickrate = "5.23%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1402"
                data.item2 = "i3020"
                data.item3 = "i3152"
                data.item4 = "i3100"
                data.item5 = "i3157"
                data.item6 = "i3089"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_elise -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "elise"
                data.winrate = "50.8%"
                data.pickrate = "3.88%"
                data.position = "打野"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3117"
                data.item2 = "i1402"
                data.item3 = "i3165"
                data.item4 = "i3041"
                data.item5 = "i3157"
                data.item6 = "i3135"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_evelynn -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "evelynn"
                data.winrate = "48.37%"
                data.pickrate = "1.35%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1402"
                data.item2 = "i3020"
                data.item3 = "i3041"
                data.item4 = "i3100"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_ezreal -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "ezreal"
                data.winrate = "47.08%"
                data.pickrate = "4.7%"
                data.position = "下路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3042"
                data.item2 = "i3158"
                data.item3 = "i3078"
                data.item4 = "i3153"
                data.item5 = "i3033"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_fiddlesticks -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "fiddlesticks"
                data.winrate = "49.65%"
                data.pickrate = "1%"
                data.position = "輔助"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3853"
                data.item2 = "i3117"
                data.item3 = "i3116"
                data.item4 = "i3151"
                data.item5 = "i3157"
                data.item6 = "i3089"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_fiora -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "fiora"
                data.winrate = "49.68%"
                data.pickrate = "3.95%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3074"
                data.item2 = "i3111"
                data.item3 = "i3078"
                data.item4 = "i3812"
                data.item5 = "i3053"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_fizz -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "fizz"
                data.winrate = "52.14%"
                data.pickrate = "2.88%"
                data.position = "中路"
                data.skillorder = "R>E>W>Q"
                data.item1 = "i3152"
                data.item2 = "i3020"
                data.item3 = "i3100"
                data.item4 = "i3157"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_galio -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "galio"
                data.winrate = "49.41%"
                data.pickrate = "0.78%"
                data.position = "中路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3020"
                data.item2 = "i3152"
                data.item3 = "i3285"
                data.item4 = "i3157"
                data.item5 = "i3165"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_gangplank -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "gangplank"
                data.winrate = "49.2%"
                data.pickrate = "1.77%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3078"
                data.item2 = "i3047"
                data.item3 = "i3508"
                data.item4 = "i3053"
                data.item5 = "i3031"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_garen -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "garen"
                data.winrate = "49.59%"
                data.pickrate = "2.84%"
                data.position = "上路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3006"
                data.item2 = "i3078"
                data.item3 = "i3046"
                data.item4 = "i3742"
                data.item5 = "i3065"
                data.item6 = "i3053"
                data.startitem1 = "i1054"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_gnar -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "gnar"
                data.winrate = "48.08%"
                data.pickrate = "0.75%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3071"
                data.item2 = "i3111"
                data.item3 = "i3022"
                data.item4 = "i3065"
                data.item5 = "i3143"
                data.item6 = "i3075"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_gragas -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "gragas"
                data.winrate = "47.45%"
                data.pickrate = "1.66%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1402"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3157"
                data.item5 = "i3089"
                data.item6 = "i3102"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_graves -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "graves"
                data.winrate = "50.04%"
                data.pickrate = "2.09%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1412"
                data.item2 = "i3006"
                data.item3 = "i3095"
                data.item4 = "i3046"
                data.item5 = "i3812"
                data.item6 = "i3026"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_hecarim -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "hecarim"
                data.winrate = "50.13%"
                data.pickrate = "1.42%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1400"
                data.item2 = "i3047"
                data.item3 = "i3078"
                data.item4 = "i3053"
                data.item5 = "i3742"
                data.item6 = "i3065"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerhaste"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_heimerdinger -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "heimerdinger"
                data.winrate = "52.44%"
                data.pickrate = "1%"
                data.position = "下路"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3157"
                data.item4 = "i3151"
                data.item5 = "i3116"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_illaoi -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "illaoi"
                data.winrate = "50.15%"
                data.pickrate = "1.31%"
                data.position = "上路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3071"
                data.item2 = "i3047"
                data.item3 = "i3053"
                data.item4 = "i3812"
                data.item5 = "i3026"
                data.item6 = "i3065"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_irelia -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "irelia"
                data.winrate = "46.93%"
                data.pickrate = "2.41%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3078"
                data.item2 = "i3111"
                data.item3 = "i3053"
                data.item4 = "i3748"
                data.item5 = "i3091"
                data.item6 = "i3026"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_ivern -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "ivern"
                data.winrate = "50.85%"
                data.pickrate = "0.42%"
                data.position = "打野"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3117"
                data.item2 = "i3107"
                data.item3 = "i3504"
                data.item4 = "i3905"
                data.item5 = "i3190"
                data.item6 = "i3109"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_janna -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "janna"
                data.winrate = "53.0%"
                data.pickrate = "2.53%"
                data.position = "輔助"
                data.skillorder = "R>W>E>Q"
                data.item1 = "i3117"
                data.item2 = "i3504"
                data.item3 = "i3107"
                data.item4 = "i3905"
                data.item5 = "i3853"
                data.item6 = "i3190"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_jarvaniv -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "jarvaniv"
                data.winrate = "51.27%"
                data.pickrate = "3.31%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1412"
                data.item2 = "i3111"
                data.item3 = "i3071"
                data.item4 = "i3026"
                data.item5 = "i3742"
                data.item6 = "i3053"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_jax -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "jax"
                data.winrate = "51.46%"
                data.pickrate = "2.14%"
                data.position = "上路"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3078"
                data.item2 = "i3111"
                data.item3 = "i3181"
                data.item4 = "i3748"
                data.item5 = "i3053"
                data.item6 = "i3026"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_jayce -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "jayce"
                data.winrate = "46.42%"
                data.pickrate = "0.64%"
                data.position = "上路"
                data.skillorder = "Q>W>E"
                data.item1 = "i3142"
                data.item2 = "i3047"
                data.item3 = "i3147"
                data.item4 = "i3071"
                data.item5 = "i3026"
                data.item6 = "i3814"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_jhin -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "jhin"
                data.winrate = "51.76%"
                data.pickrate = "5.76%"
                data.position = "下路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3009"
                data.item2 = "i3095"
                data.item3 = "i3031"
                data.item4 = "i3094"
                data.item5 = "i3046"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_jinx -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "jinx"
                data.winrate = "51.55%"
                data.pickrate = "4.49%"
                data.position = "下路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3031"
                data.item2 = "i3006"
                data.item3 = "i3085"
                data.item4 = "i3094"
                data.item5 = "i3072"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_kaisa -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "kaisa"
                data.winrate = "48.07%"
                data.pickrate = "9.94%"
                data.position = "下路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3095"
                data.item2 = "i3006"
                data.item3 = "i3124"
                data.item4 = "i3085"
                data.item5 = "i3157"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_kalista -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "kalista"
                data.winrate = "45.65%"
                data.pickrate = "0.5%"
                data.position = "下路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3006"
                data.item2 = "i3153"
                data.item3 = "i3085"
                data.item4 = "i3072"
                data.item5 = "i3026"
                data.item6 = "i3139"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_karma -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "karma"
                data.winrate = "48.52%"
                data.pickrate = "1.96%"
                data.position = "輔助"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3853"
                data.item2 = "i3020"
                data.item3 = "i3504"
                data.item4 = "i3107"
                data.item5 = "i3190"
                data.item6 = "i3157"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_karthus -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "karthus"
                data.winrate = "51.17%"
                data.pickrate = "0.79%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1402"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3089"
                data.item5 = "i3157"
                data.item6 = "i3135"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_kassadin -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "kassadin"
                data.winrate = "52.61%"
                data.pickrate = "3.45%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3048"
                data.item2 = "i3020"
                data.item3 = "i3100"
                data.item4 = "i3157"
                data.item5 = "i3165"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_katarina -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "katarina"
                data.winrate = "50.13%"
                data.pickrate = "2.78%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3146"
                data.item2 = "i3020"
                data.item3 = "i3157"
                data.item4 = "i3089"
                data.item5 = "i3135"
                data.item6 = "i3165"
                data.startitem1 = "i1036"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_kayle -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "kayle"
                data.winrate = "51.93%"
                data.pickrate = "1.36%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3146"
                data.item2 = "i3006"
                data.item3 = "i3115"
                data.item4 = "i3124"
                data.item5 = "i3157"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_kayn -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "kayn"
                data.winrate = "50.2%"
                data.pickrate = "2.52%"
                data.position = "打野"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i1400"
                data.item2 = "i3111"
                data.item3 = "i3071"
                data.item4 = "i3065"
                data.item5 = "i3026"
                data.item6 = "i3814"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_kennen -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "kennen"
                data.winrate = "49.73%"
                data.pickrate = "1.01%"
                data.position = "上路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3152"
                data.item2 = "i3020"
                data.item3 = "i3157"
                data.item4 = "i3165"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_khazix -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "khazix"
                data.winrate = "50.66%"
                data.pickrate = "2.72%"
                data.position = "打野"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i1400"
                data.item2 = "i3117"
                data.item3 = "i3147"
                data.item4 = "i3142"
                data.item5 = "i3814"
                data.item6 = "i3026"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_kindred -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "kindred"
                data.winrate = "49.89%"
                data.pickrate = "1.2%"
                data.position = "打野"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i1412"
                data.item2 = "i3006"
                data.item3 = "i3071"
                data.item4 = "i3085"
                data.item5 = "i3026"
                data.item6 = "i0331"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_kled-> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "kled"
                data.winrate = "51.1%"
                data.pickrate = "1.45%"
                data.position = "上路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3047"
                data.item2 = "i3071"
                data.item3 = "i3748"
                data.item4 = "i3026"
                data.item5 = "i3053"
                data.item6 = "i3065"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_kogmaw -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "kogmaw"
                data.winrate = "49.83%"
                data.pickrate = "0.52%"
                data.position = "下路"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3153"
                data.item2 = "i3006"
                data.item3 = "i3124"
                data.item4 = "i3085"
                data.item5 = "i3031"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_leblanc -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "leblanc"
                data.winrate = "47.74%"
                data.pickrate = "2.55%"
                data.position = "中路"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3041"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_leesin -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "leesin"
                data.winrate = "48.81%"
                data.pickrate = "12.78%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1412"
                data.item2 = "i3117"
                data.item3 = "i3071"
                data.item4 = "i3026"
                data.item5 = "i3156"
                data.item6 = "i3053"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_leona -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "leona"
                data.winrate = "51.68%"
                data.pickrate = "5.19%"
                data.position = "輔助"
                data.skillorder = "R>W>E>Q"
                data.item1 = "i3860"
                data.item2 = "i3117"
                data.item3 = "i3109"
                data.item4 = "i3050"
                data.item5 = "i3190"
                data.item6 = "i3193"
                data.startitem1 = "i3858"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_lissandra -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "lissandra"
                data.winrate = "49.28%"
                data.pickrate = "0.72%"
                data.position = "中路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3152"
                data.item4 = "i3157"
                data.item5 = "i3165"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_lucian -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "lucian"
                data.winrate = "50.32%"
                data.pickrate = "7.34%"
                data.position = "下路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3153"
                data.item2 = "i3006"
                data.item3 = "i3508"
                data.item4 = "i3031"
                data.item5 = "i3094"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_lulu -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "lulu"
                data.winrate = "50.12%"
                data.pickrate = "2.17%"
                data.position = "輔助"
                data.skillorder = "R>E>W>Q"
                data.item1 = "i3853"
                data.item2 = "i3117"
                data.item3 = "i3504"
                data.item4 = "i3107"
                data.item5 = "i3190"
                data.item6 = "i3157"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_lux -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "lux"
                data.winrate = "48.16%"
                data.pickrate = "2.52%"
                data.position = "輔助"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3853"
                data.item2 = "i3285"
                data.item3 = "i3020"
                data.item4 = "i3157"
                data.item5 = "i3165"
                data.item6 = "i3089"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_malphite -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "malphite"
                data.winrate = "52.39%"
                data.pickrate = "1.8%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3068"
                data.item2 = "i3047"
                data.item3 = "i3025"
                data.item4 = "i3001"
                data.item5 = "i3075"
                data.item6 = "i3193"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = "i"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_malzahar -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "malzahar"
                data.winrate = "52.34%"
                data.pickrate = "1.37%"
                data.position = "中路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3285"
                data.item2 = "i3158"
                data.item3 = "i3116"
                data.item4 = "i3151"
                data.item5 = "i3157"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_maokai -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "maokai"
                data.winrate = "52.83%"
                data.pickrate = "0.59%"
                data.position = "上路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3068"
                data.item2 = "i3111"
                data.item3 = "i3065"
                data.item4 = "i3075"
                data.item5 = "i3143"
                data.item6 = "i3800"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_masteryi -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "masteryi"
                data.winrate = "52.24%"
                data.pickrate = "3.55%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1419"
                data.item2 = "i3006"
                data.item3 = "i3124"
                data.item4 = "i3091"
                data.item5 = "i3053"
                data.item6 = "i3026"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_missfortune ->  {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "missfortune"
                data.winrate = "52.41%"
                data.pickrate = "4.17%"
                data.position = "下路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3508"
                data.item2 = "i3006"
                data.item3 = "i3031"
                data.item4 = "i3094"
                data.item5 = "i3072"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_monkeyking -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "monkeyking"
                data.winrate = "45.07%"
                data.pickrate = "0.29%"
                data.position = "打野"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i1400"
                data.item2 = "i3117"
                data.item3 = "i3142"
                data.item4 = "i3147"
                data.item5 = "i3071"
                data.item6 = "i3026"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_mordekaiser -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "mordekaiser"
                data.winrate = "52.24%"
                data.pickrate = "6.13%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3151"
                data.item2 = "i3116"
                data.item3 = "i3111"
                data.item4 = "i3157"
                data.item5 = "i3065"
                data.item6 = "i3165"
                data.startitem1 = "i1054"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_morgana -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "morgana"
                data.winrate = "49.61%"
                data.pickrate = "4.27%"
                data.position = "輔助"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3117"
                data.item2 = "i3157"
                data.item3 = "i3107"
                data.item4 = "i3853"
                data.item5 = "i3504"
                data.item6 = "i3190"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_nami -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "nami"
                data.winrate = "51.92%"
                data.pickrate = "2.37%"
                data.position = "輔助"
                data.skillorder = "R>W>E>Q"
                data.item1 = "i3117"
                data.item2 = "i3504"
                data.item3 = "i3107"
                data.item4 = "i3853"
                data.item5 = "i3157"
                data.item6 = "i3190"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_nasus -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "nasus"
                data.winrate = "51.56%"
                data.pickrate = "1.56%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3078"
                data.item2 = "i3111"
                data.item3 = "i3065"
                data.item4 = "i3800"
                data.item5 = "i3075"
                data.item6 = "i3742"
                data.startitem1 = "i1054"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_nautilus -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "nautilus"
                data.winrate = "51.16%"
                data.pickrate = "5.35%"
                data.position = "輔助"
                data.skillorder = "R>E>W>Q"
                data.item1 = "i3117"
                data.item2 = "i3050"
                data.item3 = "i3109"
                data.item4 = "i3860"
                data.item5 = "i3193"
                data.item6 = "i3190"
                data.startitem1 = "i3858"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_neeko -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "neeko"
                data.winrate = "49.22%"
                data.pickrate = "0.52%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3030"
                data.item2 = "i3020"
                data.item3 = "i3905"
                data.item4 = "i3157"
                data.item5 = "i3089"
                data.item6 = "i3165"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_nidalee -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "nidalee"
                data.winrate = "48.19%"
                data.pickrate = "2.29%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1414"
                data.item2 = "i3020"
                data.item3 = "i3100"
                data.item4 = "i3157"
                data.item5 = "i3135"
                data.item6 = "i3089"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_nocturne -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "nocturne"
                data.winrate = "48.19%"
                data.pickrate = "2.29%"
                data.position = "打野"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i1400"
                data.item2 = "i3111"
                data.item3 = "i3181"
                data.item4 = "i3147"
                data.item5 = "i3814"
                data.item6 = "i3026"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_nunu -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "nunu"
                data.winrate = "51.97%"
                data.pickrate = "1.29%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1413"
                data.item2 = "i3047"
                data.item3 = "i3742"
                data.item4 = "i3065"
                data.item5 = "i3193"
                data.item6 = "i3083"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_olaf -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "olaf"
                data.winrate = "50.89%"
                data.pickrate = "3.71%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1400"
                data.item2 = "i3047"
                data.item3 = "i3071"
                data.item4 = "i3026"
                data.item5 = "i3800"
                data.item6 = "i3065"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_orianna -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "orianna"
                data.winrate = "49.71%"
                data.pickrate = "2.53%"
                data.position = "中路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3041"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_ornn -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "ornn"
                data.winrate = "52.41%"
                data.pickrate = "2.95%"
                data.position = "上路"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3001"
                data.item2 = "i3111"
                data.item3 = "i3068"
                data.item4 = "i3083"
                data.item5 = "i3075"
                data.item6 = "i3193"
                data.startitem1 = "i1054"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_pantheon -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "pantheon"
                data.winrate = "47.72%"
                data.pickrate = "0.85%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3142"
                data.item2 = "i3047"
                data.item3 = "i3071"
                data.item4 = "i3026"
                data.item5 = "i3053"
                data.item6 = "i3156"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_poppy -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "poppy"
                data.winrate = "50.03%"
                data.pickrate = "0.76%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3047"
                data.item2 = "i3068"
                data.item3 = "i3025"
                data.item4 = "i3065"
                data.item5 = "i3193"
                data.item6 = "i3075"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_pyke -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "pyke"
                data.winrate = "47.58%"
                data.pickrate = "4.12%"
                data.position = "輔助"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3117"
                data.item2 = "i3857"
                data.item3 = "i3142"
                data.item4 = "i3026"
                data.item5 = "i3814"
                data.item6 = "i3156"
                data.startitem1 = "i3854"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_qiyana -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "qiyana"
                data.winrate = "48.35%"
                data.pickrate = "2.15%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3117"
                data.item2 = "i3147"
                data.item3 = "i3142"
                data.item4 = "i3179"
                data.item5 = "i3814"
                data.item6 = "i3026"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_quinn -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "quinn"
                data.winrate = "51.8%"
                data.pickrate = "1.27%"
                data.position = "上路"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3181"
                data.item2 = "i3006"
                data.item3 = "i3095"
                data.item4 = "i3031"
                data.item5 = "i3046"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_rakan -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "rakan"
                data.winrate = "51.24%"
                data.pickrate = "1.94%"
                data.position = "輔助"
                data.skillorder = "R>W>E>Q"
                data.item1 = "i3117"
                data.item2 = "i3050"
                data.item3 = "i3107"
                data.item4 = "i3109"
                data.item5 = "i3190"
                data.item6 = "i3860"
                data.startitem1 = "i3858"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_rammus -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "rammus"
                data.winrate = "50.66%"
                data.pickrate = "0.98%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1401"
                data.item2 = "i3047"
                data.item3 = "i3075"
                data.item4 = "i3742"
                data.item5 = "i3193"
                data.item6 = "i3800"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_reksai -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "reksai"
                data.winrate = "51.09%"
                data.pickrate = "2.19%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1400"
                data.item2 = "i3111"
                data.item3 = "i3071"
                data.item4 = "i3026"
                data.item5 = "i3053"
                data.item6 = "i3065"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_renekton -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "renekton"
                data.winrate = "49.67%"
                data.pickrate = "2.77%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3047"
                data.item2 = "i3071"
                data.item3 = "i3053"
                data.item4 = "i3026"
                data.item5 = "i3065"
                data.item6 = "i3074"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_rengar -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "rengar"
                data.winrate = "49.43%"
                data.pickrate = "1.44%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3147"
                data.item2 = "i3158"
                data.item3 = "i3814"
                data.item4 = "i3036"
                data.item5 = "i3046"
                data.item6 = "i3074"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_riven -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "riven"
                data.winrate = "49.98%"
                data.pickrate = "2.09%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3071"
                data.item2 = "i3047"
                data.item3 = "i3812"
                data.item4 = "i3026"
                data.item5 = "i3053"
                data.item6 = "i3033"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_rumble -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "rumble"
                data.winrate = "48.88%"
                data.pickrate = "0.67%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3151"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3157"
                data.item5 = "i3135"
                data.item6 = "i3089"
                data.startitem1 = "i1054"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_ryze -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "ryze"
                data.winrate = "46.23%"
                data.pickrate = "3.49%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3027"
                data.item2 = "i3048"
                data.item3 = "i3020"
                data.item4 = "i3165"
                data.item5 = "i3157"
                data.item6 = "i3089"
                data.startitem1 = "i1027"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_sejuani -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "sejuani"
                data.winrate = "47.02%"
                data.pickrate = "0.47%"
                data.position = "打野"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i1401"
                data.item2 = "i3047"
                data.item3 = "i3083"
                data.item4 = "i3143"
                data.item5 = "i3193"
                data.item6 = "i3075"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_senna -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "senna"
                data.winrate = "49%"
                data.pickrate = "5.53%"
                data.position = "輔助"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3864"
                data.item2 = "i3009"
                data.item3 = "i3142"
                data.item4 = "i3094"
                data.item5 = "i3031"
                data.item6 = "i3026"
                data.startitem1 = "i3862"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_shaco -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "shaco"
                data.winrate = "52.45%"
                data.pickrate = "2.46%"
                data.position = "打野"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i1400"
                data.item2 = "i3117"
                data.item3 = "i3147"
                data.item4 = "i3142"
                data.item5 = "i3026"
                data.item6 = "i3074"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerdot"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_shen -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "shen"
                data.winrate = "50.88%"
                data.pickrate = "1.4%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3047"
                data.item2 = "i3068"
                data.item3 = "i3748"
                data.item4 = "i3065"
                data.item5 = "i3075"
                data.item6 = "i3143"
                data.startitem1 = "i1054"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_shyvana -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "shyvana"
                data.winrate = "49.39%"
                data.pickrate = "0.84%"
                data.position = "打野"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i1402"
                data.item2 = "i3020"
                data.item3 = "i3115"
                data.item4 = "i3165"
                data.item5 = "i3089"
                data.item6 = "i3157"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_singed -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "singed"
                data.winrate = "52.19%"
                data.pickrate = "1.28%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3111"
                data.item2 = "i3116"
                data.item3 = "i3151"
                data.item4 = "i3800"
                data.item5 = "i3065"
                data.item6 = "i3742"
                data.startitem1 = "i1082"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerhaste"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_sion -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "sion"
                data.winrate = "51.33%"
                data.pickrate = "0.57%"
                data.position = "上路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3068"
                data.item2 = "i3047"
                data.item3 = "i3075"
                data.item4 = "i3065"
                data.item5 = "i3193"
                data.item6 = "i3083"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_sivir -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "sivir"
                data.winrate = "49.51%"
                data.pickrate = "1.45%"
                data.position = "下路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3508"
                data.item2 = "i3006"
                data.item3 = "i3031"
                data.item4 = "i3094"
                data.item5 = "i3072"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_skarner -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "skarner"
                data.winrate = "51.38%"
                data.pickrate = "0.23%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1400"
                data.item2 = "i3111"
                data.item3 = "i3078"
                data.item4 = "i3053"
                data.item5 = "i3742"
                data.item6 = "i3194"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_sona -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "sona"
                data.winrate = "51.42%"
                data.pickrate = "0.74%"
                data.position = "輔助"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3853"
                data.item2 = "i3117"
                data.item3 = "i3107"
                data.item4 = "i3190"
                data.item5 = "i3504"
                data.item6 = "i3157"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_soraka -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "soraka"
                data.winrate = "53.08%"
                data.pickrate = "4.6%"
                data.position = "輔助"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3853"
                data.item2 = "i3158"
                data.item3 = "i3107"
                data.item4 = "i3190"
                data.item5 = "i3157"
                data.item6 = "i3504"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_swain -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "swain"
                data.winrate = "49.99%"
                data.pickrate = "2.08%"
                data.position = "輔助"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3020"
                data.item2 = "i3853"
                data.item3 = "i3151"
                data.item4 = "i3157"
                data.item5 = "i3165"
                data.item6 = "i3116"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_sylas -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "sylas"
                data.winrate = "44.64%"
                data.pickrate = "0.83%"
                data.position = "中路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3152"
                data.item2 = "i3020"
                data.item3 = "i3285"
                data.item4 = "i3157"
                data.item5 = "i3089"
                data.item6 = "i3165"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_syndra -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "syndra"
                data.winrate = "48.96%"
                data.pickrate = "2.01%"
                data.position = "中路"
                data.skillorder = "R>QE>W"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3089"
                data.item5 = "i3157"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_tahmkench -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "tahmkench"
                data.winrate = "43.4%"
                data.pickrate = "0.27%"
                data.position = "輔助"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3109"
                data.item2 = "i3111"
                data.item3 = "i3190"
                data.item4 = "i3860"
                data.item5 = "i3193"
                data.item6 = "i3065"
                data.startitem1 = "i3858"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_taliyah -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "taliyah"
                data.winrate = "50.34%"
                data.pickrate = "0.41%"
                data.position = "打野"
                data.skillorder = "R>Q>Q>W"
                data.item1 = "i1402"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3157"
                data.item5 = "i3135"
                data.item6 = "i3089"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_talon -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "talon"
                data.winrate = "50.95%"
                data.pickrate = "2.13%"
                data.position = "中路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3117"
                data.item2 = "i3147"
                data.item3 = "i3142"
                data.item4 = "i3814"
                data.item5 = "i3026"
                data.item6 = "i3074"
                data.startitem1 = "i1036"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_taric -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "taric"
                data.winrate = "54.1%"
                data.pickrate = "0.56%"
                data.position = "輔助"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3860"
                data.item2 = "i3111"
                data.item3 = "i3190"
                data.item4 = "i3107"
                data.item5 = "i3050"
                data.item6 = "i3193"
                data.startitem1 = "i3858"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_teemo -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "teemo"
                data.winrate = "50.96%"
                data.pickrate = "1.82%"
                data.position = "上路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3151"
                data.item2 = "i3020"
                data.item3 = "i3115"
                data.item4 = "i3165"
                data.item5 = "i3135"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_thresh -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "thresh"
                data.winrate = "49.46%"
                data.pickrate = "9.05%"
                data.position = "輔助"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3117"
                data.item2 = "i3050"
                data.item3 = "i3857"
                data.item4 = "i3107"
                data.item5 = "i3109"
                data.item6 = "i3190"
                data.startitem1 = "i3854"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_tristana -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "tristana"
                data.winrate = "49.65%"
                data.pickrate = "2.19%"
                data.position = "下路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3031"
                data.item2 = "i3006"
                data.item3 = "i3094"
                data.item4 = "i3087"
                data.item5 = "i3072"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_trundle -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "trundle"
                data.winrate = "49.33%"
                data.pickrate = "0.45%"
                data.position = "打野"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i1400"
                data.item2 = "i3111"
                data.item3 = "i3078"
                data.item4 = "i3065"
                data.item5 = "i3748"
                data.item6 = "i3143"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_tryndamere -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "tryndamere"
                data.winrate = "49.17%"
                data.pickrate = "2.13%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3006"
                data.item2 = "i3508"
                data.item3 = "i3031"
                data.item4 = "i3078"
                data.item5 = "i3033"
                data.item6 = "i3074"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_twistedfate -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "twistedfate"
                data.winrate = "51.1%"
                data.pickrate = "2.26%"
                data.position = "中路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3027"
                data.item2 = "i3111"
                data.item3 = "i3100"
                data.item4 = "i3157"
                data.item5 = "i3165"
                data.item6 = "i3089"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_twitch -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "twitch"
                data.winrate = "52.22%"
                data.pickrate = "0.97%"
                data.position = "下路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3153"
                data.item2 = "i3006"
                data.item3 = "i3085"
                data.item4 = "i3031"
                data.item5 = "i3046"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_udyr -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "udyr"
                data.winrate = "51.25%"
                data.pickrate = "0.75%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1400"
                data.item2 = "i3111"
                data.item3 = "i3078"
                data.item4 = "i3053"
                data.item5 = "i3065"
                data.item6 = "i3742"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_urgot -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "urgot"
                data.winrate = "49.98%"
                data.pickrate = "0.8%"
                data.position = "上路"
                data.skillorder = "R>W>E>Q"
                data.item1 = "i3071"
                data.item2 = "i3111"
                data.item3 = "i3812"
                data.item4 = "i3022"
                data.item5 = "i3026"
                data.item6 = "i3075"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_varus -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "varus"
                data.winrate = "47.76%"
                data.pickrate = "1.23%"
                data.position = "下路"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3153"
                data.item2 = "i3006"
                data.item3 = "i3124"
                data.item4 = "i3085"
                data.item5 = "i3031"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_vayne -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "vayne"
                data.winrate = "50.56%"
                data.pickrate = "5.01%"
                data.position = "下路"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i3153"
                data.item2 = "i3006"
                data.item3 = "i3124"
                data.item4 = "i3046"
                data.item5 = "i3031"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_veigar -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "veigar"
                data.winrate = "50.36%"
                data.pickrate = "1.47%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3285"
                data.item2 = "i3030"
                data.item3 = "i3020"
                data.item4 = "i3905"
                data.item5 = "i3089"
                data.item6 = "i3157"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_velkoz -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "velkoz"
                data.winrate = "50.62%"
                data.pickrate = "1.19%"
                data.position = "輔助"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3853"
                data.item4 = "i3157"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_vi -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "vi"
                data.winrate = "51.54%"
                data.pickrate = "1.69%"
                data.position = "打野"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i1400"
                data.item2 = "i3111"
                data.item3 = "i3078"
                data.item4 = "i3053"
                data.item5 = "i3026"
                data.item6 = "i3742"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_viktor -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "viktor"
                data.winrate = "51.51%"
                data.pickrate = "0.98%"
                data.position = "中路"
                data.skillorder = "R>E>Q>W"
                data.item1 = "i3198"
                data.item2 = "i3020"
                data.item3 = "i3100"
                data.item4 = "i3157"
                data.item5 = "i3165"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_vladimir -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "vladimir"
                data.winrate = "50.96%"
                data.pickrate = "2.48%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3152"
                data.item2 = "i3020"
                data.item3 = "i3089"
                data.item4 = "i3157"
                data.item5 = "i3165"
                data.item6 = "i3135"
                data.startitem1 = "i1082"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_volibear -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "volibear"
                data.winrate = "50.17%"
                data.pickrate = "0.64%"
                data.position = "打野"
                data.skillorder = "R>W>Q>E"
                data.item1 = "i1401"
                data.item2 = "i3111"
                data.item3 = "i3800"
                data.item4 = "i3065"
                data.item5 = "i3075"
                data.item6 = "i3053"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_warwick -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "warwick"
                data.winrate = "52.35%"
                data.pickrate = "2.49%"
                data.position = "打野"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i1401"
                data.item2 = "i3047"
                data.item3 = "i3748"
                data.item4 = "i3065"
                data.item5 = "i3742"
                data.item6 = "i3026"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_xayah -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "xayah"
                data.winrate = "48.43%"
                data.pickrate = "3.6%"
                data.position = "下路"
                data.skillorder = "R>E>W>Q"
                data.item1 = "i3508"
                data.item2 = "i3006"
                data.item3 = "i3031"
                data.item4 = "i3094"
                data.item5 = "i3046"
                data.item6 = "i3026"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerheal"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_xerath -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "xerath"
                data.winrate = "48.56%"
                data.pickrate = "1.34%"
                data.position = "輔助"
                data.skillorder = "R>Q>W>E"
                data.item1 = "i3285"
                data.item2 = "i3853"
                data.item3 = "i3020"
                data.item4 = "i3165"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_xinzhao -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "xinzhao"
                data.winrate = "51.11%"
                data.pickrate = "1.49%"
                data.position = "打野"
                data.skillorder = "R>W>E>Q"
                data.item1 = "i1412"
                data.item2 = "i3006"
                data.item3 = "i3078"
                data.item4 = "i3026"
                data.item5 = "i3053"
                data.item6 = "i3742"
                data.startitem1 = "i1041"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_yasuo -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "yasuo"
                data.winrate = "49.34%"
                data.pickrate = "5.19%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3006"
                data.item2 = "i3087"
                data.item3 = "i3031"
                data.item4 = "i3026"
                data.item5 = "i3053"
                data.item6 = "i3033"
                data.startitem1 = "i1055"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_yorick -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "yorick"
                data.winrate = "52.11%"
                data.pickrate = "1.08%"
                data.position = "上路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3078"
                data.item2 = "i3111"
                data.item3 = "i3053"
                data.item4 = "i3065"
                data.item5 = "i3143"
                data.item6 = "i3742"
                data.startitem1 = "i2033"
                data.startitem2 = "i3340"
                data.startitem3 = ""
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_yuumi -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "yuumi"
                data.winrate = "46.42%"
                data.pickrate = "1.45%"
                data.position = "輔助"
                data.skillorder = "R>E>W>Q"
                data.item1 = "i3853"
                data.item2 = "i3504"
                data.item3 = "i3107"
                data.item4 = "i3041"
                data.item5 = "i3905"
                data.item6 = "i3089"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "SummonerExhaust"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_zac -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "zac"
                data.winrate = "51.97%"
                data.pickrate = "2.15%"
                data.position = "打野"
                data.skillorder = "R>E>W>Q"
                data.item1 = "i1401"
                data.item2 = "i3047"
                data.item3 = "i3083"
                data.item4 = "i3075"
                data.item5 = "i3193"
                data.item6 = "i3065"
                data.startitem1 = "i1039"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonersmite"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_zed -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "zed"
                data.winrate = "49.47%"
                data.pickrate = "3.54%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3142"
                data.item2 = "i3147"
                data.item3 = "i3117"
                data.item4 = "i3814"
                data.item5 = "i3071"
                data.item6 = "i3026"
                data.startitem1 = "i1036"
                data.startitem2 = "i2031"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_ziggs -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "ziggs"
                data.winrate = "50.47%"
                data.pickrate = "0.44%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3151"
                data.item5 = "i3157"
                data.item6 = "i3089"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerteleport"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_zilean -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "zilean"
                data.winrate = "50.89%"
                data.pickrate = "1.18%"
                data.position = "輔助"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3117"
                data.item2 = "i3030"
                data.item3 = "i3905"
                data.item4 = "i3157"
                data.item5 = "i3853"
                data.item6 = "i3089"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_zoe -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "zoe"
                data.winrate = "49.72%"
                data.pickrate = "1.41%"
                data.position = "中路"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3285"
                data.item2 = "i3020"
                data.item3 = "i3165"
                data.item4 = "i3041"
                data.item5 = "i3089"
                data.item6 = "i3135"
                data.startitem1 = "i1056"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
            R.id.btn_zyra -> {
                var intent = Intent(this, champion_intro::class.java)
                data.name = "zyra"
                data.winrate = "50.42%"
                data.pickrate = "%1.59"
                data.position = "輔助"
                data.skillorder = "R>Q>E>W"
                data.item1 = "i3020"
                data.item2 = "i3151"
                data.item3 = "i3853"
                data.item4 = "i3116"
                data.item5 = "i3135"
                data.item6 = "i3089"
                data.startitem1 = "i3850"
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "summonerdot"
                data.summonerspell2 = "summonerflash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }




        }
    }
}
