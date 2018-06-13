package com.wajahatkarim3.easyvalidation.core.collection_ktx

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.view_ktx.*

fun Any.nonEmptyList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.nonEmpty {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.nonEmptyList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).nonEmpty {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.nonEmptyList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).nonEmpty {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Min Length

fun Any.minLengthList(minLength: Int, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.minLength(minLength) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.minLengthList(minLength: Int, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).minLength(minLength) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.minLengthList(minLength: Int, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).minLength(minLength) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}


// Max Length

fun Any.maxLengthList(maxLength: Int, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.maxLength(maxLength) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.maxLengthList(maxLength: Int, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).maxLength(maxLength) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.maxLengthList(maxLength: Int, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).maxLength(maxLength) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Valid Email

fun Any.validEmailList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.validEmail() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validEmailList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).validEmail() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validEmailList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).validEmail() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Valid Number

fun Any.validNumberList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.validNumber() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).validNumber() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).validNumber() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Greater Than

fun Any.greaterThanList(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.greaterThan(number) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.greaterThanList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).greaterThan(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.greaterThanList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).greaterThan(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Greater Than Or Equal

fun Any.greaterThanOrEqualList(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.greaterThanOrEqual(number) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.greaterThanOrEqualList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).greaterThanOrEqual(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.greaterThanOrEqualList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).greaterThanOrEqual(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Less Than

fun Any.lessThanList(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.lessThan(number) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.lessThanList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).lessThan(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.lessThanList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).lessThan(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Less Than Or Equal

fun Any.lessThanOrEqualnList(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.lessThanOrEqual(number) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.lessThanOrEqualList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).lessThanOrEqual(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.lessThanOrEqualList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).lessThanOrEqual(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Number Equal To

fun Any.numberEqualToList(number: Number, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.numberEqualTo(number) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.numberEqualToList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).numberEqualTo(number) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.numberEqualToList(number: Number, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).numberEqualTo(number) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// All Upper Case

fun Any.allUperCaseList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.allUperCase() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.allUperCaseList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).allUperCase() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.allUperCaseList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).allUperCase() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// All Lower Case

fun Any.allLowerCaseList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.allLowerCase() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.allLowerCaseList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).allLowerCase() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.allLowerCaseList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).allLowerCase() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one upper Case

fun Any.atleastOneUpperCaseList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.atleastOneUpperCase() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneUpperCaseList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).atleastOneUpperCase() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneUpperCaseList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).atleastOneUpperCase() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one lower Case

fun Any.atleastOneLowerCaseList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.atleastOneLowerCase() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneLowerCaseList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).atleastOneLowerCase() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneLowerCaseList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).atleastOneLowerCase() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one number

fun Any.atleastOneNumberList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.atleastOneNumber() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).atleastOneNumber() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).atleastOneNumber() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Starts with number

fun Any.startWithNumberList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.startWithNumber() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startWithNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).startWithNumber() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startWithNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).startWithNumber() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Starts with non number

fun Any.startWithNonNumberList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.startWithNonNumber() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startWithNonNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).startWithNonNumber() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startWithNonNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).startWithNonNumber() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
// noNumbers

fun Any.noNumbersList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.noNumbers() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.noNumbersList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).noNumbers() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.noNumbersList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).noNumbers() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// only numbers

fun Any.onlyNumbersList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.onlyNumbers() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.onlyNumbersList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).onlyNumbers() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.onlyNumbersList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).onlyNumbers() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// no special characters

fun Any.noSpecialCharactersList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.noSpecialCharacters() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.noSpecialCharactersList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).noSpecialCharacters() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.noSpecialCharactersList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).noSpecialCharacters() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// at least one special characters

fun Any.atleastOneSpecialCharactersList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.atleastOneSpecialCharacters() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneSpecialCharactersList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).atleastOneSpecialCharacters() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneSpecialCharactersList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).atleastOneSpecialCharacters() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// text equal to

fun Any.textEqualToList(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.textEqualTo(target) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.textEqualToList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).textEqualTo(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.textEqualToList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).textEqualTo(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// text not equal to

fun Any.textNotEqualToList(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.textNotEqualTo(target) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.textNotEqualToList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).textNotEqualTo(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.textNotEqualToList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).textNotEqualTo(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// starts with

fun Any.startsWithList(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.startsWith(target) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startsWithList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).startsWith(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startsWithList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).startsWith(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// ends with

fun Any.endssWithList(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.endssWith(target) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.endssWithList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).endssWith(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.endssWithList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).endssWith(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// contains

fun Any.containsList(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.contains(target) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.containsList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).contains(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.containsList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).contains(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// not contains

fun Any.notContainsList(target: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.notContains(target) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.notContainsList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).notContains(target) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.notContainsList(target: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).notContains(target) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number

fun Any.creditCardNumberList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.creditCardNumber() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).creditCardNumber() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).creditCardNumber() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number with spaces

fun Any.creditCardNumberWithSpacesList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.creditCardNumberWithSpaces() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithSpacesList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).creditCardNumberWithSpaces() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithSpacesList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).creditCardNumberWithSpaces() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number with dashes

fun Any.creditCardNumberWithDashesList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.creditCardNumberWithDashes() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithDashesList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).creditCardNumberWithDashes() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithDashesList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).creditCardNumberWithDashes() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
// valid url

fun Any.validUrlList(vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.validUrl() {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validUrlList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).validUrl() {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validUrlList(vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).validUrl() {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// regex pattern

fun Any.regexList(pattern: String, vararg editTextList: EditText, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (edittext in editTextList)
    {
        result = edittext.regex(pattern) {
            callback.invoke(edittext, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.regexList(pattern: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in editTextIds)
    {
        result = findViewById<EditText>(id).regex(pattern) {
            callback.invoke(findViewById<EditText>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.regexList(pattern: String, vararg editTextIds: Int, callback: (view: EditText, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in editTextIds)
            {
                result = v.findViewById<EditText>(id).regex(pattern) {
                    callback.invoke(v.findViewById<EditText>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
