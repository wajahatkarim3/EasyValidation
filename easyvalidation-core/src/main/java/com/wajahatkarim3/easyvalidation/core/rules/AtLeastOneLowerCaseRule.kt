package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if atleast one or more characters are lower case
 *
 * @author Wajahat Karim
 */
class AtLeastOneLowerCaseRule(var errorMsg: String = "At least one letter should be in lower case.") : BaseRule
{
    override fun validate(text: String): Boolean = Validator(text).regex("^(?=.*[a-z]).+\$").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}