package com.example.meilolbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SkillActivity(var data : champion) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var name = data.name
        var root =inflater.inflate(R.layout.champion_skill,container,false)
        var tv = root.findViewById(R.id.skill_order) as TextView
        var stringid = resources.getIdentifier(name,"string",activity?.getPackageName())
        //tv.setText(stringid)



        return root
    }
}