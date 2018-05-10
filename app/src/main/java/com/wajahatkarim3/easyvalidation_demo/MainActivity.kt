package com.wajahatkarim3.easyvalidation_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.view_ktx.validator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edittext = findViewById<EditText>(R.id.editText)

        var button = findViewById<Button>(R.id.btnValidate)
        button.setOnClickListener {

            edittext.validator()
                    .empty()
                    .addErrorCallback {
                        edittext.error = it
                    }
                    .check()
        }

    }
}
