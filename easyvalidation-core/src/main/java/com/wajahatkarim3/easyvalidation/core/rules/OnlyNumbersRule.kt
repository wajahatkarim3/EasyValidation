package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns false if text contains any alphabetic character
 *
 * @author Wajahat Karim
 */
class OnlyNumbersRule(var errorMsg: String = "Should not contain any alphabet characters!") : BaseRule {

    override fun validate(text: String): Boolean = Validator(text).regex("\\d+").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}