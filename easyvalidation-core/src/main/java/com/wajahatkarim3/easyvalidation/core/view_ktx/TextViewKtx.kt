package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.TextView
import com.wajahatkarim3.easyvalidation.core.Validator
import java.math.BigDecimal
import java.math.BigInteger
import java.util.regex.Pattern
import kotlin.math.max

fun TextView.validator(): Validator {
    return Validator(text.toString())
}

fun TextView.nonEmpty(errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg).check()
}

fun TextView.nonEmpty(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun TextView.nonEmpty(callback: (message: String) -> Unit) : Boolean
{
    return validator().nonEmpty()
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}


fun TextView.minLength(minLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg).check()
}

fun TextView.minLength(minLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.minLength(minLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.maxLength(maxLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg).check()
}

fun TextView.maxLength(maxLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.maxLength(maxLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.validEmail(errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg).check()
}

fun TextView.validEmail(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.validEmail(callback: (message: String) -> Unit) : Boolean
{
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.validNumber(errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg).check()
}

fun TextView.validNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.validNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.greaterThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg).check()
}

fun TextView.greaterThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.greaterThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.greaterThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg).check()
}

fun TextView.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.lessThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg).check()
}

fun TextView.lessThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.lessThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.lessThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg).check()
}

fun TextView.lessThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.lessThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.numberEqualTo(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg).check()
}

fun TextView.numberEqualTo(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.numberEqualTo(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.allUperCase(errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg).check()
}

fun TextView.allUperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.allUperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.allLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg).check()
}

fun TextView.allLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.allLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun TextView.atleastOneUpperCase(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneUpperCase(errorMsg).check()
}

fun TextView.atleastOneUpperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneLowerCase(errorMsg).check()
}

fun TextView.atleastOneLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneNumber(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneNumber(errorMsg).check()
}

fun TextView.atleastOneNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.startWithNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg).check()
}

fun TextView.startWithNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.startWithNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.startWithNonNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg).check()
}

fun TextView.startWithNonNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.startWithNonNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun TextView.noNumbers(errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg).check()
}

fun TextView.noNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.noNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.onlyNumbers(errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg).check()
}

fun TextView.onlyNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.onlyNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.noSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg).check()
}

fun TextView.noSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.noSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneSpecialCharacters(errorMsg).check()
}

fun TextView.atleastOneSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.textEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg).check()
}

fun TextView.textEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.textEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.textNotEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg).check()
}

fun TextView.textNotEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.textNotEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.startsWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg).check()
}

fun TextView.startsWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.startsWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun TextView.endssWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg).check()
}

fun TextView.endssWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.endssWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.contains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg).check()
}

fun TextView.contains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.contains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.notContains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg).check()
}

fun TextView.notContains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.notContains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.creditCardNumber(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg).check()
}

fun TextView.creditCardNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.creditCardNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.creditCardNumberWithSpaces(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg).check()
}

fun TextView.creditCardNumberWithSpaces(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.creditCardNumberWithSpaces(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.creditCardNumberWithDashes(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg).check()
}

fun TextView.creditCardNumberWithDashes(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.creditCardNumberWithDashes(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.validUrl(errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg).check()
}

fun TextView.validUrl(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.validUrl(callback: (message: String) -> Unit) : Boolean
{
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.regex(pattern: String, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg).check()
}

fun TextView.regex(pattern: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.regex(pattern: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}