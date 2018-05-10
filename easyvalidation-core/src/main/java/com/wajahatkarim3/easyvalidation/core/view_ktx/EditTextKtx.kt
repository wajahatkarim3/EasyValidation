package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.Validator
import kotlin.math.max

fun EditText.validator() : Validator
{
    return Validator(text.toString())
}

fun EditText.nonEmpty() : Boolean
{
    return validator().nonEmpty().check()
}

fun EditText.minLength(minLength: Int) : Boolean
{
    return validator().minLength(minLength).check()
}

fun EditText.maxLength(maxLength: Int) : Boolean
{
    return validator().maxLength(maxLength).check()
}