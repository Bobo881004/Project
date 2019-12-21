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
                data.summonerspell1 = "teleport"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.startitem2 = "i2003"
                data.startitem3 = "i3340"
                data.summonerspell1 = "smite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "heal"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "shield"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "ignite"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "heal"
                data.summonerspell2 = "flash"
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
                data.summonerspell1 = "teleport"
                data.summonerspell2 = "flash"
                intent.putExtra("champion_data", data)
                startActivity(intent)
            }
        }
    }

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
                R.id.nav_home, R.id.nav_search, R.id.nav_statistics,
                R.id.nav_popular
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
}
