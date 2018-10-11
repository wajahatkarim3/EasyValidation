package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if text contain at least one special characters
 *
 * @author Wajahat Karim
 */
class AtleastOneSpecialCharacterRule(var errorMsg: String ="Should contain at least 1 special characters") : BaseRule
{
    override fun validate(text: String): Boolean {
        if (text.isEmpty())
            return false

        return !Validator(text).regex("[A-Za-z0-9]+").check()
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}