package com.wajahatkarim3.easyvalidation.toasts.view_ktx

import android.widget.EditText
import android.widget.Toast
import com.wajahatkarim3.easyvalidation.core.view_ktx.validator

fun EditText.nonEmptyToast(errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                Toast.makeText(context, errorMsg, Toast.LENGTH_SHORT).show()
            }
            .check()
}

fun EditText.nonEmptyToast(callback: (message: String) -> Unit, errorMsg: String? = null): Boolean {
    return validator().nonEmpty(errorMsg)
            .addErrorCallback {
                Toast.makeText(context, errorMsg, Toast.LENGTH_SHORT).show()
                callback.invoke(it)
            }
            .check()
}