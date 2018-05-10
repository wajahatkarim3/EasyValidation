package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.Validator

fun EditText.validator() : Validator
{
    return Validator(text.toString())
}

fun EditText.nonEmpty() : Boolean
{
    return !validator().nonEmpty().check()
}