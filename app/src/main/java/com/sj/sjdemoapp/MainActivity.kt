package com.sj.sjdemoapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_1.setOnClickListener {
            object : View.OnClickListener {
                override fun onClick(v: View?) {
                }
            }
        }
    }
}
