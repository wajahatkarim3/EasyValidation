package com.wajahatkarim3.easyvalidation.core.collection_ktx

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import android.widget.Spinner
import com.wajahatkarim3.easyvalidation.core.view_ktx.*

fun Any.nonEmptyList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.nonEmpty {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.nonEmptyList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).nonEmpty {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.nonEmptyList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).nonEmpty {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Min Length

fun Any.minLengthList(minLength: Int, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.minLength(minLength) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.minLengthList(minLength: Int, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).minLength(minLength) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.minLengthList(minLength: Int, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).minLength(minLength) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}


// Max Length

fun Any.maxLengthList(maxLength: Int, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.maxLength(maxLength) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.maxLengthList(maxLength: Int, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).maxLength(maxLength) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.maxLengthList(maxLength: Int, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).maxLength(maxLength) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Valid Email

fun Any.validEmailList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.validEmail() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validEmailList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).validEmail() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validEmailList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).validEmail() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Valid Number

fun Any.validNumberList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.validNumber() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).validNumber() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).validNumber() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Greater Than

fun Any.greaterThanList(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.greaterThan(number) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.greaterThanList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).greaterThan(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.greaterThanList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).greaterThan(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Greater Than Or Equal

fun Any.greaterThanOrEqualList(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.greaterThanOrEqual(number) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.greaterThanOrEqualList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).greaterThanOrEqual(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.greaterThanOrEqualList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).greaterThanOrEqual(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Less Than

fun Any.lessThanList(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.lessThan(number) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.lessThanList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).lessThan(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.lessThanList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).lessThan(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Less Than Or Equal

fun Any.lessThanOrEqualnList(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.lessThanOrEqual(number) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.lessThanOrEqualList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).lessThanOrEqual(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.lessThanOrEqualList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).lessThanOrEqual(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Number Equal To

fun Any.numberEqualToList(number: Number, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.numberEqualTo(number) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.numberEqualToList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).numberEqualTo(number) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.numberEqualToList(number: Number, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).numberEqualTo(number) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// All Upper Case

fun Any.allUperCaseList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.allUperCase() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.allUperCaseList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).allUperCase() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.allUperCaseList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).allUperCase() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// All Lower Case

fun Any.allLowerCaseList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.allLowerCase() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.allLowerCaseList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).allLowerCase() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.allLowerCaseList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).allLowerCase() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one upper Case

fun Any.atleastOneUpperCaseList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.atleastOneUpperCase() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneUpperCaseList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).atleastOneUpperCase() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneUpperCaseList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).atleastOneUpperCase() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one lower Case

fun Any.atleastOneLowerCaseList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.atleastOneLowerCase() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneLowerCaseList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).atleastOneLowerCase() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneLowerCaseList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).atleastOneLowerCase() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one number

fun Any.atleastOneNumberList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.atleastOneNumber() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).atleastOneNumber() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).atleastOneNumber() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Starts with number

fun Any.startWithNumberList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.startWithNumber() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startWithNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).startWithNumber() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startWithNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).startWithNumber() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Starts with non number

fun Any.startWithNonNumberList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.startWithNonNumber() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startWithNonNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).startWithNonNumber() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startWithNonNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).startWithNonNumber() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
// noNumbers

fun Any.noNumbersList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.noNumbers() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.noNumbersList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).noNumbers() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.noNumbersList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).noNumbers() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// only numbers

fun Any.onlyNumbersList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.onlyNumbers() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.onlyNumbersList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).onlyNumbers() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.onlyNumbersList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).onlyNumbers() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// no special characters

fun Any.noSpecialCharactersList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.noSpecialCharacters() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.noSpecialCharactersList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).noSpecialCharacters() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.noSpecialCharactersList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).noSpecialCharacters() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// at least one special characters

fun Any.atleastOneSpecialCharactersList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.atleastOneSpecialCharacters() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneSpecialCharactersList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).atleastOneSpecialCharacters() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneSpecialCharactersList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).atleastOneSpecialCharacters() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// text equal to

fun Any.textEqualToList(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.textEqualTo(target) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.textEqualToList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).textEqualTo(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.textEqualToList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).textEqualTo(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// text not equal to

fun Any.textNotEqualToList(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.textNotEqualTo(target) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.textNotEqualToList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).textNotEqualTo(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.textNotEqualToList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).textNotEqualTo(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// starts with

fun Any.startsWithList(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.startsWith(target) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startsWithList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).startsWith(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startsWithList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).startsWith(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// ends with

fun Any.endssWithList(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.endssWith(target) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.endssWithList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).endssWith(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.endssWithList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).endssWith(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// contains

fun Any.containsList(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.contains(target) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.containsList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).contains(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.containsList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).contains(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// not contains

fun Any.notContainsList(target: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.notContains(target) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.notContainsList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).notContains(target) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.notContainsList(target: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).notContains(target) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number

fun Any.creditCardNumberList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.creditCardNumber() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).creditCardNumber() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).creditCardNumber() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number with spaces

fun Any.creditCardNumberWithSpacesList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.creditCardNumberWithSpaces() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithSpacesList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).creditCardNumberWithSpaces() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithSpacesList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).creditCardNumberWithSpaces() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number with dashes

fun Any.creditCardNumberWithDashesList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.creditCardNumberWithDashes() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithDashesList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).creditCardNumberWithDashes() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithDashesList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).creditCardNumberWithDashes() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
// valid url

fun Any.validUrlList(vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.validUrl() {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validUrlList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).validUrl() {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validUrlList(vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).validUrl() {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// regex pattern

fun Any.regexList(pattern: String, vararg spinnersList: Spinner, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (spinner in spinnersList)
    {
        result = spinner.regex(pattern) {
            callback.invoke(spinner, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.regexList(pattern: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in spinnerIds)
    {
        result = findViewById<Spinner>(id).regex(pattern) {
            callback.invoke(findViewById<Spinner>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.regexList(pattern: String, vararg spinnerIds: Int, callback: (view: Spinner, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in spinnerIds)
            {
                result = v.findViewById<Spinner>(id).regex(pattern) {
                    callback.invoke(v.findViewById<Spinner>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
