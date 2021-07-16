package com.wajahatkarim3.easyvalidation_demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wajahatkarim3.easyvalidation_demo.example1.VerificationMethodShowcaseActivity
import com.wajahatkarim3.easyvalidation_demo.example2.LoginShowcaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener {
            VerificationMethodShowcaseActivity.start(this)
        }

        button_2.setOnClickListener {
            LoginShowcaseActivity.start(this)
        }
    }
}
