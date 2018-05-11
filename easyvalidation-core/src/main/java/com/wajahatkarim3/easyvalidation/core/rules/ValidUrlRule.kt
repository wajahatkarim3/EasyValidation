package com.wajahatkarim3.easyvalidation.core.rules

import android.util.Patterns

/**
 * Returns true if the text is a valid URL
 *
 * @author Wajahat Karim
 */
class ValidUrlRule : BaseRule
{
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return Patterns.WEB_URL.matcher(text).matches()
    }

    override fun getErrorMessage(): String = "Invalid web URL"
}