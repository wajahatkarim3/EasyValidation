package com.wajahatkarim3.easyvalidation.core.rules

import android.support.annotation.StringRes

/**
 * Returns false if atleast one or more characters are lower case
 *
 * @author Wajahat Karim
 */
class AllUpercCaseRule(@StringRes var errorMsg: String = "All letters should be in upper case.") : BaseRule
{
    override fun validate(text: String): Boolean = text == text.toUpperCase()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}