package com.wajahatkarim3.easyvalidation.toasts.collection_ktx

import android.app.Activity
import android.support.v4.app.Fragment
import android.widget.EditText
import com.wajahatkarim3.easyvalidation.toasts.view_ktx.*

fun Any.nonEmptyListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.nonEmptyToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.nonEmptyListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).nonEmptyToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.nonEmptyListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).nonEmptyToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Min Length

fun Any.minLengthListToast(minLength: Int, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.minLengthToast(minLength) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.minLengthListToast(minLength: Int, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).minLengthToast(minLength) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.minLengthListToast(minLength: Int, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).minLengthToast(minLength) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}


// Max Length

fun Any.maxLengthListToast(maxLength: Int, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.maxLengthToast(maxLength) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.maxLengthListToast(maxLength: Int, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).maxLengthToast(maxLength) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.maxLengthListToast(maxLength: Int, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).maxLengthToast(maxLength) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Valid Email

fun Any.validEmailListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.validEmailToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validEmailListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).validEmailToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validEmailListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).validEmailToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Valid Number

fun Any.validNumberListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.validNumberToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).validNumberToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).validNumberToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Greater Than

fun Any.greaterThanListToast(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.greaterThanToast(number) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.greaterThanListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).greaterThanToast(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.greaterThanListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).greaterThanToast(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Greater Than Or Equal

fun Any.greaterThanOrEqualListToast(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.greaterThanOrEqualToast(number) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.greaterThanOrEqualListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).greaterThanOrEqualToast(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.greaterThanOrEqualListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).greaterThanOrEqualToast(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Less Than

fun Any.lessThanListToast(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.lessThanToast(number) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.lessThanListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).lessThanToast(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.lessThanListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).lessThanToast(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Less Than Or Equal

fun Any.lessThanOrEqualListToast(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.lessThanOrEqualToast(number) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.lessThanOrEqualListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).lessThanOrEqualToast(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.lessThanOrEqualListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).lessThanOrEqualToast(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Number Equal To

fun Any.numberEqualToListToast(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.numberEqualToToast(number) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.numberEqualToListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).numberEqualToToast(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.numberEqualToListToast(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).numberEqualToToast(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// All Upper Case

fun Any.allUpperCaseListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.allUpperCaseToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.allUpperCaseListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).allUpperCaseToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.allUpperCaseListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).allUpperCaseToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// All Lower Case

fun Any.allLowerCaseListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.allLowerCaseToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.allLowerCaseListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).allLowerCaseToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.allLowerCaseListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).allLowerCaseToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one upper Case

fun Any.atLeastOneUpperCaseListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.atleastOneUpperCaseToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneUpperCaseListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).atleastOneUpperCaseToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneUpperCaseListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).atleastOneUpperCaseToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one lower Case

fun Any.atLeastOneLowerCaseListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.atleastOneLowerCaseToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneLowerCaseListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).atleastOneLowerCaseToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneLowerCaseListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).atleastOneLowerCaseToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one number

fun Any.atLeastOneNumberListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.atleastOneNumberToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).atleastOneNumberToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).atleastOneNumberToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Starts with number

fun Any.startWithNumberListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.startWithNumberToast {
            callback.invoke(edittext, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startWithNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).startWithNumberToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startWithNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).startWithNumberToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Starts with non number

fun Any.startWithNonNumberListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.startWithNonNumberToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startWithNonNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).startWithNonNumberToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startWithNonNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).startWithNonNumberToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
// noNumbers

fun Any.noNumbersListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.noNumbersToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.noNumbersListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).noNumbersToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.noNumbersListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).noNumbersToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// only numbers

fun Any.onlyNumbersListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.onlyNumbersToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.onlyNumbersListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).onlyNumbersToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.onlyNumbersListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).onlyNumbersToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// no special characters

fun Any.noSpecialCharactersListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.noSpecialCharactersToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.noSpecialCharactersListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).noSpecialCharactersToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.noSpecialCharactersListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).noSpecialCharactersToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// at least one special characters

fun Any.atLeastOneSpecialCharactersListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.atleastOneSpecialCharactersToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneSpecialCharactersListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).atleastOneSpecialCharactersToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneSpecialCharactersListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).atleastOneSpecialCharactersToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// text equal to

fun Any.textEqualToListToast(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.textEqualToToast(target) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.textEqualToListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).textEqualToToast(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.textEqualToListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).textEqualToToast(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// text not equal to

fun Any.textNotEqualToListToast(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.textNotEqualToToast(target) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.textNotEqualToListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).textNotEqualToToast(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.textNotEqualToListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).textNotEqualToToast(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// starts with

fun Any.startsWithListToast(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.startsWithToast(target) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startsWithListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).startsWithToast(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startsWithListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).startsWithToast(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// ends with

fun Any.endsWithListToast(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.endsWithToast(target) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.endsWithListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).endsWithToast(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.endsWithListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).endsWithToast(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// contains

fun Any.containsListToast(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.containsToast(target) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.containsListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).containsToast(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.containsListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).containsToast(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// not contains

fun Any.notContainsListToast(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.notContainsToast(target) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.notContainsListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).notContainsToast(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.notContainsListToast(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).notContainsToast(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number

fun Any.creditCardNumberListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.creditCardNumberToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).creditCardNumberToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).creditCardNumberToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number with spaces

fun Any.creditCardNumberWithSpacesListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.creditCardNumberWithSpacesToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithSpacesListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).creditCardNumberWithSpacesToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithSpacesListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).creditCardNumberWithSpacesToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number with dashes

fun Any.creditCardNumberWithDashesListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.creditCardNumberWithDashesToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithDashesListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).creditCardNumberWithDashesToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithDashesListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).creditCardNumberWithDashesToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
// valid url

fun Any.validUrlListToast(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.validUrlToast {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validUrlListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).validUrlToast {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validUrlListToast(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).validUrlToast {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// regex pattern

fun Any.regexListToast(pattern: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (editText in editTextList)
    {
        result = editText.regexToast(pattern) {
            callback.invoke(editText, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.regexListToast(pattern: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).regexToast(pattern) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.regexListToast(pattern: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).regexToast(pattern) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
