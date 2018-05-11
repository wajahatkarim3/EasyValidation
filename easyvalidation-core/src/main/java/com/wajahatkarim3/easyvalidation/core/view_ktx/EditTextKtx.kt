package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.Validator
import java.math.BigDecimal
import java.math.BigInteger
import java.util.regex.Pattern
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

fun EditText.numberEqualTo(number: Number) : Boolean
{
    return validator().numberEqualTo(number).check()
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

fun EditText.startWithNumber() : Boolean
{
    return validator().startWithNumber().check()
}

fun EditText.startWithNonNumber() : Boolean
{
    return validator().startWithNonNumber().check()
}

fun EditText.noNumbers() : Boolean
{
    return validator().noNumbers().check()
}

fun EditText.onlyNumbers() : Boolean
{
    return validator().onlyNumbers().check()
}

fun EditText.noSpecialCharacters() : Boolean
{
    return validator().noSpecialCharacters().check()
}

fun EditText.atleastOneSpecialCharacters() : Boolean
{
    return validator().atleastOneSpecialCharacters().check()
}

fun EditText.textEqualTo(target: String) : Boolean
{
    return validator().textEqualTo(target).check()
}

fun EditText.textNotEqualTo(target: String) : Boolean
{
    return validator().textNotEqualTo(target).check()
}

fun EditText.startsWith(target: String) : Boolean
{
    return validator().startsWith(target).check()
}

fun EditText.endssWith(target: String) : Boolean
{
    return validator().endsWith(target).check()
}

fun EditText.contains(target: String) : Boolean
{
    return validator().contains(target).check()
}

fun EditText.notContains(target: String) : Boolean
{
    return validator().notContains(target).check()
}

fun EditText.creditCardNumber() : Boolean
{
    return validator().creditCardNumber().check()
}

fun EditText.creditCardNumberWithSpaces() : Boolean
{
    return validator().creditCardNumberWithSpaces().check()
}

fun EditText.creditCardNumberWithDashes() : Boolean
{
    return validator().creditCardNumberWithDashes().check()
}

fun EditText.regex(pattern: String) : Boolean
{
    return validator().regex(pattern).check()
}