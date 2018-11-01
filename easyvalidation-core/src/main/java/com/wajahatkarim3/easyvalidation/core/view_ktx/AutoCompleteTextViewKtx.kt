package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.AutoCompleteTextView
import com.wajahatkarim3.easyvalidation.core.Validator
import java.math.BigDecimal
import java.math.BigInteger
import java.util.regex.Pattern
import kotlin.math.max

fun AutoCompleteTextView.validator() : Validator
{
    return Validator(text.toString())
}

fun AutoCompleteTextView.nonEmpty(errorMsg:String? = null) : Boolean
{
    return validator().nonEmpty(errorMsg).check()
}

fun AutoCompleteTextView.nonEmpty(callback: (message: String) -> Unit, errorMsg:String? = null) : Boolean
{
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun AutoCompleteTextView.nonEmpty(callback: (message: String) -> Unit) : Boolean
{
    return validator().nonEmpty()
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun AutoCompleteTextView.minLength(minLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg).check()
}

fun AutoCompleteTextView.minLength(minLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.minLength(minLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.maxLength(maxLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg).check()
}

fun AutoCompleteTextView.maxLength(maxLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.maxLength(maxLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.validEmail(errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg).check()
}

fun AutoCompleteTextView.validEmail(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.validEmail(callback: (message: String) -> Unit) : Boolean
{
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.validNumber(errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg).check()
}

fun AutoCompleteTextView.validNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.validNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.greaterThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg).check()
}

fun AutoCompleteTextView.greaterThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.greaterThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.greaterThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg).check()
}

fun AutoCompleteTextView.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.lessThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg).check()
}

fun AutoCompleteTextView.lessThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.lessThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.lessThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg).check()
}

fun AutoCompleteTextView.lessThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.lessThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.numberEqualTo(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg).check()
}

fun AutoCompleteTextView.numberEqualTo(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.numberEqualTo(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.allUperCase(errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg).check()
}

fun AutoCompleteTextView.allUperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.allUperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun AutoCompleteTextView.allLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg).check()
}

fun AutoCompleteTextView.allLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.allLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneUpperCase(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneUpperCase(errorMsg).check()
}

fun AutoCompleteTextView.atleastOneUpperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneLowerCase(errorMsg).check()
}

fun AutoCompleteTextView.atleastOneLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneNumber(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneNumber(errorMsg).check()
}

fun AutoCompleteTextView.atleastOneNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.startWithNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg).check()
}

fun AutoCompleteTextView.startWithNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.startWithNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.startWithNonNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg).check()
}

fun AutoCompleteTextView.startWithNonNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.startWithNonNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.noNumbers(errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg).check()
}

fun AutoCompleteTextView.noNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.noNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun AutoCompleteTextView.onlyNumbers(errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg).check()
}

fun AutoCompleteTextView.onlyNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.onlyNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.noSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg).check()
}

fun AutoCompleteTextView.noSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.noSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneSpecialCharacters(errorMsg).check()
}

fun AutoCompleteTextView.atleastOneSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.textEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg).check()
}

fun AutoCompleteTextView.textEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.textEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.textNotEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg).check()
}

fun AutoCompleteTextView.textNotEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.textNotEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.startsWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg).check()
}

fun AutoCompleteTextView.startsWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.startsWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.endssWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg).check()
}

fun AutoCompleteTextView.endssWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.endssWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.contains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg).check()
}

fun AutoCompleteTextView.contains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.contains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.notContains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg).check()
}

fun AutoCompleteTextView.notContains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.notContains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun AutoCompleteTextView.creditCardNumber(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg).check()
}

fun AutoCompleteTextView.creditCardNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.creditCardNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.creditCardNumberWithSpaces(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg).check()
}

fun AutoCompleteTextView.creditCardNumberWithSpaces(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.creditCardNumberWithSpaces(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.creditCardNumberWithDashes(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg).check()
}

fun AutoCompleteTextView.creditCardNumberWithDashes(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.creditCardNumberWithDashes(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.validUrl(errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg).check()
}

fun AutoCompleteTextView.validUrl(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.validUrl(callback: (message: String) -> Unit) : Boolean
{
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.regex(pattern: String, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg).check()
}

fun AutoCompleteTextView.regex(pattern: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.regex(pattern: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}