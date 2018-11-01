package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.Validator
import java.math.BigDecimal
import java.math.BigInteger
import java.util.regex.Pattern
import kotlin.math.max

fun EditText.validator(): Validator {
    return Validator(text.toString())
}

fun EditText.nonEmpty(errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg).check()
}

fun EditText.nonEmpty(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun EditText.nonEmpty(callback: (message: String) -> Unit) : Boolean
{
    return validator().nonEmpty()
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}


fun EditText.minLength(minLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg).check()
}

fun EditText.minLength(minLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.minLength(minLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.maxLength(maxLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg).check()
}

fun EditText.maxLength(maxLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.maxLength(maxLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.validEmail(errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg).check()
}

fun EditText.validEmail(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.validEmail(callback: (message: String) -> Unit) : Boolean
{
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.validNumber(errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg).check()
}

fun EditText.validNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.validNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg).check()
}

fun EditText.greaterThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg).check()
}

fun EditText.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.lessThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg).check()
}

fun EditText.lessThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.lessThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.lessThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg).check()
}

fun EditText.lessThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.lessThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.numberEqualTo(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg).check()
}

fun EditText.numberEqualTo(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.numberEqualTo(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.allUperCase(errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg).check()
}

fun EditText.allUperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.allUperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.allLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg).check()
}

fun EditText.allLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.allLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun EditText.atleastOneUpperCase(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneUpperCase(errorMsg).check()
}

fun EditText.atleastOneUpperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneLowerCase(errorMsg).check()
}

fun EditText.atleastOneLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneNumber(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneNumber(errorMsg).check()
}

fun EditText.atleastOneNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg).check()
}

fun EditText.startWithNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNonNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg).check()
}

fun EditText.startWithNonNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNonNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun EditText.noNumbers(errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg).check()
}

fun EditText.noNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.noNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.onlyNumbers(errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg).check()
}

fun EditText.onlyNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.onlyNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.noSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg).check()
}

fun EditText.noSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.noSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneSpecialCharacters(errorMsg).check()
}

fun EditText.atleastOneSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.textEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg).check()
}

fun EditText.textEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.textEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.textNotEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg).check()
}

fun EditText.textNotEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.textNotEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.startsWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg).check()
}

fun EditText.startsWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.startsWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun EditText.endssWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg).check()
}

fun EditText.endssWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.endssWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.contains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg).check()
}

fun EditText.contains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.contains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.notContains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg).check()
}

fun EditText.notContains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.notContains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumber(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg).check()
}

fun EditText.creditCardNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithSpaces(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg).check()
}

fun EditText.creditCardNumberWithSpaces(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithSpaces(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithDashes(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg).check()
}

fun EditText.creditCardNumberWithDashes(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithDashes(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.validUrl(errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg).check()
}

fun EditText.validUrl(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.validUrl(callback: (message: String) -> Unit) : Boolean
{
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.regex(pattern: String, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg).check()
}

fun EditText.regex(pattern: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.regex(pattern: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}