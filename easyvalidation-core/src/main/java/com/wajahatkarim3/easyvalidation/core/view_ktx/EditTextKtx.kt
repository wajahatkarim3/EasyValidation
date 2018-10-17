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

fun EditText.minLength(minLength: Int): Boolean {
    return validator()
            .minLength(minLength)
            .check()
}

fun EditText.minLength(minLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.maxLength(maxLength: Int): Boolean {
    return validator().maxLength(maxLength).check()
}

fun EditText.maxLength(maxLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.validEmail(): Boolean {
    return validator().validEmail().check()
}

fun EditText.validEmail(callback: (message: String) -> Unit): Boolean {
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.validNumber(): Boolean {
    return validator().validNumber().check()
}

fun EditText.validNumber(callback: (message: String) -> Unit): Boolean {
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThan(number: Number): Boolean {
    return validator().greaterThan(number).check()
}

fun EditText.greaterThan(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThanOrEqual(number: Number): Boolean {
    return validator().greaterThanOrEqual(number).check()
}

fun EditText.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.lessThan(number: Number): Boolean {
    return validator().lessThan(number).check()
}

fun EditText.lessThan(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.lessThanOrEqual(number: Number): Boolean {
    return validator().lessThanOrEqual(number).check()
}

fun EditText.lessThanOrEqual(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.numberEqualTo(number: Number): Boolean {
    return validator().numberEqualTo(number).check()
}

fun EditText.numberEqualTo(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.allUperCase(): Boolean {
    return validator().allUpperCase().check()
}

fun EditText.allUperCase(callback: (message: String) -> Unit): Boolean {
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.allLowerCase(): Boolean {
    return validator().allLowerCase().check()
}

fun EditText.allLowerCase(callback: (message: String) -> Unit): Boolean {
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneUpperCase(): Boolean {
    return validator().atleastOneUpperCase().check()
}

fun EditText.atleastOneUpperCase(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneLowerCase(): Boolean {
    return validator().atleastOneLowerCase().check()
}

fun EditText.atleastOneLowerCase(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneNumber(): Boolean {
    return validator().atleastOneNumber().check()
}

fun EditText.atleastOneNumber(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNumber(): Boolean {
    return validator().startWithNumber().check()
}

fun EditText.startWithNumber(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNonNumber(): Boolean {
    return validator().startWithNonNumber().check()
}

fun EditText.startWithNonNumber(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.noNumbers(): Boolean {
    return validator().noNumbers().check()
}

fun EditText.noNumbers(callback: (message: String) -> Unit): Boolean {
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.onlyNumbers(): Boolean {
    return validator().onlyNumbers().check()
}

fun EditText.onlyNumbers(callback: (message: String) -> Unit): Boolean {
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.noSpecialCharacters(): Boolean {
    return validator().noSpecialCharacters().check()
}

fun EditText.noSpecialCharacters(callback: (message: String) -> Unit): Boolean {
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneSpecialCharacters(): Boolean {
    return validator().atleastOneSpecialCharacters().check()
}

fun EditText.atleastOneSpecialCharacters(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.textEqualTo(target: String): Boolean {
    return validator().textEqualTo(target).check()
}

fun EditText.textEqualTo(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.textNotEqualTo(target: String): Boolean {
    return validator().textNotEqualTo(target).check()
}

fun EditText.textNotEqualTo(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.startsWith(target: String): Boolean {
    return validator().startsWith(target).check()
}

fun EditText.startsWith(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.endssWith(target: String): Boolean {
    return validator().endsWith(target).check()
}

fun EditText.endssWith(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.contains(target: String): Boolean {
    return validator().contains(target).check()
}

fun EditText.contains(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.notContains(target: String): Boolean {
    return validator().notContains(target).check()
}

fun EditText.notContains(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumber(): Boolean {
    return validator().creditCardNumber().check()
}

fun EditText.creditCardNumber(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithSpaces(): Boolean {
    return validator().creditCardNumberWithSpaces().check()
}

fun EditText.creditCardNumberWithSpaces(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithDashes(): Boolean {
    return validator().creditCardNumberWithDashes().check()
}

fun EditText.creditCardNumberWithDashes(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.validUrl(): Boolean {
    return validator().validUrl().check()
}

fun EditText.validUrl(callback: (message: String) -> Unit): Boolean {
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun EditText.regex(pattern: String): Boolean {
    return validator().regex(pattern).check()
}

fun EditText.regex(pattern: String, callback: (message: String) -> Unit): Boolean {
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}