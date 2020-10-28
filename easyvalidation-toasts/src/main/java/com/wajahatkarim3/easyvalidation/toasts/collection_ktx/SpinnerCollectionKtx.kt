package com.wajahatkarim3.easyvalidation.toasts.collection_ktx

import android.app.Activity
import android.support.v4.app.Fragment
import android.widget.Spinner
import com.wajahatkarim3.easyvalidation.toasts.view_ktx.*

fun Any.nonEmptyListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.nonEmptyToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.nonEmptyListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).nonEmptyToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.nonEmptyListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).nonEmptyToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Min Length

fun Any.minLengthListToast(minLength: Int, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.minLengthToast(minLength) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.minLengthListToast(minLength: Int, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).minLengthToast(minLength) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.minLengthListToast(minLength: Int, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).minLengthToast(minLength) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}


// Max Length

fun Any.maxLengthListToast(maxLength: Int, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.maxLengthToast(maxLength) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.maxLengthListToast(maxLength: Int, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).maxLengthToast(maxLength) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.maxLengthListToast(maxLength: Int, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).maxLengthToast(maxLength) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Valid Email

fun Any.validEmailListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.validEmailToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validEmailListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).validEmailToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validEmailListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).validEmailToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Valid Number

fun Any.validNumberListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.validNumberToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).validNumberToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).validNumberToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Greater Than

fun Any.greaterThanListToast(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.greaterThanToast(number) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.greaterThanListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).greaterThanToast(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.greaterThanListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).greaterThanToast(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Greater Than Or Equal

fun Any.greaterThanOrEqualListToast(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.greaterThanOrEqualToast(number) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.greaterThanOrEqualListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).greaterThanOrEqualToast(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.greaterThanOrEqualListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).greaterThanOrEqualToast(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Less Than

fun Any.lessThanListToast(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.lessThanToast(number) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.lessThanListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).lessThanToast(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.lessThanListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).lessThanToast(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Less Than Or Equal

fun Any.lessThanOrEqualListToast(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.lessThanOrEqualToast(number) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.lessThanOrEqualListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).lessThanOrEqualToast(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.lessThanOrEqualListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).lessThanOrEqualToast(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Number Equal To

fun Any.numberEqualToListToast(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.numberEqualToToast(number) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.numberEqualToListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).numberEqualToToast(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.numberEqualToListToast(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).numberEqualToToast(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// All Upper Case

fun Any.allUpperCaseListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.allUpperCaseToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.allUpperCaseListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).allUpperCaseToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.allUpperCaseListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).allUpperCaseToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// All Lower Case

fun Any.allLowerCaseListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.allLowerCaseToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.allLowerCaseListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).allLowerCaseToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.allLowerCaseListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).allLowerCaseToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one upper Case

fun Any.atLeastOneUpperCaseListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.atleastOneUpperCaseToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneUpperCaseListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).atleastOneUpperCaseToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneUpperCaseListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).atleastOneUpperCaseToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one lower Case

fun Any.atLeastOneLowerCaseListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.atleastOneLowerCaseToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneLowerCaseList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).atleastOneLowerCaseToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneLowerCaseListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).atleastOneLowerCaseToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one number

fun Any.atLeastOneNumberListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.atleastOneNumberToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).atleastOneNumberToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).atleastOneNumberToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Starts with number

fun Any.startWithNumberListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.startWithNumberToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startWithNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).startWithNumberToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startWithNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).startWithNumberToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Starts with non number

fun Any.startWithNonNumberListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.startWithNonNumberToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startWithNonNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).startWithNonNumberToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startWithNonNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).startWithNonNumberToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
// noNumbers

fun Any.noNumbersListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.noNumbersToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.noNumbersListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).noNumbersToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.noNumbersListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).noNumbersToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// only numbers

fun Any.onlyNumbersListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.onlyNumbersToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.onlyNumbersListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).onlyNumbersToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.onlyNumbersListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).onlyNumbersToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// no special characters

fun Any.noSpecialCharactersListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.noSpecialCharactersToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.noSpecialCharactersListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).noSpecialCharactersToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.noSpecialCharactersListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).noSpecialCharactersToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// at least one special characters

fun Any.atLeastOneSpecialCharactersListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.atleastOneSpecialCharactersToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneSpecialCharactersListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).atleastOneSpecialCharactersToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneSpecialCharactersListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).atleastOneSpecialCharactersToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// text equal to

fun Any.textEqualToListToast(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.textEqualToToast(target) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.textEqualToListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).textEqualToToast(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.textEqualToListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).textEqualToToast(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// text not equal to

fun Any.textNotEqualToListToast(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.textNotEqualToToast(target) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.textNotEqualToListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).textNotEqualToToast(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.textNotEqualToListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).textNotEqualToToast(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// starts with

fun Any.startsWithListToast(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.startsWithToast(target) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startsWithListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).startsWithToast(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startsWithListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).startsWithToast(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// ends with

fun Any.endsWithListToast(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.endsWithToast(target) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.endsWithListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).endsWithToast(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.endsWithListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).endsWithToast(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// contains

fun Any.containsListToast(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.containsToast(target) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.containsListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).containsToast(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.containsListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).containsToast(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// not contains

fun Any.notContainsListToast(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.notContainsToast(target) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.notContainsListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).notContainsToast(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.notContainsListToast(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).notContainsToast(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number

fun Any.creditCardNumberListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.creditCardNumberToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).creditCardNumberToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).creditCardNumberToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number with spaces

fun Any.creditCardNumberWithSpacesListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.creditCardNumberWithSpacesToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithSpacesListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).creditCardNumberWithSpacesToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithSpacesListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).creditCardNumberWithSpacesToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number with dashes

fun Any.creditCardNumberWithDashesListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.creditCardNumberWithDashesToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithDashesListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).creditCardNumberWithDashesToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithDashesListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).creditCardNumberWithDashesToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
// valid url

fun Any.validUrlListToast(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.validUrlToast {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validUrlListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).validUrlToast {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validUrlListToast(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).validUrlToast {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// regex pattern

fun Any.regexListToast(pattern: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.regexToast(pattern) {
            callback.invoke(spinner, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.regexListToast(pattern: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).regexToast(pattern) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.regexListToast(pattern: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).regexToast(pattern) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
