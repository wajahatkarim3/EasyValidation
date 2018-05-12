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

fun AutoCompleteTextView.nonEmpty() : Boolean
{
    return validator().nonEmpty().check()
}

fun AutoCompleteTextView.nonEmpty(callback: (message: String) -> Unit) : Boolean
{
    return validator().nonEmpty()
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun AutoCompleteTextView.minLength(minLength: Int) : Boolean
{
    return validator().minLength(minLength).check()
}

fun AutoCompleteTextView.minLength(minLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.maxLength(maxLength: Int) : Boolean
{
    return validator().maxLength(maxLength).check()
}

fun AutoCompleteTextView.maxLength(maxLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.validEmail() : Boolean
{
    return validator().validEmail().check()
}

fun AutoCompleteTextView.validEmail(callback: (message: String) -> Unit) : Boolean
{
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.validNumber() : Boolean
{
    return validator().validNumber().check()
}

fun AutoCompleteTextView.validNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.greaterThan(number: Number) : Boolean
{
    return validator().greaterThan(number).check()
}

fun AutoCompleteTextView.greaterThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.greaterThanOrEqual(number: Number) : Boolean
{
    return validator().greaterThanOrEqual(number).check()
}

fun AutoCompleteTextView.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.lessThan(number: Number) : Boolean
{
    return validator().lessThan(number).check()
}

fun AutoCompleteTextView.lessThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.lessThanOrEqual(number: Number) : Boolean
{
    return validator().lessThanOrEqual(number).check()
}

fun AutoCompleteTextView.lessThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.numberEqualTo(number: Number) : Boolean
{
    return validator().numberEqualTo(number).check()
}

fun AutoCompleteTextView.numberEqualTo(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.allUperCase() : Boolean
{
    return validator().allUpperCase().check()
}

fun AutoCompleteTextView.allUperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.allLowerCase() : Boolean
{
    return validator().allLowerCase().check()
}

fun AutoCompleteTextView.allLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneUpperCase() : Boolean
{
    return validator().atleastOneUpperCase().check()
}

fun AutoCompleteTextView.atleastOneUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneLowerCase() : Boolean
{
    return validator().atleastOneLowerCase().check()
}

fun AutoCompleteTextView.atleastOneLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneNumber() : Boolean
{
    return validator().atleastOneNumber().check()
}

fun AutoCompleteTextView.atleastOneNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.startWithNumber() : Boolean
{
    return validator().startWithNumber().check()
}

fun AutoCompleteTextView.startWithNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.startWithNonNumber() : Boolean
{
    return validator().startWithNonNumber().check()
}

fun AutoCompleteTextView.startWithNonNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.noNumbers() : Boolean
{
    return validator().noNumbers().check()
}

fun AutoCompleteTextView.noNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.onlyNumbers() : Boolean
{
    return validator().onlyNumbers().check()
}

fun AutoCompleteTextView.onlyNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.noSpecialCharacters() : Boolean
{
    return validator().noSpecialCharacters().check()
}

fun AutoCompleteTextView.noSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.atleastOneSpecialCharacters() : Boolean
{
    return validator().atleastOneSpecialCharacters().check()
}

fun AutoCompleteTextView.atleastOneSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.textEqualTo(target: String) : Boolean
{
    return validator().textEqualTo(target).check()
}

fun AutoCompleteTextView.textEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.textNotEqualTo(target: String) : Boolean
{
    return validator().textNotEqualTo(target).check()
}

fun AutoCompleteTextView.textNotEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.startsWith(target: String) : Boolean
{
    return validator().startsWith(target).check()
}

fun AutoCompleteTextView.startsWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.endssWith(target: String) : Boolean
{
    return validator().endsWith(target).check()
}

fun AutoCompleteTextView.endssWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.contains(target: String) : Boolean
{
    return validator().contains(target).check()
}

fun AutoCompleteTextView.contains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.notContains(target: String) : Boolean
{
    return validator().notContains(target).check()
}

fun AutoCompleteTextView.notContains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.creditCardNumber() : Boolean
{
    return validator().creditCardNumber().check()
}

fun AutoCompleteTextView.creditCardNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.creditCardNumberWithSpaces() : Boolean
{
    return validator().creditCardNumberWithSpaces().check()
}

fun AutoCompleteTextView.creditCardNumberWithSpaces(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.creditCardNumberWithDashes() : Boolean
{
    return validator().creditCardNumberWithDashes().check()
}

fun AutoCompleteTextView.creditCardNumberWithDashes(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.validUrl() : Boolean
{
    return validator().validUrl().check()
}

fun AutoCompleteTextView.validUrl(callback: (message: String) -> Unit) : Boolean
{
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun AutoCompleteTextView.regex(pattern: String) : Boolean
{
    return validator().regex(pattern).check()
}

fun AutoCompleteTextView.regex(pattern: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}