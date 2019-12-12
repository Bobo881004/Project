package com.example.meilolbook.ui.statistics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatisticsViewModel : ViewModel() {

    val hero_model : MutableList<Hero_Model> = arrayListOf()

    fun sethero()
    {
        val tmp = Hero_Model()
        tmp.heroPosition = 0
        tmp.heroTier = 0
        tmp.heroName = "mordekaiser"
        tmp.heroST = 12.38
        hero_model.add(tmp)
        val tmp2 = Hero_Model()
        tmp2.heroPosition = 1
        tmp2.heroTier = 0
        tmp2.heroName = "leesin"
        tmp2.heroST = 38.62
        hero_model.add(tmp2)
        val tmp3 = Hero_Model()
        tmp3.heroPosition = 2
        tmp3.heroTier = 0
        tmp3.heroName = "ryze"
        tmp3.heroST = 11.64
        hero_model.add(tmp3)
        val tmp4 = Hero_Model()
        tmp4.heroPosition = 3
        tmp4.heroTier = 0
        tmp4.heroName = "ezreal"
        tmp4.heroST = 20.16
        hero_model.add(tmp4)
        val tmp5 = Hero_Model()
        tmp5.heroPosition = 4
        tmp5.heroTier = 0
        tmp5.heroName = "leona"
        tmp5.heroST = 14.41
        hero_model.add(tmp5)
    }

    fun getlen(): Int
    {
        return hero_model.size
    }
    fun getheroPosition(n : Int): Int
    {
        return hero_model[n].heroPosition
    }
    fun getherTier(n : Int): Int
    {
        return hero_model[n].heroTier
    }
    fun getheroName(n : Int): String
    {
        return hero_model[n].heroName
    }
    fun getheroST(n: Int): Double
    {
        return hero_model[n].heroST
    }
}