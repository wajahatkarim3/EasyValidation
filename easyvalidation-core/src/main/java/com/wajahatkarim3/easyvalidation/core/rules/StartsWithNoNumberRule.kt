package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns false if text starts with any number
 *
 * @author Wajahat Karim
 */
class StartsWithNoNumberRule(var errorMsg: String = "Should not start with any number.") : BaseRule
{
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return !Validator(text).regex("^(\\d+.*|-\\d+.*)").check()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}