package com.wajahatkarim3.easyvalidation_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.wajahatkarim3.easyvalidation.core.collection_ktx.nonEmptyList
import com.wajahatkarim3.easyvalidation.core.rules.GreaterThanRule
import com.wajahatkarim3.easyvalidation.core.rules.MinLengthRule
import com.wajahatkarim3.easyvalidation.core.view_ktx.*
import com.wajahatkarim3.easyvalidation.toasts.view_ktx.maxLengthToast
import com.wajahatkarim3.easyvalidation.toasts.view_ktx.nonEmptyToast
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
            //edittext.nonEmpty ( {
            //   edittext.error = "Cannot be empty! - Check"
            //}, "test message" )

            edittext.maxLengthToast(5,"sorry you can not enter more than 5 characters")
        }

        findViewById<Button>(R.id.btnCustomEmpty)
                .setOnClickListener {
                    edittext.validator()
                            .nonEmpty("this is a custom empty message")
                            .addErrorCallback { message ->
                                edittext.error = message
                            }
                            .check()
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
                    //if (edittext.minLength(3) == false)
                    //    edittext.error = "Should be greater than 3"

                    edittext.minLength(3, {

                        edittext.error = "Should be greater than 3"
                    } )

                    //Toast.makeText(this, "Testing Toast", Toast.LENGTH_LONG).show()

                    nonEmptyList(findViewById<EditText>(R.id.editText), findViewById<EditText>(R.id.editText2), findViewById<EditText>(R.id.editText3)) { view, message ->
                        view.error = message
                    }

                }

        findViewById<Button>(R.id.btnEmail)
                .setOnClickListener {

                    //edittext.validator()
                    //        .addRule(GreaterThanRule(-10.4))
                    //        .addErrorCallback {
                    //            edittext.error = it
                    //        }
                    //        .check()

                    //if (edittext.greaterThanOrEqual(-10) == false)
                    //    edittext.error = "Number greater than or equal to 10"

                    //if (edittext.textEqualTo("Hell0") == false)
                    //    edittext.error = "Should be same as Hell0"

                    //if (edittext.validUrl() == false)
                    //    edittext.error = "Invalid web URL!"

                    edittext.validator()
                            .atleastOneNumber()
                            .atleastOneSpecialCharacters()
                            .atleastOneUpperCase()
                            .addErrorCallback {
                                edittext.error = it
                            }
                            .check()

                    //if (edittext.validEmail() == false)
                    //    edittext.error = "Invalid email address!"
                }

    }
}
