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

fun String.nonEmpty(callback: (message: String) -> Unit) : Boolean
{
    return validator().nonEmpty()
            .addErrorCallback {
                callback.invoke(it)
            }
            .check()
}

fun String.minLength(minLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg).check()
}

fun String.minLength(minLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().minLength(minLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.minLength(minLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.maxLength(maxLength: Int, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg).check()
}

fun String.maxLength(maxLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().maxLength(maxLength, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.maxLength(maxLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.validEmail(errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg).check()
}

fun String.validEmail(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validEmail(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.validEmail(callback: (message: String) -> Unit) : Boolean
{
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.validNumber(errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg).check()
}

fun String.validNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.validNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun String.greaterThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg).check()
}

fun String.greaterThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.greaterThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun String.greaterThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg).check()
}

fun String.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().greaterThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.lessThan(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg).check()
}

fun String.lessThan(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThan(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.lessThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun String.lessThanOrEqual(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg).check()
}

fun String.lessThanOrEqual(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().lessThanOrEqual(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.lessThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.numberEqualTo(number: Number, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg).check()
}

fun String.numberEqualTo(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().numberEqualTo(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.numberEqualTo(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun String.allUpperCase(errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg).check()
}

fun String.allUpperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.allUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.allLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg).check()
}

fun String.allLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().allLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.allLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atLeastOneUpperCase(errorMsg: String? = null) : Boolean
{
    return validator().atLeastOneUpperCase(errorMsg).check()
}

fun String.atLeastOneUpperCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atLeastOneUpperCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atLeastOneUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atLeastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atLeastOneLowerCase(errorMsg: String? = null) : Boolean
{
    return validator().atLeastOneLowerCase(errorMsg).check()
}

fun String.atLeastOneLowerCase(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atLeastOneLowerCase(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atLeastOneLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator().atLeastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atLeastOneNumber(errorMsg: String? = null) : Boolean
{
    return validator().atLeastOneNumber(errorMsg).check()
}

fun String.atLeastOneNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atLeastOneNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atLeastOneNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().atLeastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.startWithNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg).check()
}

fun String.startWithNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.startWithNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.startWithNonNumber(errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg).check()
}

fun String.startWithNonNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startWithNonNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.startWithNonNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun String.noNumbers(errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg).check()
}

fun String.noNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.noNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.onlyNumbers(errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg).check()
}

fun String.onlyNumbers(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().onlyNumbers(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.onlyNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.noSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg).check()
}

fun String.noSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().noSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.noSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atleastOneSpecialCharacters(errorMsg: String? = null) : Boolean
{
    return validator().atLeastOneSpecialCharacters(errorMsg).check()
}

fun String.atleastOneSpecialCharacters(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().atLeastOneSpecialCharacters(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.atleastOneSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator().atLeastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.textEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg).check()
}

fun String.textEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.textEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.textNotEqualTo(target: String, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg).check()
}

fun String.textNotEqualTo(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().textNotEqualTo(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.textNotEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.startsWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg).check()
}

fun String.startsWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().startsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.startsWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.endssWith(target: String, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg).check()
}

fun String.endssWith(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().endsWith(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.endssWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.contains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg).check()
}

fun String.contains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().contains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.contains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.notContains(target: String, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg).check()
}

fun String.notContains(target: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().notContains(target, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.notContains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.creditCardNumber(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg).check()
}

fun String.creditCardNumber(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumber(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.creditCardNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.creditCardNumberWithSpaces(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg).check()
}

fun String.creditCardNumberWithSpaces(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithSpaces(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.creditCardNumberWithSpaces(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.creditCardNumberWithDashes(errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg).check()
}

fun String.creditCardNumberWithDashes(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().creditCardNumberWithDashes(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.creditCardNumberWithDashes(callback: (message: String) -> Unit) : Boolean
{
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.validUrl(errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg).check()
}

fun String.validUrl(callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().validUrl(errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.validUrl(callback: (message: String) -> Unit) : Boolean
{
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}


fun String.regex(pattern: String, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg).check()
}

fun String.regex(pattern: String, callback: (message: String) -> Unit, errorMsg: String? = null) : Boolean
{
    return validator().regex(pattern, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun String.regex(pattern: String, callback: (message: String) -> Unit) : Boolean
{
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}
