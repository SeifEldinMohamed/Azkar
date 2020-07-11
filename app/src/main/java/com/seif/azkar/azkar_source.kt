package com.seif.azkar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_azkar_source.*

class azkar_source : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azkar_source)
    var int =intent.extras!!.getString("azkar")
    txt_azkar.text=int
    }
}