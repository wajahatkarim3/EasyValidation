package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.Validator
import java.math.BigDecimal
import java.math.BigInteger

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

fun String.greaterThan(number: Number) : Boolean
{
    return validator().greaterThan(number).check()
}

fun String.greaterThanOrEqual(number: Number) : Boolean
{
    return validator().greaterThanOrEqual(number).check()
}

fun String.lessThan(number: Number) : Boolean
{
    return validator().lessThan(number).check()
}

fun String.lessThanOrEqual(number: Number) : Boolean
{
    return validator().lessThanOrEqual(number).check()
}

fun String.allUperCase() : Boolean
{
    return validator().allUpperCase().check()
}

fun String.allLowerCase() : Boolean
{
    return validator().allLowerCase().check()
}

fun String.atleastOneUpperCase() : Boolean
{
    return validator().atleastOneUpperCase().check()
}

fun String.atleastOneLowerCase() : Boolean
{
    return validator().atleastOneLowerCase().check()
}

fun String.atleastOneNumber() : Boolean
{
    return validator().atleastOneNumber().check()
}