package com.wajahatkarim3.easyvalidation.toasts.view_ktx

import android.widget.Spinner
import com.wajahatkarim3.easyvalidation.core.view_ktx.validator

fun Spinner.nonEmptyToast(errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.nonEmptyToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }
            .check()
}

fun Spinner.nonEmptyToast(callback: (message: String) -> Unit): Boolean {
    return validator().nonEmpty()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }
            .check()
}

fun Spinner.minLengthToast(minLength: Int, errorMsg: String? = null): Boolean {
    return validator().minLength(minLength, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.minLengthToast(minLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().minLength(minLength, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.minLengthToast(minLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().minLength(minLength)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.maxLengthToast(maxLength: Int, errorMsg: String? = null): Boolean {
    return validator().maxLength(maxLength, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.maxLengthToast(maxLength: Int, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().maxLength(maxLength, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.maxLengthToast(maxLength: Int, callback: (message: String) -> Unit): Boolean {
    return validator().maxLength(maxLength)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.validEmailToast(errorMsg: String? = null): Boolean {
    return validator().validEmail(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.validEmailToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().validEmail(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.validEmailToast(callback: (message: String) -> Unit): Boolean {
    return validator().validEmail()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.validNumberToast(errorMsg: String? = null): Boolean {
    return validator().validNumber(errorMsg).addErrorCallback {

        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.validNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().validNumber(errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.validNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().validNumber()
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThanToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().greaterThan(number, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.greaterThanToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().greaterThan(number, errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThanToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().greaterThan(number)
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThanOrEqualToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().greaterThanOrEqual(number, errorMsg).addErrorCallback {

        showToast(it)
    }.check()
}

fun Spinner.greaterThanOrEqualToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().greaterThanOrEqual(number, errorMsg)
            .addErrorCallback {

                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.greaterThanOrEqualToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().greaterThanOrEqual(number)
            .addErrorCallback {

                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThanToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().lessThan(number, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.lessThanToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().lessThan(number, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThanToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThan(number)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThanOrEqualToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().lessThanOrEqual(number, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.lessThanOrEqualToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().lessThanOrEqual(number, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.lessThanOrEqualToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().lessThanOrEqual(number)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.numberEqualToToast(number: Number, errorMsg: String? = null): Boolean {
    return validator().numberEqualTo(number, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.numberEqualToToast(number: Number, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().numberEqualTo(number, errorMsg)
            .addErrorCallback {
                callback.invoke(it)
            }.check()
}

fun Spinner.numberEqualToToast(number: Number, callback: (message: String) -> Unit): Boolean {
    return validator().numberEqualTo(number)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.allUpperCaseToast(errorMsg: String? = null): Boolean {
    return validator().allUpperCase(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.allUpperCaseToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().allUpperCase(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.allUpperCaseToast(callback: (message: String) -> Unit): Boolean {
    return validator().allUpperCase()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}


fun Spinner.allLowerCaseToast(errorMsg: String? = null): Boolean {
    return validator().allLowerCase(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.allLowerCaseToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().allLowerCase(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.allLowerCaseToast(callback: (message: String) -> Unit): Boolean {
    return validator().allLowerCase()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneUpperCaseToast(errorMsg: String? = null): Boolean {
    return validator().atleastOneUpperCase(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.atleastOneUpperCaseToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().atleastOneUpperCase(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneUpperCaseToast(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneUpperCase()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneLowerCaseToast(errorMsg: String? = null): Boolean {
    return validator().atleastOneLowerCase(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.atleastOneLowerCaseToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().atleastOneLowerCase(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneLowerCaseToast(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneLowerCase()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneNumberToast(errorMsg: String? = null): Boolean {
    return validator().atleastOneNumber(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.atleastOneNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().atleastOneNumber(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneNumber()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.startWithNumberToast(errorMsg: String? = null): Boolean {
    return validator().startWithNumber(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)

    }.check()
}

fun Spinner.startWithNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().startWithNumber(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.startWithNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNumber()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.startWithNonNumberToast(errorMsg: String? = null): Boolean {
    return validator().startWithNonNumber(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.startWithNonNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().startWithNonNumber(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.startWithNonNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().startWithNonNumber()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.noNumbersToast(errorMsg: String? = null): Boolean {
    return validator().noNumbers(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.noNumbersToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().noNumbers(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.noNumbersToast(callback: (message: String) -> Unit): Boolean {
    return validator().noNumbers()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}


fun Spinner.onlyNumbersToast(errorMsg: String? = null): Boolean {
    return validator().onlyNumbers(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    } .check()
}

fun Spinner.onlyNumbersToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().onlyNumbers(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.onlyNumbersToast(callback: (message: String) -> Unit): Boolean {
    return validator().onlyNumbers()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.noSpecialCharactersToast(errorMsg: String? = null): Boolean {
    return validator().noSpecialCharacters(errorMsg).addErrorCallback {
        showToast( errorMsg?:it)
    }.check()
}

fun Spinner.noSpecialCharactersToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().noSpecialCharacters(errorMsg)
            .addErrorCallback {
                showToast( errorMsg?:it)
                callback.invoke(it)
            }.check()
}

fun Spinner.noSpecialCharactersToast(callback: (message: String) -> Unit): Boolean {
    return validator().noSpecialCharacters()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneSpecialCharactersToast(errorMsg: String? = null): Boolean {
    return validator().atleastOneSpecialCharacters(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.atleastOneSpecialCharactersToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().atleastOneSpecialCharacters(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.atleastOneSpecialCharactersToast(callback: (message: String) -> Unit): Boolean {
    return validator().atleastOneSpecialCharacters()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.textEqualToToast(target: String, errorMsg: String? = null): Boolean {
    return validator().textEqualTo(target, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.textEqualToToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().textEqualTo(target, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.textEqualToToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textEqualTo(target)
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.textNotEqualToToast(target: String, errorMsg: String? = null): Boolean {
    return validator().textNotEqualTo(target, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.textNotEqualToToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().textNotEqualTo(target, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.textNotEqualToToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().textNotEqualTo(target)
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.startsWithToast(target: String, errorMsg: String? = null): Boolean {
    return validator().startsWith(target, errorMsg) .addErrorCallback {
        showToast( errorMsg?:it)
    }.check()
}

fun Spinner.startsWithToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().startsWith(target, errorMsg)
            .addErrorCallback {
                showToast( errorMsg?:it)
                callback.invoke(it)
            }.check()
}

fun Spinner.startsWithToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().startsWith(target)
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.endsWithToast(target: String, errorMsg: String? = null): Boolean {
    return validator().endsWith(target, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.endsWithToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().endsWith(target, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.endsWithToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().endsWith(target)
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.containsToast(target: String, errorMsg: String? = null): Boolean {
    return validator().contains(target, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.containsToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().contains(target, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.containsToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().contains(target)
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.notContainsToast(target: String, errorMsg: String? = null): Boolean {
    return validator().notContains(target, errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.notContainsToast(target: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().notContains(target, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.notContainsToast(target: String, callback: (message: String) -> Unit): Boolean {
    return validator().notContains(target)
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}


fun Spinner.creditCardNumberToast(errorMsg: String? = null): Boolean {
    return validator().creditCardNumber(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.creditCardNumberToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().creditCardNumber(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberToast(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumber()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithSpacesToast(errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithSpaces(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.creditCardNumberWithSpacesToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithSpaces(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithSpacesToast(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithSpaces()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithDashesToast(errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithDashes(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.creditCardNumberWithDashesToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().creditCardNumberWithDashes(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.creditCardNumberWithDashesToast(callback: (message: String) -> Unit): Boolean {
    return validator().creditCardNumberWithDashes()
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}

fun Spinner.validUrlToast(errorMsg: String? = null): Boolean {
    return validator().validUrl(errorMsg).addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.validUrlToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().validUrl(errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.validUrlToast(callback: (message: String) -> Unit): Boolean {
    return validator().validUrl()
            .addErrorCallback {
                showToast(it)
                callback.invoke(it)
            }.check()
}

fun Spinner.regexToast(pattern: String, errorMsg: String? = null): Boolean {
    return validator().regex(pattern, errorMsg) .addErrorCallback {
        showToast(errorMsg ?: it)
    }.check()
}

fun Spinner.regexToast(pattern: String, callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().regex(pattern, errorMsg)
            .addErrorCallback {
                showToast(errorMsg ?: it)
                callback.invoke(it)
            }.check()
}

fun Spinner.regexToast(pattern: String, callback: (message: String) -> Unit): Boolean {
    return validator().regex(pattern)
            .addErrorCallback {
                showToast( it)
                callback.invoke(it)
            }.check()
}