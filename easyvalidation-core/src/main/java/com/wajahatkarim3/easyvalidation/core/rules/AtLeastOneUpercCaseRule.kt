package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if atleast one or more characters are upper case
 *
 * @author Wajahat Karim
 */
class AtLeastOneUpercCaseRule(var errorMsg: String = "At least one letter should be in upper case.") : BaseRule
{
    override fun validate(text: String): Boolean = Validator(text).regex("^(?=.*[A-Z]).+\$").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}