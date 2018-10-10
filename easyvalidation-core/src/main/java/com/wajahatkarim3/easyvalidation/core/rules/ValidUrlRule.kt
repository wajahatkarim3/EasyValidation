package com.wajahatkarim3.easyvalidation.core.rules

import android.util.Patterns

/**
 * Returns true if the text is a valid URL
 *
 * @author Wajahat Karim
 */
class ValidUrlRule(var errorMsg: String = "Invalid web URL") : BaseRule
{
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return Patterns.WEB_URL.matcher(text).matches()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}