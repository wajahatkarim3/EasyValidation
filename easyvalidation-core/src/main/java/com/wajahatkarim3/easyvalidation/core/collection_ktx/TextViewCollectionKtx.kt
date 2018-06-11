package com.wajahatkarim3.easyvalidation.core.collection_ktx

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import android.widget.TextView
import com.wajahatkarim3.easyvalidation.core.view_ktx.*

fun Any.nonEmptyList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.nonEmpty {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.nonEmptyList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).nonEmpty {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.nonEmptyList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).nonEmpty {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Min Length

fun Any.minLengthList(minLength: Int, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.minLength(minLength) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.minLengthList(minLength: Int, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).minLength(minLength) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.minLengthList(minLength: Int, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).minLength(minLength) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}


// Max Length

fun Any.maxLengthList(maxLength: Int, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.maxLength(maxLength) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.maxLengthList(maxLength: Int, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).maxLength(maxLength) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.maxLengthList(maxLength: Int, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).maxLength(maxLength) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Valid Email

fun Any.validEmailList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.validEmail() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validEmailList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).validEmail() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validEmailList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).validEmail() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Valid Number

fun Any.validNumberList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.validNumber() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).validNumber() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).validNumber() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Greater Than

fun Any.greaterThanList(number: Number, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.greaterThan(number) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.greaterThanList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).greaterThan(number) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.greaterThanList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).greaterThan(number) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Greater Than Or Equal

fun Any.greaterThanOrEqualList(number: Number, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.greaterThanOrEqual(number) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.greaterThanOrEqualList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).greaterThanOrEqual(number) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.greaterThanOrEqualList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).greaterThanOrEqual(number) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Less Than

fun Any.lessThanList(number: Number, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.lessThan(number) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.lessThanList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).lessThan(number) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.lessThanList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).lessThan(number) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Less Than Or Equal

fun Any.lessThanOrEqualnList(number: Number, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.lessThanOrEqual(number) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.lessThanOrEqualList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).lessThanOrEqual(number) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.lessThanOrEqualList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).lessThanOrEqual(number) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Number Equal To

fun Any.numberEqualToList(number: Number, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.numberEqualTo(number) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.numberEqualToList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).numberEqualTo(number) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.numberEqualToList(number: Number, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).numberEqualTo(number) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// All Upper Case

fun Any.allUperCaseList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.allUperCase() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.allUperCaseList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).allUperCase() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.allUperCaseList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).allUperCase() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// All Lower Case

fun Any.allLowerCaseList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.allLowerCase() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.allLowerCaseList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).allLowerCase() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.allLowerCaseList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).allLowerCase() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one upper Case

fun Any.atleastOneUpperCaseList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.atleastOneUpperCase() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneUpperCaseList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).atleastOneUpperCase() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneUpperCaseList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).atleastOneUpperCase() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one lower Case

fun Any.atleastOneLowerCaseList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.atleastOneLowerCase() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneLowerCaseList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).atleastOneLowerCase() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneLowerCaseList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).atleastOneLowerCase() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// At least one number

fun Any.atleastOneNumberList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.atleastOneNumber() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).atleastOneNumber() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).atleastOneNumber() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Starts with number

fun Any.startWithNumberList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.startWithNumber() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startWithNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).startWithNumber() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startWithNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).startWithNumber() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// Starts with non number

fun Any.startWithNonNumberList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.startWithNonNumber() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startWithNonNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).startWithNonNumber() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startWithNonNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).startWithNonNumber() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
// noNumbers

fun Any.noNumbersList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.noNumbers() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.noNumbersList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).noNumbers() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.noNumbersList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).noNumbers() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// only numbers

fun Any.onlyNumbersList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.onlyNumbers() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.onlyNumbersList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).onlyNumbers() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.onlyNumbersList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).onlyNumbers() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// no special characters

fun Any.noSpecialCharactersList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.noSpecialCharacters() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.noSpecialCharactersList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).noSpecialCharacters() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.noSpecialCharactersList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).noSpecialCharacters() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// at least one special characters

fun Any.atleastOneSpecialCharactersList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.atleastOneSpecialCharacters() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.atleastOneSpecialCharactersList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).atleastOneSpecialCharacters() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.atleastOneSpecialCharactersList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).atleastOneSpecialCharacters() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// text equal to

fun Any.textEqualToList(target: String, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.textEqualTo(target) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.textEqualToList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).textEqualTo(target) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.textEqualToList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).textEqualTo(target) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// text not equal to

fun Any.textNotEqualToList(target: String, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.textNotEqualTo(target) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.textNotEqualToList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).textNotEqualTo(target) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.textNotEqualToList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).textNotEqualTo(target) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// starts with

fun Any.startsWithList(target: String, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.startsWith(target) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.startsWithList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).startsWith(target) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.startsWithList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).startsWith(target) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// ends with

fun Any.endssWithList(target: String, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.endssWith(target) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.endssWithList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).endssWith(target) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.endssWithList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).endssWith(target) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// contains

fun Any.containsList(target: String, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.contains(target) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.containsList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).contains(target) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.containsList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).contains(target) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// not contains

fun Any.notContainsList(target: String, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.notContains(target) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.notContainsList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).notContains(target) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.notContainsList(target: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).notContains(target) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number

fun Any.creditCardNumberList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.creditCardNumber() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).creditCardNumber() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).creditCardNumber() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number with spaces

fun Any.creditCardNumberWithSpacesList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.creditCardNumberWithSpaces() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithSpacesList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).creditCardNumberWithSpaces() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithSpacesList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).creditCardNumberWithSpaces() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// credit card number with dashes

fun Any.creditCardNumberWithDashesList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.creditCardNumberWithDashes() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.creditCardNumberWithDashesList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).creditCardNumberWithDashes() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.creditCardNumberWithDashesList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).creditCardNumberWithDashes() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
// valid url

fun Any.validUrlList(vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.validUrl() {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.validUrlList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).validUrl() {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.validUrlList(vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).validUrl() {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}

// regex pattern

fun Any.regexList(pattern: String, vararg textViewsList: TextView, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (textview in textViewsList)
    {
        result = textview.regex(pattern) {
            callback.invoke(textview, it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Activity.regexList(pattern: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    for (id in textviewIds)
    {
        result = findViewById<TextView>(id).regex(pattern) {
            callback.invoke(findViewById<TextView>(id), it)
        }

        if (result == false)
            return false
    }
    return result
}

fun Fragment.regexList(pattern: String, vararg textviewIds: Int, callback: (view: TextView, message: String) -> Unit) : Boolean
{
    var result = false
    if (view != null)
    {
        view?.let { v ->
            for (id in textviewIds)
            {
                result = v.findViewById<TextView>(id).regex(pattern) {
                    callback.invoke(v.findViewById<TextView>(id), it)
                }

                if (result == false)
                    return false
            }
        }
    }
    return result
}
