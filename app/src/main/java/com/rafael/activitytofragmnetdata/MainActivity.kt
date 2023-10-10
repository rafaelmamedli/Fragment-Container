package com.rafael.activitytofragmnetdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val beginDate = "10-10-2023"
    val endDate = "10-11-2023"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val intent = Intent(this,MainActivity2::class.java)
        intent.putExtra("begin_date",beginDate)
        intent.putExtra("end_date",endDate)
        startActivity(intent)


    }
}