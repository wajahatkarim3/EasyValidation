package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if the text is any valid number
 *
 * @author Wajahat Karim
 */
class ValidNumberRule(var errorMsg: String = "Invalid Number!") : BaseRule {

    override fun validate(text: String): Boolean
    {
        if (text.isEmpty())
            return false

        if (text.startsWith("-"))
        {
            var txtNum = text.substringAfter("-")
            return Validator(txtNum).regex("^[0-9]\\d*(\\.\\d+)?$").check()
        }
        else
        {
            return Validator(text).regex("^[0-9]\\d*(\\.\\d+)?$").check()
        }
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}