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

fun String.numberEqualTo(number: Number) : Boolean
{
    return validator().numberEqualTo(number).check()
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

fun String.startWithNumber() : Boolean
{
    return validator().startWithNumber().check()
}

fun String.startWithNonNumber() : Boolean
{
    return validator().startWithNonNumber().check()
}

fun String.noNumbers() : Boolean
{
    return validator().noNumbers().check()
}

fun String.onlyNumbers() : Boolean
{
    return validator().onlyNumbers().check()
}

fun String.noSpecialCharacters() : Boolean
{
    return validator().noSpecialCharacters().check()
}

fun String.atleastOneSpecialCharacters() : Boolean
{
    return validator().atleastOneSpecialCharacters().check()
}

fun String.textEqualTo(target: String) : Boolean
{
    return validator().textEqualTo(target).check()
}

fun String.textNotEqualTo(target: String) : Boolean
{
    return validator().textNotEqualTo(target).check()
}

fun String.startsWith(target: String) : Boolean
{
    return validator().startsWith(target).check()
}

fun String.endsWith(target: String) : Boolean
{
    return validator().endsWith(target).check()
}

fun String.contains(target: String) : Boolean
{
    return validator().contains(target).check()
}

fun String.notContains(target: String) : Boolean
{
    return validator().notContains(target).check()
}

fun String.creditCardNumber() : Boolean
{
    return validator().creditCardNumber().check()
}

fun String.creditCardNumberWithSpaces() : Boolean
{
    return validator().creditCardNumberWithSpaces().check()
}

fun String.creditCardNumberWithDashes() : Boolean
{
    return validator().creditCardNumberWithDashes().check()
}

fun String.regex(pattern: String) : Boolean
{
    return validator().regex(pattern).check()
}