package com.example.meilolbook

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class ListClickedActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match_info)
        var getKey = intent.getBundleExtra("bundle").getString("key")
        Log.i("custom_1", getKey)


    }
}