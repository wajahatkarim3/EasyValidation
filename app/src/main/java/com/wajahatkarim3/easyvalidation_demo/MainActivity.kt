package com.wajahatkarim3.easyvalidation_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.rules.MinLengthRule
import com.wajahatkarim3.easyvalidation.core.view_ktx.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edittext = findViewById<EditText>(R.id.editText)

        var button = findViewById<Button>(R.id.btnEmpty)
        button.setOnClickListener {

            // Validator way
            //edittext.validator()
            //        .nonEmpty()
            //        .addErrorCallback {
            //            edittext.error = it
            //        }
            //        .check()

            // Extension Way
            if (edittext.nonEmpty() == false)
               edittext.error = "Cannot be empty! - Check"
        }

        findViewById<Button>(R.id.btnMinLength)
                .setOnClickListener {

                    // Validator way
                    //edittext.validator()
                    //        .nonEmpty()
                    //        .minLength(3)
                    //        .maxLength(5)
                    //        .addErrorCallback {
                    //            edittext.error = it
                    //        }
                    //        .check()


                    // Extension way
                    if (edittext.minLength(3) == false)
                        edittext.error = "Should be greater than 3"
                }

        findViewById<Button>(R.id.btnEmail)
                .setOnClickListener {
                    if (edittext.validEmail() == false)
                        edittext.error = "Invalid email address!"
                }

    }
}
