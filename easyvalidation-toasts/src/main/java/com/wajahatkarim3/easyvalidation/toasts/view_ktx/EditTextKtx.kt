package com.wajahatkarim3.easyvalidation.toasts.view_ktx

import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.view_ktx.validator

fun EditText.nonEmptyToast(errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
            }
            .check()
}

fun EditText.nonEmptyToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }
            .check()
}

fun EditText.nonEmptyToast(callback: (message: String) -> Unit): Boolean {
    return nonEmptyToast(callback, null)
}


fun EditText.minLengthToast(minLength: Int, errorMsg: String? = null): Boolean {
    return validator().minLength(minLength, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)

    }.check()
}

fun EditText.minLengthToast(minLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().minLength(minLength, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.minLengthToast(minLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().minLength(minLength)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.maxLengthToast(maxLength: Int, errorMsg: String? = null): Boolean {
    return validator().maxLength(maxLength, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)

    }.check()
}

fun EditText.maxLengthToast(maxLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().maxLength(maxLength, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.maxLengthToast(maxLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().maxLength(maxLength)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.validEmailToast(errorMsg: String? = null): Boolean {
    return validator().validEmail(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.validEmailToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().validEmail(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.validEmailToast(callback: (message: String) -> Unit): Boolean {
    return validator().validEmail()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.validNumberToast(errorMsg: String? = null): Boolean {
    return validator().validNumber(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.validNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().validNumber(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.validNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().validNumber()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThanToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().greaterThan(number, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.greaterThanToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().greaterThan(number, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThanToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().greaterThan(number)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThanOrEqualToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().greaterThanOrEqual(number, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.greaterThanOrEqualToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().greaterThanOrEqual(number, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.greaterThanOrEqualToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.lessThanToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().lessThan(number, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.lessThanToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().lessThan(number, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.lessThanToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThan(number)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.lessThanOrEqualToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().lessThanOrEqual(number, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.lessThanOrEqualToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().lessThanOrEqual(number, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.lessThanOrEqualToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.numberEqualToToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().numberEqualTo(number, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.numberEqualToToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().numberEqualTo(number, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.numberEqualToToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().numberEqualTo(number)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.allUpperCaseToast(errorMsg: String? = null): Boolean {
    return validator().allUpperCase(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.allUpperCase(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().allUpperCase(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.allUpperCaseToast(callback: (message: String) -> Unit): Boolean {
    return validator().allUpperCase()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.allLowerCase(errorMsg: String? = null): Boolean {
    return validator().allLowerCase(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.allLowerCaseToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().allLowerCase(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.allLowerCaseToast(callback: (message: String) -> Unit): Boolean {
    return validator().allLowerCase()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}


fun EditText.atleastOneUpperCaseToast(errorMsg: String? = null): Boolean {
    return validator().atLeastOneUpperCase(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.atleastOneUpperCaseToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().atLeastOneUpperCase(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneUpperCaseToast(callback: (message: String) -> Unit): Boolean {
    return validator().atLeastOneUpperCase()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneLowerCaseToast(errorMsg: String? = null): Boolean {
    return validator().atLeastOneLowerCase(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.atleastOneLowerCaseToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().atLeastOneLowerCase(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneLowerCaseToast(callback: (message: String) -> Unit): Boolean {
    return validator().atLeastOneLowerCase()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneNumberToast(errorMsg: String? = null): Boolean {
    return validator().atLeastOneNumber(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.atleastOneNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().atLeastOneNumber(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().atLeastOneNumber()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNumberToast(errorMsg: String? = null): Boolean {
    return validator().startWithNumber(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.startWithNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().startWithNumber(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNumber()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNonNumberToast(errorMsg: String? = null): Boolean {
    return validator().startWithNonNumber(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.startWithNonNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().startWithNonNumber(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.startWithNonNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNonNumber()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}


fun EditText.noNumbersToast(errorMsg: String? = null): Boolean {
    return validator().noNumbers(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.noNumbersToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().noNumbers(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.noNumbersToast(callback: (message: String) -> Unit): Boolean {
    return validator().noNumbers()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.onlyNumbersToast(errorMsg: String? = null): Boolean {
    return validator().onlyNumbers(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.onlyNumbersToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().onlyNumbers(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.onlyNumbersToast(callback: (message: String) -> Unit): Boolean {
    return validator().onlyNumbers()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.noSpecialCharactersToast(errorMsg: String? = null): Boolean {
    return validator().noSpecialCharacters(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.noSpecialCharactersToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().noSpecialCharacters(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.noSpecialCharactersToast(callback: (message: String) -> Unit): Boolean {
    return validator().noSpecialCharacters()
            .addErrorCallback {

                showToast(it)

                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneSpecialCharactersToast(errorMsg: String? = null): Boolean {
    return validator().atLeastOneSpecialCharacters(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)

    }.check()
}

fun EditText.atleastOneSpecialCharactersToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().atLeastOneSpecialCharacters(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.atleastOneSpecialCharactersToast(callback: (message: String) -> Unit): Boolean {
    return validator().atLeastOneSpecialCharacters()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.textEqualToToast(target: String, errorMsg: String? = null): Boolean {
    return validator().textEqualTo(target, errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.textEqualToToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().textEqualTo(target, errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.textEqualToToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textEqualTo(target)
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.textNotEqualToToast(target: String, errorMsg: String? = null): Boolean {
    return validator().textNotEqualTo(target, errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.textNotEqualToToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().textNotEqualTo(target, errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.textNotEqualToToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textNotEqualTo(target)
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.startsWithToast(target: String, errorMsg: String? = null): Boolean {
    return validator().startsWith(target, errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.startsWithToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().startsWith(target, errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.startsWithToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().startsWith(target)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}


fun EditText.endsWithToast(target: String, errorMsg: String? = null): Boolean {
    return validator().endsWith(target, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.endsWithToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().endsWith(target, errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.endsWithToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().endsWith(target)
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.containsToast(target: String, errorMsg: String? = null): Boolean {
    return validator().contains(target, errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.containsToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().contains(target, errorMsg)
            .addErrorCallback {


                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.containsToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().contains(target)
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.notContainsToast(target: String, errorMsg: String? = null): Boolean {
    return validator().notContains(target, errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.notContainsToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().notContains(target, errorMsg)
            .addErrorCallback {


                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.notContainsToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().notContains(target)
            .addErrorCallback {


                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberToast(errorMsg: String? = null): Boolean {
    return validator().creditCardNumber(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.creditCardNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().creditCardNumber(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumber()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithSpacesToast(errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithSpaces(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.creditCardNumberWithSpacesToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithSpaces(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithSpacesToast(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithDashesToast(errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithDashes(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.creditCardNumberWithDashesToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithDashes(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.creditCardNumberWithDashesToast(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.validUrlToast(errorMsg: String? = null): Boolean {
    return validator().validUrl(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.validUrlToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().validUrl(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.validUrlToast(callback: (message: String) -> Unit): Boolean {
    return validator().validUrl()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun EditText.regexToast(pattern: String, errorMsg: String? = null): Boolean {
    return validator().regex(pattern, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun EditText.regexToast(pattern: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().regex(pattern, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun EditText.regexToast(pattern: String, callback: (message: String) -> Unit): Boolean {
    return validator().regex(pattern)
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}
