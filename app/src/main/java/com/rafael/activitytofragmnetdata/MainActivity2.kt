package com.rafael.activitytofragmnetdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity2 : AppCompatActivity() {

    private val fragmentManager: FragmentManager = supportFragmentManager
    private lateinit var txtBegin: TextView
    private lateinit var txtEnd: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val beginDate = intent.getStringExtra("begin_date")

        txtEnd = findViewById(R.id.txt2)

        txtEnd.text = beginDate.toString()


        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container, BlankFragment())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }
}