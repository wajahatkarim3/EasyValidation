package com.wajahatkarim3.easyvalidation.core.collection_ktx

import android.app.Activity
import android.support.design.widget.TextInputLayout
import android.support.v4.app.Fragment
import com.wajahatkarim3.easyvalidation.core.view_ktx.allLowerCase
import com.wajahatkarim3.easyvalidation.core.view_ktx.allUpperCase
import com.wajahatkarim3.easyvalidation.core.view_ktx.atLeastOneLowerCase
import com.wajahatkarim3.easyvalidation.core.view_ktx.atLeastOneNumber
import com.wajahatkarim3.easyvalidation.core.view_ktx.atLeastOneSpecialCharacters
import com.wajahatkarim3.easyvalidation.core.view_ktx.atLeastOneUpperCase
import com.wajahatkarim3.easyvalidation.core.view_ktx.contains
import com.wajahatkarim3.easyvalidation.core.view_ktx.creditCardNumber
import com.wajahatkarim3.easyvalidation.core.view_ktx.creditCardNumberWithDashes
import com.wajahatkarim3.easyvalidation.core.view_ktx.creditCardNumberWithSpaces
import com.wajahatkarim3.easyvalidation.core.view_ktx.endsWith
import com.wajahatkarim3.easyvalidation.core.view_ktx.greaterThan
import com.wajahatkarim3.easyvalidation.core.view_ktx.greaterThanOrEqual
import com.wajahatkarim3.easyvalidation.core.view_ktx.lessThan
import com.wajahatkarim3.easyvalidation.core.view_ktx.lessThanOrEqual
import com.wajahatkarim3.easyvalidation.core.view_ktx.maxLength
import com.wajahatkarim3.easyvalidation.core.view_ktx.minLength
import com.wajahatkarim3.easyvalidation.core.view_ktx.noNumbers
import com.wajahatkarim3.easyvalidation.core.view_ktx.noSpecialCharacters
import com.wajahatkarim3.easyvalidation.core.view_ktx.nonEmpty
import com.wajahatkarim3.easyvalidation.core.view_ktx.notContains
import com.wajahatkarim3.easyvalidation.core.view_ktx.numberEqualTo
import com.wajahatkarim3.easyvalidation.core.view_ktx.onlyNumbers
import com.wajahatkarim3.easyvalidation.core.view_ktx.regex
import com.wajahatkarim3.easyvalidation.core.view_ktx.startWithNonNumber
import com.wajahatkarim3.easyvalidation.core.view_ktx.startWithNumber
import com.wajahatkarim3.easyvalidation.core.view_ktx.startsWith
import com.wajahatkarim3.easyvalidation.core.view_ktx.textEqualTo
import com.wajahatkarim3.easyvalidation.core.view_ktx.textNotEqualTo
import com.wajahatkarim3.easyvalidation.core.view_ktx.validEmail
import com.wajahatkarim3.easyvalidation.core.view_ktx.validNumber
import com.wajahatkarim3.easyvalidation.core.view_ktx.validUrl

fun Any.nonEmptyList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.nonEmpty {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.nonEmptyList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).nonEmpty {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.nonEmptyList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).nonEmpty {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Min Length

fun Any.minLengthList(minLength: Int, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.minLength(minLength) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.minLengthList(minLength: Int, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).minLength(minLength) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.minLengthList(minLength: Int, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).minLength(minLength) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}


// Max Length

fun Any.maxLengthList(maxLength: Int, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.maxLength(maxLength) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.maxLengthList(maxLength: Int, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).maxLength(maxLength) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.maxLengthList(maxLength: Int, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).maxLength(maxLength) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Valid Email

fun Any.validEmailList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.validEmail {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validEmailList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).validEmail {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validEmailList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).validEmail {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Valid Number

fun Any.validNumberList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.validNumber {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).validNumber {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).validNumber {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Greater Than

fun Any.greaterThanList(number: Number, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.greaterThan(number) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.greaterThanList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).greaterThan(number) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.greaterThanList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).greaterThan(number) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Greater Than Or Equal

fun Any.greaterThanOrEqualList(number: Number, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.greaterThanOrEqual(number) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.greaterThanOrEqualList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).greaterThanOrEqual(number) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.greaterThanOrEqualList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).greaterThanOrEqual(number) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Less Than

fun Any.lessThanList(number: Number, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.lessThan(number) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.lessThanList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).lessThan(number) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.lessThanList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).lessThan(number) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Less Than Or Equal

fun Any.lessThanOrEqualnList(number: Number, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.lessThanOrEqual(number) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.lessThanOrEqualList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).lessThanOrEqual(number) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.lessThanOrEqualList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).lessThanOrEqual(number) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Number Equal To

fun Any.numberEqualToList(number: Number, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.numberEqualTo(number) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.numberEqualToList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).numberEqualTo(number) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.numberEqualToList(number: Number, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).numberEqualTo(number) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// All Upper Case

fun Any.allUperCaseList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.allUpperCase {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.allUperCaseList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).allUpperCase {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.allUperCaseList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).allUpperCase {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// All Lower Case

fun Any.allLowerCaseList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.allLowerCase {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.allLowerCaseList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).allLowerCase {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.allLowerCaseList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).allLowerCase {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one upper Case

fun Any.atleastOneUpperCaseList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.atLeastOneUpperCase {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atleastOneUpperCaseList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).atLeastOneUpperCase {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atleastOneUpperCaseList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).atLeastOneUpperCase {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one lower Case

fun Any.atleastOneLowerCaseList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.atLeastOneLowerCase {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atleastOneLowerCaseList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).atLeastOneLowerCase {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atleastOneLowerCaseList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).atLeastOneLowerCase {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one number

fun Any.atleastOneNumberList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.atLeastOneNumber {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atleastOneNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).atLeastOneNumber {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atleastOneNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).atLeastOneNumber {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Starts with number

fun Any.startWithNumberList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.startWithNumber {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startWithNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).startWithNumber {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startWithNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).startWithNumber {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Starts with non number

fun Any.startWithNonNumberList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.startWithNonNumber {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startWithNonNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).startWithNonNumber {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startWithNonNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).startWithNonNumber {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
// noNumbers

fun Any.noNumbersList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.noNumbers {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.noNumbersList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).noNumbers {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.noNumbersList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).noNumbers {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// only numbers

fun Any.onlyNumbersList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.onlyNumbers {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.onlyNumbersList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).onlyNumbers {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.onlyNumbersList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).onlyNumbers {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// no special characters

fun Any.noSpecialCharactersList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.noSpecialCharacters {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.noSpecialCharactersList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).noSpecialCharacters {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.noSpecialCharactersList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).noSpecialCharacters {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// at least one special characters

fun Any.atleastOneSpecialCharactersList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.atLeastOneSpecialCharacters {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atleastOneSpecialCharactersList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).atLeastOneSpecialCharacters {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atleastOneSpecialCharactersList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).atLeastOneSpecialCharacters {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// text equal to

fun Any.textEqualToList(target: String, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.textEqualTo(target) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.textEqualToList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).textEqualTo(target) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.textEqualToList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).textEqualTo(target) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// text not equal to

fun Any.textNotEqualToList(target: String, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.textNotEqualTo(target) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.textNotEqualToList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).textNotEqualTo(target) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.textNotEqualToList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).textNotEqualTo(target) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// starts with

fun Any.startsWithList(target: String, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.startsWith(target) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startsWithList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).startsWith(target) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startsWithList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).startsWith(target) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// ends with

fun Any.endssWithList(target: String, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.endsWith(target) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.endssWithList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).endsWith(target) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.endssWithList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).endsWith(target) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// contains

fun Any.containsList(target: String, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.contains(target) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.containsList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).contains(target) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.containsList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).contains(target) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// not contains

fun Any.notContainsList(target: String, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.notContains(target) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.notContainsList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).notContains(target) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.notContainsList(target: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).notContains(target) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number

fun Any.creditCardNumberList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.creditCardNumber {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).creditCardNumber {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).creditCardNumber {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number with spaces

fun Any.creditCardNumberWithSpacesList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.creditCardNumberWithSpaces {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithSpacesList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).creditCardNumberWithSpaces {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithSpacesList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).creditCardNumberWithSpaces {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number with dashes

fun Any.creditCardNumberWithDashesList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.creditCardNumberWithDashes {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithDashesList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).creditCardNumberWithDashes {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithDashesList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).creditCardNumberWithDashes {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
// valid url

fun Any.validUrlList(vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.validUrl {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validUrlList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).validUrl {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validUrlList(vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).validUrl {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// regex pattern

fun Any.regexList(pattern: String, vararg textInputLayoutList: TextInputLayout, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (textInputLayout in textInputLayoutList)
    {
        result = textInputLayout.regex(pattern) {
            callback.invoke(textInputLayout, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.regexList(pattern: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textInputLayoutIds)
    {
        result = findViewById<TextInputLayout>(id).regex(pattern) {
            callback.invoke(findViewById(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.regexList(pattern: String, vararg textInputLayoutIds: Int, callback: (view: TextInputLayout, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textInputLayoutIds)
            {
                result = v.findViewById<TextInputLayout>(id).regex(pattern) {
                    callback.invoke(v.findViewById(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
