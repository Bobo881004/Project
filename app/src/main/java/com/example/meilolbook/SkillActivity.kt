package com.example.meilolbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.champion_skill.*

class SkillActivity(var data : champion) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var root =inflater.inflate(R.layout.champion_skill,container,false)

        var name = data.name
        var skillorder = data.skillorder

        var text_skillorder = root.findViewById(R.id.skill_order) as TextView
        text_skillorder.setText("技能點法:" + skillorder)

        var spell_ppic = root.findViewById(R.id.spell_p) as ImageView
        var spell_ppicid = resources.getIdentifier(name+"_p","drawable",activity?.getPackageName())
        spell_ppic.setImageResource(spell_ppicid)


        var desc_p = root.findViewById(R.id.description_p) as TextView
        var desc_pid = resources.getIdentifier(name+"_desc_p","string",activity?.getPackageName())
        desc_p.setText(desc_pid)


        var spell_qic = root.findViewById(R.id.spell_q) as ImageView
        var spell_qicid = resources.getIdentifier(name+"_q","drawable",activity?.getPackageName())
        spell_qic.setImageResource(spell_qicid)

        var desc_q = root.findViewById(R.id.description_q) as TextView
        var desc_qid = resources.getIdentifier(name+"_desc_q","string",activity?.getPackageName())
        desc_q.setText(desc_qid)



        var spell_wic = root.findViewById(R.id.spell_w) as ImageView
        var spell_wicid = resources.getIdentifier(name+"_w","drawable",activity?.getPackageName())
        spell_wic.setImageResource(spell_wicid)


        var desc_w = root.findViewById(R.id.description_w) as TextView
        var desc_wid = resources.getIdentifier(name+"_desc_w","string",activity?.getPackageName())
        desc_w.setText(desc_wid)



        var spell_eic = root.findViewById(R.id.spell_e) as ImageView
        var spell_eicid = resources.getIdentifier(name+"_e","drawable",activity?.getPackageName())
        spell_eic.setImageResource(spell_eicid)


        var desc_e = root.findViewById(R.id.description_e) as TextView
        var desc_eid = resources.getIdentifier(name+"_desc_e","string",activity?.getPackageName())
        desc_e.setText(desc_eid)



        var spell_ric = root.findViewById(R.id.spell_r) as ImageView
        var spell_ricid = resources.getIdentifier(name+"_r","drawable",activity?.getPackageName())
        spell_ric.setImageResource(spell_ricid)

        var desc_r = root.findViewById(R.id.description_r) as TextView
        var desc_rid = resources.getIdentifier(name+"_desc_r","string",activity?.getPackageName())
        desc_r.setText(desc_rid)


        return root
    }
}