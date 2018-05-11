package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.Validator
import java.math.BigDecimal
import java.math.BigInteger
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

fun EditText.validEmail() : Boolean
{
    return validator().validEmail().check()
}

fun EditText.validNumber() : Boolean
{
    return validator().validNumber().check()
}

fun EditText.greaterThan(number: Number) : Boolean
{
    return validator().greaterThan(number).check()
}

fun EditText.greaterThanOrEqual(number: Number) : Boolean
{
    return validator().greaterThanOrEqual(number).check()
}

fun EditText.lessThan(number: Number) : Boolean
{
    return validator().lessThan(number).check()
}

fun EditText.lessThanOrEqual(number: Number) : Boolean
{
    return validator().lessThanOrEqual(number).check()
}

fun EditText.allUperCase() : Boolean
{
    return validator().allUpperCase().check()
}

fun EditText.allLowerCase() : Boolean
{
    return validator().allLowerCase().check()
}

fun EditText.atleastOneUpperCase() : Boolean
{
    return validator().atleastOneUpperCase().check()
}

fun EditText.atleastOneLowerCase() : Boolean
{
    return validator().atleastOneLowerCase().check()
}

fun EditText.atleastOneNumber() : Boolean
{
    return validator().atleastOneNumber().check()
}