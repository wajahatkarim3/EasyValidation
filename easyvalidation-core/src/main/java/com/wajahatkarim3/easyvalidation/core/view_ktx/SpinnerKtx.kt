package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.widget.Spinner
import com.wajahatkarim3.easyvalidation.core.Validator
import java.math.BigDecimal
import java.math.BigInteger
import java.util.regex.Pattern
import kotlin.math.max

fun Spinner.validator() : Validator
{
    return Validator(this.selectedItem.toString())
}

fun Spinner.nonEmpty(errorMsg:String? = null) : Boolean
{
    return validator().nonEmpty(errorMsg).check()
}

fun Spinner.nonEmpty(callback: (message: String) -> Unit, errorMsg:String? = null) : Boolean
{
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun Spinner.nonEmpty(callback: (message: String) -> Unit) : Boolean
{
    return validator().nonEmpty()
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun Spinner.minLength(minLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg).check()
}

fun Spinner.minLength(minLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.minLength(minLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.maxLength(maxLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg).check()
}

fun Spinner.maxLength(maxLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.maxLength(maxLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun Spinner.validEmail(errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg).check()
}

fun Spinner.validEmail(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.validEmail(callback: (message: String) -> Unit) : Boolean
{
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.validNumber(errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg).check()
}

fun Spinner.validNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.validNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg).check()
}

fun Spinner.greaterThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg).check()
}

fun Spinner.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg).check()
}

fun Spinner.lessThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg).check()
}

fun Spinner.lessThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.numberEqualTo(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg).check()
}

fun Spinner.numberEqualTo(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.numberEqualTo(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.allUperCase(errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg).check()
}

fun Spinner.allUperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.allUperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.allLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg).check()
}

fun Spinner.allLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.allLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneUpperCase(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneUpperCase(errorMsg).check()
}

fun Spinner.atleastOneUpperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneLowerCase(errorMsg).check()
}

fun Spinner.atleastOneLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneNumber(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneNumber(errorMsg).check()
}

fun Spinner.atleastOneNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.startWithNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg).check()
}

fun Spinner.startWithNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.startWithNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun Spinner.startWithNonNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg).check()
}

fun Spinner.startWithNonNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.startWithNonNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.noNumbers(errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg).check()
}

fun Spinner.noNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.noNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.onlyNumbers(errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg).check()
}

fun Spinner.onlyNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.onlyNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun Spinner.noSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg).check()
}

fun Spinner.noSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.noSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun Spinner.atleastOneSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().atleastOneSpecialCharacters(errorMsg).check()
}

fun Spinner.atleastOneSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atleastOneSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.textEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg).check()
}

fun Spinner.textEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.textEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.textNotEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg).check()
}

fun Spinner.textNotEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.textNotEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun Spinner.startsWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg).check()
}

fun Spinner.startsWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.startsWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun Spinner.endssWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg).check()
}

fun Spinner.endssWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.endssWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.contains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg).check()
}

fun Spinner.contains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.contains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.notContains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg).check()
}

fun Spinner.notContains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.notContains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumber(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg).check()
}

fun Spinner.creditCardNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithSpaces(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg).check()
}

fun Spinner.creditCardNumberWithSpaces(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithSpaces(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithDashes(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg).check()
}

fun Spinner.creditCardNumberWithDashes(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithDashes(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.validUrl(errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg).check()
}

fun Spinner.validUrl(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.validUrl(callback: (message: String) -> Unit) : Boolean
{
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun Spinner.regex(pattern: String, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg).check()
}

fun Spinner.regex(pattern: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.regex(pattern: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}