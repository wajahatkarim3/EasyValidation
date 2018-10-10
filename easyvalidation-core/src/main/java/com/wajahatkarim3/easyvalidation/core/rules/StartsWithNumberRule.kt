package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if text starts with any number
 *
 * @author Wajahat Karim
 */
class StartsWithNumberRule(var errorMsg: String = "Should start with any number.") : BaseRule
{
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return Validator(text).regex("^(\\d+.*|-\\d+.*)").check()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}