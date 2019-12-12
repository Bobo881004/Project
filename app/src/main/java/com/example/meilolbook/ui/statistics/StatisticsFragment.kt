package com.example.meilolbook.ui.statistics


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.meilolbook.R
import kotlinx.android.synthetic.main.fragment_statistics.*


class StatisticsFragment : Fragment() {

    private lateinit var statisticsViewModel: StatisticsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        statisticsViewModel =
            ViewModelProviders.of(this).get(StatisticsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_statistics, container, false)

        val heroNameform : MutableList<MutableList<ImageView>> = arrayListOf()
        val heroSTform : MutableList<MutableList<TextView>> = arrayListOf()
        val heroName_id = listOf(
            listOf(R.id.image_top_1, R.id.image_top_2, R.id.image_top_3, R.id.image_top_4, R.id.image_top_5, R.id.image_top_6, R.id.image_top_7, R.id.image_top_8, R.id.image_top_9, R.id.image_top_10),
            listOf(R.id.image_jg_1, R.id.image_jg_2, R.id.image_jg_3, R.id.image_jg_4, R.id.image_jg_5, R.id.image_jg_6, R.id.image_jg_7, R.id.image_jg_8, R.id.image_jg_9, R.id.image_jg_10),
            listOf(R.id.image_mid_1, R.id.image_mid_2, R.id.image_mid_3, R.id.image_mid_4, R.id.image_mid_5, R.id.image_mid_6, R.id.image_mid_7, R.id.image_mid_8, R.id.image_mid_9, R.id.image_mid_10),
            listOf(R.id.image_adc_1, R.id.image_adc_2, R.id.image_adc_3, R.id.image_adc_4, R.id.image_adc_5, R.id.image_adc_6, R.id.image_adc_7, R.id.image_adc_8, R.id.image_adc_9, R.id.image_adc_10),
            listOf(R.id.image_sup_1, R.id.image_sup_2, R.id.image_sup_3, R.id.image_sup_4, R.id.image_sup_5, R.id.image_sup_6, R.id.image_sup_7, R.id.image_sup_8, R.id.image_sup_9, R.id.image_sup_10)
        )
        val heroST_id = listOf(
            listOf(R.id.static_top_1, R.id.static_top_2, R.id.static_top_3, R.id.static_top_4, R.id.static_top_5, R.id.static_top_6, R.id.static_top_7, R.id.static_top_8, R.id.static_top_9, R.id.static_top_10),
            listOf(R.id.static_jg_1, R.id.static_jg_2, R.id.static_jg_3, R.id.static_jg_4, R.id.static_jg_5, R.id.static_jg_6, R.id.static_jg_7, R.id.static_jg_8, R.id.static_jg_9, R.id.static_jg_10),
            listOf(R.id.static_mid_1, R.id.static_mid_2, R.id.static_mid_3, R.id.static_mid_4, R.id.static_mid_5, R.id.static_mid_6, R.id.static_mid_7, R.id.static_mid_8, R.id.static_mid_9, R.id.static_mid_10),
            listOf(R.id.static_adc_1, R.id.static_adc_2, R.id.static_adc_3, R.id.static_adc_4, R.id.static_adc_5, R.id.static_adc_6, R.id.static_adc_7, R.id.static_adc_8, R.id.static_adc_9, R.id.static_adc_10),
            listOf(R.id.static_sup_1, R.id.static_sup_2, R.id.static_sup_3, R.id.static_sup_4, R.id.static_sup_5, R.id.static_sup_6, R.id.static_sup_7, R.id.static_sup_8, R.id.static_sup_9, R.id.static_sup_10)
        )
        for(i in 0 until 5)
        {
            val Nametmp: MutableList<ImageView> = arrayListOf()
            val STtmp : MutableList<TextView> = arrayListOf()
            for(j in 0 until 10)
            {
                Nametmp.add(root.findViewById(heroName_id[i][j]))
                STtmp.add(root.findViewById(heroST_id[i][j]))
            }
            heroNameform.add(Nametmp)
            heroSTform.add(STtmp)
        }

        statisticsViewModel.sethero()
        val len = statisticsViewModel.getlen()
        for(i in 0 until len)
        {
            var row = statisticsViewModel.getheroPosition(i)
            var col = statisticsViewModel.getherTier(i)
            var id = getResources().getIdentifier(statisticsViewModel.getheroName(i), "drawable", getActivity()?.getPackageName())
            heroNameform[row][col].setImageResource(id)
            heroSTform[row][col].setText("" + statisticsViewModel.getheroST(i) +"%")
        }
        return root
    }
}