package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns false if the length of text is less than given minimun length.
 *
 * @author Wajahat Karim
 */
class MinLengthRule(val minLength: Int, var errorMsg: String = "Length should be greater than $minLength") : BaseRule {

    override fun validate(text: String): Boolean {
        return text.length >= minLength
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}