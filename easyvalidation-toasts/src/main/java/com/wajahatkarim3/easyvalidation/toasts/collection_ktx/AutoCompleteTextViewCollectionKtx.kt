package com.wajahatkarim3.easyvalidation.toasts.collection_ktx

import android.app.Activity
import android.support.v4.app.Fragment
import android.widget.AutoCompleteTextView
import com.wajahatkarim3.easyvalidation.toasts.view_ktx.*

fun Any.nonEmptyListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.nonEmptyToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.nonEmptyListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).nonEmptyToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.nonEmptyListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).nonEmptyToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Min Length

fun Any.minLengthListToast(minLength: Int, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.minLengthToast(minLength) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.minLengthListToast(minLength: Int, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).minLengthToast(minLength) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.minLengthListToast(minLength: Int, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).minLengthToast(minLength) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}


// Max Length

fun Any.maxLengthListToast(maxLength: Int, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.maxLengthToast(maxLength) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.maxLengthListToast(maxLength: Int, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).maxLengthToast(maxLength) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.maxLengthListToast(maxLength: Int, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).maxLengthToast(maxLength) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Valid Email

fun Any.validEmailListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.validEmailToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validEmailListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).validEmailToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validEmailListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).validEmailToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Valid Number

fun Any.validNumberListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.validNumberToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).validNumberToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).validNumberToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Greater Than

fun Any.greaterThanListToast(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.greaterThanToast(number) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.greaterThanListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).greaterThanToast(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.greaterThanListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).greaterThanToast(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Greater Than Or Equal

fun Any.greaterThanOrEqualListToast(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.greaterThanOrEqualToast(number) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.greaterThanOrEqualListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).greaterThanOrEqualToast(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.greaterThanOrEqualListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).greaterThanOrEqualToast(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Less Than

fun Any.lessThanListToast(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.lessThanToast(number) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.lessThanListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).lessThanToast(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.lessThanListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).lessThanToast(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Less Than Or Equal

fun Any.lessThanOrEqualListToast(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.lessThanOrEqualToast(number) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.lessThanOrEqualListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).lessThanOrEqualToast(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.lessThanOrEqualListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).lessThanOrEqualToast(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Number Equal To

fun Any.numberEqualToListToast(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.numberEqualToToast(number) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.numberEqualToListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).numberEqualToToast(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.numberEqualToListToast(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).numberEqualToToast(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// All Upper Case

fun Any.allUpperCaseListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.allUpperCaseToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.allUpperCaseListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).allUpperCaseToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.allUpperCaseListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).allUpperCaseToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// All Lower Case

fun Any.allLowerCaseListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.allUpperCaseToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.allLowerCaseListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).allLowerCaseToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.allLowerCaseListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).allLowerCaseToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one upper Case

fun Any.atLeastOneUpperCaseListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.atleastOneUpperCaseToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneUpperCaseListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).atleastOneUpperCaseToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneUpperCaseListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).atleastOneUpperCaseToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one lower Case

fun Any.atLeastOneLowerCaseListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.atleastOneLowerCaseToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneLowerCaseListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).atleastOneLowerCaseToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneLowerCaseListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).atleastOneLowerCaseToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// At least one number

fun Any.atLeastOneNumberListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.atleastOneNumberToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).atleastOneNumberToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).atleastOneNumberToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Starts with number

fun Any.startWithNumberListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.startWithNumberToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startWithNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).startWithNumberToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startWithNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).startWithNumberToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// Starts with non number

fun Any.startWithNonNumberListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.startWithNonNumberToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startWithNonNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).startWithNonNumberToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startWithNonNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).startWithNonNumberToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
// noNumbers

fun Any.noNumbersListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.noNumbersToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.noNumbersListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).noNumbersToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.noNumbersListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).noNumbersToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// only numbers

fun Any.onlyNumbersListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.onlyNumbersToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.onlyNumbersListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).onlyNumbersToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.onlyNumbersListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).onlyNumbersToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// no special characters

fun Any.noSpecialCharactersListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.noSpecialCharactersToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.noSpecialCharactersListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).noSpecialCharactersToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.noSpecialCharactersListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).noSpecialCharactersToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// at least one special characters

fun Any.atLeastOneSpecialCharactersListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.atleastOneSpecialCharactersToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.atLeastOneSpecialCharactersListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).atleastOneSpecialCharactersToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.atLeastOneSpecialCharactersListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).atleastOneSpecialCharactersToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// text equal to

fun Any.textEqualToListToast(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.textEqualToToast(target) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.textEqualToListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).textEqualToToast(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.textEqualToListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).textEqualToToast(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// text not equal to

fun Any.textNotEqualToListToast(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.textNotEqualToToast(target) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.textNotEqualToListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).textNotEqualToToast(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.textNotEqualToListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).textNotEqualToToast(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// starts with

fun Any.startsWithListToast(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.startsWithToast(target) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.startsWithListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).startsWithToast(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.startsWithListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).startsWithToast(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// ends with

fun Any.endsWithListToast(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.endsWithToast(target) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.endsWithListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).endsWithToast(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.endsWithListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).endsWithToast(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// contains

fun Any.containsListToast(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.containsToast(target) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.containsListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).containsToast(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.containsListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).containsToast(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// not contains

fun Any.notContainsListToast(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.notContainsToast(target) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.notContainsListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).notContainsToast(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.notContainsListToast(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).notContainsToast(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number

fun Any.creditCardNumberListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.creditCardNumberToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).creditCardNumberToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).creditCardNumberToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number with spaces

fun Any.creditCardNumberWithSpacesListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.creditCardNumberWithSpacesToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithSpacesListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).creditCardNumberWithSpacesToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithSpacesListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).creditCardNumberWithSpacesToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// credit card number with dashes

fun Any.creditCardNumberWithDashesListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.creditCardNumberWithDashesToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithDashesListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).creditCardNumberWithDashesToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithDashesListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).creditCardNumberWithDashesToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
// valid url

fun Any.validUrlListToast(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.validUrlToast {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.validUrlListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).validUrlToast {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.validUrlListToast(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).validUrlToast {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}

// regex pattern

fun Any.regexListToast(pattern: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.regexToast(pattern) {
            callback.invoke(autocomplete, it)
        }

        if (!result)
            return false
    }
    return result
}

fun Activity.regexListToast(pattern: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).regexToast(pattern) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (!result)
            return false
    }
    return result
}

fun Fragment.regexListToast(pattern: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).regexToast(pattern) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (!result)
                    return false
            }
        }
    }
    return result
}
