package com.wajahatkarim3.easyvalidation.toasts.view_ktx

import android.view.View
import android.widget.EditText
import android.widget.Toast

fun View.showToast(message:String){

    Toast.makeText(context.applicationContext, message, Toast.LENGTH_SHORT).show()
}
