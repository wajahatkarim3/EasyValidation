package com.wajahatkarim3.easyvalidation.core.view_ktx

import com.wajahatkarim3.easyvalidation.core.Validator

fun String.validator() : Validator
{
    return Validator(this)
}

fun String.nonEmpty(errorMsg:String? = null) : Boolean
{
    return validator().nonEmpty(errorMsg).check()
}

fun String.nonEmpty(callback: (message: String) -> Unit, errorMsg:String? = null) : Boolean
{
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun String.minLength(minLength: Int) : Boolean
{
    return validator().minLength(minLength).check()
}

fun String.minLength(minLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.maxLength(maxLength: Int) : Boolean
{
    return validator().maxLength(maxLength).check()
}

fun String.maxLength(maxLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.validEmail() : Boolean
{
    return validator().validEmail().check()
}

fun String.validEmail(callback: (message: String) -> Unit) : Boolean
{
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.validNumber() : Boolean
{
    return validator().validNumber().check()
}

fun String.validNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.greaterThan(number: Number) : Boolean
{
    return validator().greaterThan(number).check()
}

fun String.greaterThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.greaterThanOrEqual(number: Number) : Boolean
{
    return validator().greaterThanOrEqual(number).check()
}

fun String.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.lessThan(number: Number) : Boolean
{
    return validator().lessThan(number).check()
}

fun String.lessThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.lessThanOrEqual(number: Number) : Boolean
{
    return validator().lessThanOrEqual(number).check()
}

fun String.lessThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.numberEqualTo(number: Number) : Boolean
{
    return validator().numberEqualTo(number).check()
}

fun String.numberEqualTo(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.allUperCase() : Boolean
{
    return validator().allUpperCase().check()
}

fun String.allUperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.allLowerCase() : Boolean
{
    return validator().allLowerCase().check()
}

fun String.allLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atleastOneUpperCase() : Boolean
{
    return validator().atleastOneUpperCase().check()
}

fun String.atleastOneUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atleastOneLowerCase() : Boolean
{
    return validator().atleastOneLowerCase().check()
}

fun String.atleastOneLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atleastOneNumber() : Boolean
{
    return validator().atleastOneNumber().check()
}

fun String.atleastOneNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.startWithNumber() : Boolean
{
    return validator().startWithNumber().check()
}

fun String.startWithNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.startWithNonNumber() : Boolean
{
    return validator().startWithNonNumber().check()
}

fun String.startWithNonNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.noNumbers() : Boolean
{
    return validator().noNumbers().check()
}

fun String.noNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.onlyNumbers() : Boolean
{
    return validator().onlyNumbers().check()
}

fun String.onlyNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.noSpecialCharacters() : Boolean
{
    return validator().noSpecialCharacters().check()
}

fun String.noSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atleastOneSpecialCharacters() : Boolean
{
    return validator().atleastOneSpecialCharacters().check()
}

fun String.atleastOneSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.textEqualTo(target: String) : Boolean
{
    return validator().textEqualTo(target).check()
}

fun String.textEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.textNotEqualTo(target: String) : Boolean
{
    return validator().textNotEqualTo(target).check()
}

fun String.textNotEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.startsWith(target: String) : Boolean
{
    return validator().startsWith(target).check()
}

fun String.startsWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.endssWith(target: String) : Boolean
{
    return validator().endsWith(target).check()
}

fun String.endssWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.contains(target: String) : Boolean
{
    return validator().contains(target).check()
}

fun String.contains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.notContains(target: String) : Boolean
{
    return validator().notContains(target).check()
}

fun String.notContains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.creditCardNumber() : Boolean
{
    return validator().creditCardNumber().check()
}

fun String.creditCardNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.creditCardNumberWithSpaces() : Boolean
{
    return validator().creditCardNumberWithSpaces().check()
}

fun String.creditCardNumberWithSpaces(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.creditCardNumberWithDashes() : Boolean
{
    return validator().creditCardNumberWithDashes().check()
}

fun String.creditCardNumberWithDashes(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.validUrl() : Boolean
{
    return validator().validUrl().check()
}

fun String.validUrl(callback: (message: String) -> Unit) : Boolean
{
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.regex(pattern: String) : Boolean
{
    return validator().regex(pattern).check()
}

fun String.regex(pattern: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}