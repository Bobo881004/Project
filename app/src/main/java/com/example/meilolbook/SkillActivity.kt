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

        var spell_pname = root.findViewById(R.id.description_p) as TextView
        var spell_pnameid = resources.getIdentifier(name+"_spell_p","string",activity?.getPackageName())
        spell_pname.setText(spell_pnameid)

        var desc_p = root.findViewById(R.id.description_p) as TextView
        var desc_pid = resources.getIdentifier(name+"_desc_p","string",activity?.getPackageName())
        desc_p.setText(desc_pid)




        var spell_qic = root.findViewById(R.id.spell_q) as ImageView
        var spell_qicid = resources.getIdentifier(name+"_q","drawable",activity?.getPackageName())
        spell_qic.setImageResource(spell_qicid)

        var spell_qname = root.findViewById(R.id.description_q) as TextView
        var spell_qnameid = resources.getIdentifier(name+"_spell_q","string",activity?.getPackageName())
        spell_qname.setText(spell_qnameid)

        var desc_q = root.findViewById(R.id.description_q) as TextView
        var desc_qid = resources.getIdentifier(name+"_desc_q","string",activity?.getPackageName())
        desc_q.setText(desc_qid)


        return root
    }
}