package com.wajahatkarim3.easyvalidation_demo.example2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.wajahatkarim3.easyvalidation.core.view_ktx.validator
import com.wajahatkarim3.easyvalidation_demo.R
import kotlinx.android.synthetic.main.activity_login_showcase.*

class LoginShowcaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_showcase)
        title = "Sign up"
    }

    fun validate(v: View) {
        user_name.validator()
                .nonEmpty("User name cannot be empty")
                .minLength(3, "User name must at least have 3 letters")
                .addErrorCallback {
                    user_name.error = it
                }
                .check()

        user_age.validator()
                .greaterThanOrEqual(18, "You must be 18 or older to sign up.")
                .addErrorCallback {
                    user_age.error = it
                }
                .check()

        user_email.validator()
                .validEmail("Not a valid e-mail address")
                .addErrorCallback {
                    user_email.error = it
                }
                .check()

        password_1.validator()
                .minLength(8, "Password needs to have at least 8 characters")
                .atleastOneNumber("At least one number needed")
                .atleastOneSpecialCharacters("At least one special character needed")
                .atleastOneUpperCase("At least one uppercase character needed")
                .addErrorCallback {
                    password_1.error = it
                }
                .check()

        password_2.validator()
                .textEqualTo(password_1.text.toString(), "Passwords do not match")
                .addErrorCallback {
                    password_2.error = it
                }
                .check()
    }

    companion object {

        fun start(context: Context) {
            val intent = Intent(context, LoginShowcaseActivity::class.java)
            context.startActivity(intent)
        }
    }
}
