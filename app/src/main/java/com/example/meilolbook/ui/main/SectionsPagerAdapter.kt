package com.example.meilolbook.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.meilolbook.HomeActivity
import com.example.meilolbook.LaneActivity
import com.example.meilolbook.R
import com.example.meilolbook.RoutineActivity

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return HomeActivity()
            1 -> return RoutineActivity()
            else -> return LaneActivity()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Home"
            1 -> return "Routine"
            2 -> return "Lane"
        }
        return null
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}