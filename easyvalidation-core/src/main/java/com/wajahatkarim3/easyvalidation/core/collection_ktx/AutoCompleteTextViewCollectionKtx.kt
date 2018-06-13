package com.wajahatkarim3.easyvalidation.core.collection_ktx

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import android.widget.AutoCompleteTextView
import com.wajahatkarim3.easyvalidation.core.view_ktx.*

fun Any.nonEmptyList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.nonEmpty {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.nonEmptyList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).nonEmpty {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.nonEmptyList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).nonEmpty {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Min Length

fun Any.minLengthList(minLength: Int, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.minLength(minLength) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.minLengthList(minLength: Int, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).minLength(minLength) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.minLengthList(minLength: Int, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).minLength(minLength) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}


// Max Length

fun Any.maxLengthList(maxLength: Int, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.maxLength(maxLength) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.maxLengthList(maxLength: Int, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).maxLength(maxLength) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.maxLengthList(maxLength: Int, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).maxLength(maxLength) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Valid Email

fun Any.validEmailList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.validEmail() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validEmailList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).validEmail() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validEmailList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).validEmail() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Valid Number

fun Any.validNumberList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.validNumber() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).validNumber() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).validNumber() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Greater Than

fun Any.greaterThanList(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.greaterThan(number) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.greaterThanList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).greaterThan(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.greaterThanList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).greaterThan(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Greater Than Or Equal

fun Any.greaterThanOrEqualList(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.greaterThanOrEqual(number) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.greaterThanOrEqualList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).greaterThanOrEqual(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.greaterThanOrEqualList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).greaterThanOrEqual(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Less Than

fun Any.lessThanList(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.lessThan(number) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.lessThanList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).lessThan(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.lessThanList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).lessThan(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Less Than Or Equal

fun Any.lessThanOrEqualnList(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.lessThanOrEqual(number) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.lessThanOrEqualList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).lessThanOrEqual(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.lessThanOrEqualList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).lessThanOrEqual(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Number Equal To

fun Any.numberEqualToList(number: Number, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.numberEqualTo(number) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.numberEqualToList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).numberEqualTo(number) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.numberEqualToList(number: Number, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).numberEqualTo(number) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// All Upper Case

fun Any.allUperCaseList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.allUperCase() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.allUperCaseList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).allUperCase() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.allUperCaseList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).allUperCase() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// All Lower Case

fun Any.allLowerCaseList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.allLowerCase() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.allLowerCaseList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).allLowerCase() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.allLowerCaseList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).allLowerCase() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one upper Case

fun Any.atleastOneUpperCaseList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.atleastOneUpperCase() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneUpperCaseList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).atleastOneUpperCase() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneUpperCaseList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).atleastOneUpperCase() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one lower Case

fun Any.atleastOneLowerCaseList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.atleastOneLowerCase() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneLowerCaseList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).atleastOneLowerCase() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneLowerCaseList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).atleastOneLowerCase() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one number

fun Any.atleastOneNumberList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.atleastOneNumber() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).atleastOneNumber() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).atleastOneNumber() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Starts with number

fun Any.startWithNumberList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.startWithNumber() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startWithNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).startWithNumber() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startWithNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).startWithNumber() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Starts with non number

fun Any.startWithNonNumberList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.startWithNonNumber() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startWithNonNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).startWithNonNumber() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startWithNonNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).startWithNonNumber() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
// noNumbers

fun Any.noNumbersList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.noNumbers() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.noNumbersList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).noNumbers() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.noNumbersList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).noNumbers() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// only numbers

fun Any.onlyNumbersList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.onlyNumbers() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.onlyNumbersList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).onlyNumbers() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.onlyNumbersList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).onlyNumbers() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// no special characters

fun Any.noSpecialCharactersList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.noSpecialCharacters() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.noSpecialCharactersList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).noSpecialCharacters() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.noSpecialCharactersList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).noSpecialCharacters() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// at least one special characters

fun Any.atleastOneSpecialCharactersList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.atleastOneSpecialCharacters() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneSpecialCharactersList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).atleastOneSpecialCharacters() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneSpecialCharactersList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).atleastOneSpecialCharacters() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// text equal to

fun Any.textEqualToList(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.textEqualTo(target) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.textEqualToList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).textEqualTo(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.textEqualToList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).textEqualTo(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// text not equal to

fun Any.textNotEqualToList(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.textNotEqualTo(target) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.textNotEqualToList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).textNotEqualTo(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.textNotEqualToList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).textNotEqualTo(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// starts with

fun Any.startsWithList(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.startsWith(target) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startsWithList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).startsWith(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startsWithList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).startsWith(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// ends with

fun Any.endssWithList(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.endssWith(target) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.endssWithList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).endssWith(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.endssWithList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).endssWith(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// contains

fun Any.containsList(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.contains(target) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.containsList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).contains(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.containsList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).contains(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// not contains

fun Any.notContainsList(target: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.notContains(target) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.notContainsList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).notContains(target) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.notContainsList(target: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).notContains(target) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number

fun Any.creditCardNumberList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.creditCardNumber() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).creditCardNumber() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).creditCardNumber() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number with spaces

fun Any.creditCardNumberWithSpacesList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.creditCardNumberWithSpaces() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithSpacesList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).creditCardNumberWithSpaces() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithSpacesList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).creditCardNumberWithSpaces() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number with dashes

fun Any.creditCardNumberWithDashesList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.creditCardNumberWithDashes() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithDashesList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).creditCardNumberWithDashes() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithDashesList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).creditCardNumberWithDashes() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
// valid url

fun Any.validUrlList(vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.validUrl() {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validUrlList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).validUrl() {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validUrlList(vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).validUrl() {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// regex pattern

fun Any.regexList(pattern: String, vararg autoCompletesList: AutoCompleteTextView, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (autocomplete in autoCompletesList)
    {
        result = autocomplete.regex(pattern) {
            callback.invoke(autocomplete, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.regexList(pattern: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in autoCompletesIds)
    {
        result = findViewById<AutoCompleteTextView>(id).regex(pattern) {
            callback.invoke(findViewById<AutoCompleteTextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.regexList(pattern: String, vararg autoCompletesIds: Int, callback: (view: AutoCompleteTextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in autoCompletesIds)
            {
                result = v.findViewById<AutoCompleteTextView>(id).regex(pattern) {
                    callback.invoke(v.findViewById<AutoCompleteTextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
