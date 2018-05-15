package com.wajahatkarim3.easyvalidation.core.collection_ktx

import android.app.Activity
import android.content.Context
import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.view_ktx.nonEmpty

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