package com.wajahatkarim3.easyvalidation.core.view_ktx

import android.support.design.widget.TextInputLayout
import com.wajahatkarim3.easyvalidation.core.Validator

fun TextInputLayout.validator(): Validator {
    return Validator(editText?.text.toString())
}

fun TextInputLayout.nonEmpty(errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg).check()
}

fun TextInputLayout.nonEmpty(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().nonEmpty(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }
        .check()
}

fun TextInputLayout.nonEmpty(callback: (message: String) -> Unit): Boolean {
    return validator().nonEmpty()
        .addErrorCallback {
            callback.invoke(it)
        }
        .check()
}

fun TextInputLayout.minLength(minLength: Int, errorMsg: String? = null): Boolean {
    return validator().minLength(minLength, errorMsg).check()
}

fun TextInputLayout.minLength(
    minLength: Int,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().minLength(minLength, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.minLength(minLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().minLength(minLength)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.maxLength(maxLength: Int, errorMsg: String? = null): Boolean {
    return validator().maxLength(maxLength, errorMsg).check()
}

fun TextInputLayout.maxLength(
    maxLength: Int,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().maxLength(maxLength, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.maxLength(maxLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().maxLength(maxLength)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.validEmail(errorMsg: String? = null): Boolean {
    return validator().validEmail(errorMsg).check()
}

fun TextInputLayout.validEmail(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().validEmail(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.validEmail(callback: (message: String) -> Unit): Boolean {
    return validator().validEmail()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.validNumber(errorMsg: String? = null): Boolean {
    return validator().validNumber(errorMsg).check()
}

fun TextInputLayout.validNumber(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().validNumber(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.validNumber(callback: (message: String) -> Unit): Boolean {
    return validator().validNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.greaterThan(number: Number, errorMsg: String? = null): Boolean {
    return validator().greaterThan(number, errorMsg).check()
}

fun TextInputLayout.greaterThan(
    number: Number,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().greaterThan(number, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.greaterThan(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().greaterThan(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.greaterThanOrEqual(number: Number, errorMsg: String? = null): Boolean {
    return validator().greaterThanOrEqual(number, errorMsg).check()
}

fun TextInputLayout.greaterThanOrEqual(
    number: Number,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().greaterThanOrEqual(number, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.greaterThanOrEqual(
    number: Number,
    callback: (message: String) -> Unit
): Boolean {
    return validator().greaterThanOrEqual(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.lessThan(number: Number, errorMsg: String? = null): Boolean {
    return validator().lessThan(number, errorMsg).check()
}

fun TextInputLayout.lessThan(
    number: Number,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().lessThan(number, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.lessThan(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThan(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.lessThanOrEqual(number: Number, errorMsg: String? = null): Boolean {
    return validator().lessThanOrEqual(number, errorMsg).check()
}

fun TextInputLayout.lessThanOrEqual(
    number: Number,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().lessThanOrEqual(number, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.lessThanOrEqual(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThanOrEqual(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.numberEqualTo(number: Number, errorMsg: String? = null): Boolean {
    return validator().numberEqualTo(number, errorMsg).check()
}

fun TextInputLayout.numberEqualTo(
    number: Number,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().numberEqualTo(number, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.numberEqualTo(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().numberEqualTo(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.allUpperCase(errorMsg: String? = null): Boolean {
    return validator().allUpperCase(errorMsg).check()
}

fun TextInputLayout.allUpperCase(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().allUpperCase(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.allUpperCase(callback: (message: String) -> Unit): Boolean {
    return validator().allUpperCase()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.allLowerCase(errorMsg: String? = null): Boolean {
    return validator().allLowerCase(errorMsg).check()
}

fun TextInputLayout.allLowerCase(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().allLowerCase(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.allLowerCase(callback: (message: String) -> Unit): Boolean {
    return validator().allLowerCase()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atLeastOneUpperCase(errorMsg: String? = null): Boolean {
    return validator().atLeastOneUpperCase(errorMsg).check()
}

fun TextInputLayout.atLeastOneUpperCase(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().atLeastOneUpperCase(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atLeastOneUpperCase(callback: (message: String) -> Unit): Boolean {
    return validator().atLeastOneUpperCase()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atLeastOneLowerCase(errorMsg: String? = null): Boolean {
    return validator().atLeastOneLowerCase(errorMsg).check()
}

fun TextInputLayout.atLeastOneLowerCase(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().atLeastOneLowerCase(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atLeastOneLowerCase(callback: (message: String) -> Unit): Boolean {
    return validator().atLeastOneLowerCase()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atLeastOneNumber(errorMsg: String? = null): Boolean {
    return validator().atLeastOneNumber(errorMsg).check()
}

fun TextInputLayout.atLeastOneNumber(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().atLeastOneNumber(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atLeastOneNumber(callback: (message: String) -> Unit): Boolean {
    return validator().atLeastOneNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.startWithNumber(errorMsg: String? = null): Boolean {
    return validator().startWithNumber(errorMsg).check()
}

fun TextInputLayout.startWithNumber(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().startWithNumber(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.startWithNumber(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.startWithNonNumber(errorMsg: String? = null): Boolean {
    return validator().startWithNonNumber(errorMsg).check()
}

fun TextInputLayout.startWithNonNumber(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().startWithNonNumber(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.startWithNonNumber(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNonNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.noNumbers(errorMsg: String? = null): Boolean {
    return validator().noNumbers(errorMsg).check()
}

fun TextInputLayout.noNumbers(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().noNumbers(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.noNumbers(callback: (message: String) -> Unit): Boolean {
    return validator().noNumbers()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.onlyNumbers(errorMsg: String? = null): Boolean {
    return validator().onlyNumbers(errorMsg).check()
}

fun TextInputLayout.onlyNumbers(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().onlyNumbers(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.onlyNumbers(callback: (message: String) -> Unit): Boolean {
    return validator().onlyNumbers()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.noSpecialCharacters(errorMsg: String? = null): Boolean {
    return validator().noSpecialCharacters(errorMsg).check()
}

fun TextInputLayout.noSpecialCharacters(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().noSpecialCharacters(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.noSpecialCharacters(callback: (message: String) -> Unit): Boolean {
    return validator().noSpecialCharacters()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atLeastOneSpecialCharacters(errorMsg: String? = null): Boolean {
    return validator().atLeastOneSpecialCharacters(errorMsg).check()
}

fun TextInputLayout.atLeastOneSpecialCharacters(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().atLeastOneSpecialCharacters(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atLeastOneSpecialCharacters(callback: (message: String) -> Unit): Boolean {
    return validator().atLeastOneSpecialCharacters()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.textEqualTo(target: String, errorMsg: String? = null): Boolean {
    return validator().textEqualTo(target, errorMsg).check()
}

fun TextInputLayout.textEqualTo(
    target: String,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().textEqualTo(target, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.textEqualTo(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textEqualTo(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.textNotEqualTo(target: String, errorMsg: String? = null): Boolean {
    return validator().textNotEqualTo(target, errorMsg).check()
}

fun TextInputLayout.textNotEqualTo(
    target: String,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().textNotEqualTo(target, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.textNotEqualTo(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textNotEqualTo(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.startsWith(target: String, errorMsg: String? = null): Boolean {
    return validator().startsWith(target, errorMsg).check()
}

fun TextInputLayout.startsWith(
    target: String,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().startsWith(target, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.startsWith(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().startsWith(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.endsWith(target: String, errorMsg: String? = null): Boolean {
    return validator().endsWith(target, errorMsg).check()
}

fun TextInputLayout.endsWith(
    target: String,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().endsWith(target, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.endsWith(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().endsWith(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.contains(target: String, errorMsg: String? = null): Boolean {
    return validator().contains(target, errorMsg).check()
}

fun TextInputLayout.contains(
    target: String,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().contains(target, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.contains(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().contains(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.notContains(target: String, errorMsg: String? = null): Boolean {
    return validator().notContains(target, errorMsg).check()
}

fun TextInputLayout.notContains(
    target: String,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().notContains(target, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.notContains(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().notContains(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.creditCardNumber(errorMsg: String? = null): Boolean {
    return validator().creditCardNumber(errorMsg).check()
}

fun TextInputLayout.creditCardNumber(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().creditCardNumber(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.creditCardNumber(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.creditCardNumberWithSpaces(errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithSpaces(errorMsg).check()
}

fun TextInputLayout.creditCardNumberWithSpaces(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().creditCardNumberWithSpaces(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.creditCardNumberWithSpaces(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithSpaces()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.creditCardNumberWithDashes(errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithDashes(errorMsg).check()
}

fun TextInputLayout.creditCardNumberWithDashes(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().creditCardNumberWithDashes(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.creditCardNumberWithDashes(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithDashes()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.validUrl(errorMsg: String? = null): Boolean {
    return validator().validUrl(errorMsg).check()
}

fun TextInputLayout.validUrl(
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().validUrl(errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.validUrl(callback: (message: String) -> Unit): Boolean {
    return validator().validUrl()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.regex(pattern: String, errorMsg: String? = null): Boolean {
    return validator().regex(pattern, errorMsg).check()
}

fun TextInputLayout.regex(
    pattern: String,
    callback: (message: String) -> Unit,
    errorMsg: String? = null
): Boolean {
    return validator().regex(pattern, errorMsg)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.regex(pattern: String, callback: (message: String) -> Unit): Boolean {
    return validator().regex(pattern)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}
