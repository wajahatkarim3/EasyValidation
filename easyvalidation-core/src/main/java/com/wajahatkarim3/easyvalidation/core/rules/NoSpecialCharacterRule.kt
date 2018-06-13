package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if text contain no special characters
 *
 * @author Wajahat Karim
 */
class NoSpecialCharacterRule : BaseRule
{
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return Validator(text).regex("[A-Za-z0-9]+").check()
    }

    override fun getErrorMessage(): String = "Should not contain any special characters"
}