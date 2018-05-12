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

fun Spinner.nonEmpty() : Boolean
{
    return validator().nonEmpty().check()
}

fun Spinner.nonEmpty(callback: (message: String) -> Unit) : Boolean
{
    return validator().nonEmpty()
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun Spinner.minLength(minLength: Int) : Boolean
{
    return validator().minLength(minLength).check()
}

fun Spinner.minLength(minLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.maxLength(maxLength: Int) : Boolean
{
    return validator().maxLength(maxLength).check()
}

fun Spinner.maxLength(maxLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.validEmail() : Boolean
{
    return validator().validEmail().check()
}

fun Spinner.validEmail(callback: (message: String) -> Unit) : Boolean
{
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.validNumber() : Boolean
{
    return validator().validNumber().check()
}

fun Spinner.validNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThan(number: Number) : Boolean
{
    return validator().greaterThan(number).check()
}

fun Spinner.greaterThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThanOrEqual(number: Number) : Boolean
{
    return validator().greaterThanOrEqual(number).check()
}

fun Spinner.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThan(number: Number) : Boolean
{
    return validator().lessThan(number).check()
}

fun Spinner.lessThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThanOrEqual(number: Number) : Boolean
{
    return validator().lessThanOrEqual(number).check()
}

fun Spinner.lessThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.numberEqualTo(number: Number) : Boolean
{
    return validator().numberEqualTo(number).check()
}

fun Spinner.numberEqualTo(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.allUperCase() : Boolean
{
    return validator().allUpperCase().check()
}

fun Spinner.allUperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.allLowerCase() : Boolean
{
    return validator().allLowerCase().check()
}

fun Spinner.allLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneUpperCase() : Boolean
{
    return validator().atleastOneUpperCase().check()
}

fun Spinner.atleastOneUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneLowerCase() : Boolean
{
    return validator().atleastOneLowerCase().check()
}

fun Spinner.atleastOneLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneNumber() : Boolean
{
    return validator().atleastOneNumber().check()
}

fun Spinner.atleastOneNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.startWithNumber() : Boolean
{
    return validator().startWithNumber().check()
}

fun Spinner.startWithNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.startWithNonNumber() : Boolean
{
    return validator().startWithNonNumber().check()
}

fun Spinner.startWithNonNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.noNumbers() : Boolean
{
    return validator().noNumbers().check()
}

fun Spinner.noNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.onlyNumbers() : Boolean
{
    return validator().onlyNumbers().check()
}

fun Spinner.onlyNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.noSpecialCharacters() : Boolean
{
    return validator().noSpecialCharacters().check()
}

fun Spinner.noSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneSpecialCharacters() : Boolean
{
    return validator().atleastOneSpecialCharacters().check()
}

fun Spinner.atleastOneSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.textEqualTo(target: String) : Boolean
{
    return validator().textEqualTo(target).check()
}

fun Spinner.textEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.textNotEqualTo(target: String) : Boolean
{
    return validator().textNotEqualTo(target).check()
}

fun Spinner.textNotEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.startsWith(target: String) : Boolean
{
    return validator().startsWith(target).check()
}

fun Spinner.startsWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.endssWith(target: String) : Boolean
{
    return validator().endsWith(target).check()
}

fun Spinner.endssWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.contains(target: String) : Boolean
{
    return validator().contains(target).check()
}

fun Spinner.contains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.notContains(target: String) : Boolean
{
    return validator().notContains(target).check()
}

fun Spinner.notContains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumber() : Boolean
{
    return validator().creditCardNumber().check()
}

fun Spinner.creditCardNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithSpaces() : Boolean
{
    return validator().creditCardNumberWithSpaces().check()
}

fun Spinner.creditCardNumberWithSpaces(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithDashes() : Boolean
{
    return validator().creditCardNumberWithDashes().check()
}

fun Spinner.creditCardNumberWithDashes(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.validUrl() : Boolean
{
    return validator().validUrl().check()
}

fun Spinner.validUrl(callback: (message: String) -> Unit) : Boolean
{
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.regex(pattern: String) : Boolean
{
    return validator().regex(pattern).check()
}

fun Spinner.regex(pattern: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}