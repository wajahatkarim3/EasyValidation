package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns false if text length is greater than given length
 *
 * @author Wajahat Karim
 */
class MaxLengthRule(val maxLength: Int, var errorMsg: String = "Length should be less than or equal to $maxLength") : BaseRule {

    override fun validate(text: String): Boolean {
        return text.length <= maxLength
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}