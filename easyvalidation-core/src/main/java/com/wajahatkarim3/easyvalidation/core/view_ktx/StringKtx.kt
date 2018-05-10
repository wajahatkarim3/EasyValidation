package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.Validator

fun String.validator() : Validator
{
    return Validator(this)
}

fun String.nonEmpty() : Boolean
{
    return validator().nonEmpty().check()
}

fun String.minLength(minLength: Int) : Boolean
{
    return validator().minLength(minLength).check()
}

fun String.maxLength(maxLength: Int) : Boolean
{
    return validator().maxLength(maxLength).check()
}

fun String.validEmail() : Boolean
{
    return validator().validEmail().check()
}

fun String.validNumber() : Boolean
{
    return validator().validNumber().check()
}
