package com.example.meilolbook

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class HomeActivity(var champion_name : String?) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var name = champion_name
        val root =inflater.inflate(R.layout.champion_home,container,false)
        var champion_picture = root.findViewById(R.id.use_this) as ImageView
        var drawableid = resources.getIdentifier(name,"drawable",activity?.getPackageName())
        Log.i("findme_HomeActivity","圖片_aatorx_drawableid 為" + drawableid)
        champion_picture.setImageResource(drawableid)

        return root
    }
}