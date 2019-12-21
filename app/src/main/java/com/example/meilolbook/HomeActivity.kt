package com.example.meilolbook

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class HomeActivity(var data : champion) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var name = data.name
        var winrate = data.winrate
        var pickrate = data.pickrate
        var position = data.position
        var item1 = data.item1
        var item2 = data.item2
        var item3 = data.item3
        var item4 = data.item4
        var item5 = data.item5
        var item6 = data.item6
        var start1 = data.startitem1
        var start2 = data.startitem2
        var start3 = data.startitem3
        var summonerspell1 = data.summonerspell1
        var summonerspell2 = data.summonerspell2


        val root =inflater.inflate(R.layout.champion_home,container,false)

        var champion_picture = root.findViewById(R.id.input_picture) as ImageView
        var champion_picture_id = resources.getIdentifier(name,"drawable",activity?.getPackageName())
        champion_picture.setImageResource(champion_picture_id)


        var champion_winrate = root.findViewById(R.id.input_winrate) as TextView
        champion_winrate.setText(winrate)


        var champion_pickrate = root.findViewById(R.id.input_pickrate) as TextView
        champion_pickrate.setText(pickrate)


        var champion_position = root.findViewById(R.id.input_position) as TextView
        champion_position.setText(position)


        var champion_item1 = root.findViewById(R.id.item1) as ImageView
        var champion_item1_id = resources.getIdentifier(item1,"drawable",activity?.getPackageName())
        champion_item1.setImageResource(champion_item1_id)


        var champion_item2 = root.findViewById(R.id.item2) as ImageView
        var champion_item2_id = resources.getIdentifier(item2,"drawable",activity?.getPackageName())
        champion_item2.setImageResource(champion_item2_id)

        var champion_item3 = root.findViewById(R.id.item3) as ImageView
        var champion_item3_id = resources.getIdentifier(item3,"drawable",activity?.getPackageName())
        champion_item3.setImageResource(champion_item3_id)

        var champion_item4 = root.findViewById(R.id.item4) as ImageView
        var champion_item4_id = resources.getIdentifier(item4,"drawable",activity?.getPackageName())
        champion_item4.setImageResource(champion_item4_id)

        var champion_item5 = root.findViewById(R.id.item5) as ImageView
        var champion_item5_id = resources.getIdentifier(item5,"drawable",activity?.getPackageName())
        champion_item5.setImageResource(champion_item5_id)

        var champion_item6 = root.findViewById(R.id.item6) as ImageView
        var champion_item6_id = resources.getIdentifier(item6,"drawable",activity?.getPackageName())
        champion_item6.setImageResource(champion_item6_id)



        var champion_startitem1 = root.findViewById(R.id.start_item1) as ImageView
        var champion_startitem1_id = resources.getIdentifier(start1,"drawable",activity?.getPackageName())
        champion_startitem1.setImageResource(champion_startitem1_id)


        var champion_startitem2 = root.findViewById(R.id.start_item2) as ImageView
        var champion_startitem2_id = resources.getIdentifier(start2,"drawable",activity?.getPackageName())
        champion_startitem2.setImageResource(champion_startitem2_id)


        var champion_startitem3 = root.findViewById(R.id.start_item3) as ImageView
        var champion_startitem3_id = resources.getIdentifier(start3,"drawable",activity?.getPackageName())
        champion_startitem3.setImageResource(champion_startitem3_id)

        var champion_summonerspell1 = root.findViewById(R.id.summoner_spell1) as ImageView
        var champion_summonerspell1_id = resources.getIdentifier(summonerspell1,"drawable",activity?.getPackageName())
        champion_summonerspell1.setImageResource(champion_summonerspell1_id)


        var champion_summonerspell2 = root.findViewById(R.id.summoner_spell2) as ImageView
        var champion_summonerspell2_id = resources.getIdentifier(summonerspell2,"drawable",activity?.getPackageName())
        champion_summonerspell2.setImageResource(champion_summonerspell2_id)



        var champion_story = root.findViewById(R.id.champion_story) as TextView
        var champion_storyid = resources.getIdentifier(name,"string",activity?.getPackageName())
        champion_story.setText(champion_storyid)



        return root
    }
}