package com.wajahatkarim3.easyvalidation.core.rules

import android.support.annotation.StringRes

/**
 * Returns false if atleast one or more characters are upper case
 *
 * @author Wajahat Karim
 */
class AllLowerCaseRule(@StringRes var errorMsg: String = "All letters should be in lower case.") : BaseRule
{
    override fun validate(text: String): Boolean = text == text.toLowerCase()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}