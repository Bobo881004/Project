package com.example.meilolbook.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.meilolbook.*

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager, var champion_data : champion) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return HomeActivity(champion_data)
            1 -> return SkillActivity(champion_data)
            else -> return RuneActivity()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Home"
            1 -> return "Skill"
            2 -> return "Rune"
        }
        return null
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}