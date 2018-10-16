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

fun TextView.minLength(minLength: Int): Boolean {
    return validator().minLength(minLength).check()
}

fun TextView.minLength(minLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().minLength(minLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.maxLength(maxLength: Int): Boolean {
    return validator().maxLength(maxLength).check()
}

fun TextView.maxLength(maxLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().maxLength(maxLength)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.validEmail(): Boolean {
    return validator().validEmail().check()
}

fun TextView.validEmail(callback: (message: String) -> Unit): Boolean {
    return validator().validEmail()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.validNumber(): Boolean {
    return validator().validNumber().check()
}

fun TextView.validNumber(callback: (message: String) -> Unit): Boolean {
    return validator().validNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.greaterThan(number: Number): Boolean {
    return validator().greaterThan(number).check()
}

fun TextView.greaterThan(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().greaterThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.greaterThanOrEqual(number: Number): Boolean {
    return validator().greaterThanOrEqual(number).check()
}

fun TextView.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.lessThan(number: Number): Boolean {
    return validator().lessThan(number).check()
}

fun TextView.lessThan(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThan(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.lessThanOrEqual(number: Number): Boolean {
    return validator().lessThanOrEqual(number).check()
}

fun TextView.lessThanOrEqual(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.numberEqualTo(number: Number): Boolean {
    return validator().numberEqualTo(number).check()
}

fun TextView.numberEqualTo(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().numberEqualTo(number)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.allUperCase(): Boolean {
    return validator().allUpperCase().check()
}

fun TextView.allUperCase(callback: (message: String) -> Unit): Boolean {
    return validator().allUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.allLowerCase(): Boolean {
    return validator().allLowerCase().check()
}

fun TextView.allLowerCase(callback: (message: String) -> Unit): Boolean {
    return validator().allLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneUpperCase(): Boolean {
    return validator().atleastOneUpperCase().check()
}

fun TextView.atleastOneUpperCase(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneLowerCase(): Boolean {
    return validator().atleastOneLowerCase().check()
}

fun TextView.atleastOneLowerCase(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneNumber(): Boolean {
    return validator().atleastOneNumber().check()
}

fun TextView.atleastOneNumber(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.startWithNumber(): Boolean {
    return validator().startWithNumber().check()
}

fun TextView.startWithNumber(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.startWithNonNumber(): Boolean {
    return validator().startWithNonNumber().check()
}

fun TextView.startWithNonNumber(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNonNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.noNumbers(): Boolean {
    return validator().noNumbers().check()
}

fun TextView.noNumbers(callback: (message: String) -> Unit): Boolean {
    return validator().noNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.onlyNumbers(): Boolean {
    return validator().onlyNumbers().check()
}

fun TextView.onlyNumbers(callback: (message: String) -> Unit): Boolean {
    return validator().onlyNumbers()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.noSpecialCharacters(): Boolean {
    return validator().noSpecialCharacters().check()
}

fun TextView.noSpecialCharacters(callback: (message: String) -> Unit): Boolean {
    return validator().noSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.atleastOneSpecialCharacters(): Boolean {
    return validator().atleastOneSpecialCharacters().check()
}

fun TextView.atleastOneSpecialCharacters(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.textEqualTo(target: String): Boolean {
    return validator().textEqualTo(target).check()
}

fun TextView.textEqualTo(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.textNotEqualTo(target: String): Boolean {
    return validator().textNotEqualTo(target).check()
}

fun TextView.textNotEqualTo(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.startsWith(target: String): Boolean {
    return validator().startsWith(target).check()
}

fun TextView.startsWith(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().startsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.endssWith(target: String): Boolean {
    return validator().endsWith(target).check()
}

fun TextView.endssWith(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().endsWith(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.contains(target: String): Boolean {
    return validator().contains(target).check()
}

fun TextView.contains(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().contains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.notContains(target: String): Boolean {
    return validator().notContains(target).check()
}

fun TextView.notContains(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().notContains(target)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.creditCardNumber(): Boolean {
    return validator().creditCardNumber().check()
}

fun TextView.creditCardNumber(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumber()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.creditCardNumberWithSpaces(): Boolean {
    return validator().creditCardNumberWithSpaces().check()
}

fun TextView.creditCardNumberWithSpaces(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.creditCardNumberWithDashes(): Boolean {
    return validator().creditCardNumberWithDashes().check()
}

fun TextView.creditCardNumberWithDashes(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.validUrl(): Boolean {
    return validator().validUrl().check()
}

fun TextView.validUrl(callback: (message: String) -> Unit): Boolean {
    return validator().validUrl()
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun TextView.regex(pattern: String): Boolean {
    return validator().regex(pattern).check()
}

fun TextView.regex(pattern: String, callback: (message: String) -> Unit): Boolean {
    return validator().regex(pattern)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}