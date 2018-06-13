package com.wajahatkarim3.easyvalidation.core.collection_ktx

import com.wajahatkarim3.easyvalidation.core.view_ktx.*

fun Any.nonEmptyList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.nonEmpty {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}

// Min Length

fun Any.minLengthList(minLength: Int, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.minLength(minLength) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// Max Length

fun Any.maxLengthList(maxLength: Int, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.maxLength(maxLength) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}

// Valid Email

fun Any.validEmailList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.validEmail() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}

// Valid Number

fun Any.validNumberList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.validNumber() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// Greater Than

fun Any.greaterThanList(number: Number, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.greaterThan(number) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// Greater Than Or Equal

fun Any.greaterThanOrEqualList(number: Number, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.greaterThanOrEqual(number) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// Less Than

fun Any.lessThanList(number: Number, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.lessThan(number) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// Less Than Or Equal

fun Any.lessThanOrEqualnList(number: Number, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.lessThanOrEqual(number) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// Number Equal To

fun Any.numberEqualToList(number: Number, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.numberEqualTo(number) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// All Upper Case

fun Any.allUperCaseList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.allUperCase() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// All Lower Case

fun Any.allLowerCaseList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.allLowerCase() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// At least one upper Case

fun Any.atleastOneUpperCaseList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.atleastOneUpperCase() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// At least one lower Case

fun Any.atleastOneLowerCaseList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.atleastOneLowerCase() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}

// At least one number

fun Any.atleastOneNumberList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.atleastOneNumber() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// Starts with number

fun Any.startWithNumberList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.startWithNumber() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// Starts with non number

fun Any.startWithNonNumberList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.startWithNonNumber() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}

// noNumbers

fun Any.noNumbersList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.noNumbers() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// only numbers

fun Any.onlyNumbersList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.onlyNumbers() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// no special characters

fun Any.noSpecialCharactersList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.noSpecialCharacters() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// at least one special characters

fun Any.atleastOneSpecialCharactersList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.atleastOneSpecialCharacters() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// text equal to

fun Any.textEqualToList(target: String, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.textEqualTo(target) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}

// text not equal to

fun Any.textNotEqualToList(target: String, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.textNotEqualTo(target) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// starts with

fun Any.startsWithList(target: String, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.startsWith(target) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// ends with

fun Any.endssWithList(target: String, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.endssWith(target) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// contains

fun Any.containsList(target: String, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.contains(target) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// not contains

fun Any.notContainsList(target: String, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.notContains(target) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// credit card number

fun Any.creditCardNumberList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.creditCardNumber() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}

// credit card number with spaces

fun Any.creditCardNumberWithSpacesList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.creditCardNumberWithSpaces() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// credit card number with dashes

fun Any.creditCardNumberWithDashesList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.creditCardNumberWithDashes() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}

// valid url

fun Any.validUrlList(vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.validUrl() {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}


// regex pattern

fun Any.regexList(pattern: String, vararg strsList: String, callback: (view: String, message: String) -> Unit) : Boolean
{
    var result = false
    for (str in strsList)
    {
        result = str.regex(pattern) {
            callback.invoke(str, it)
        }

        if (result == false)
            return false
    }
    return result
}

