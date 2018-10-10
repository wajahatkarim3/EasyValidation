package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns true if the text ends with the given text
 *
 * @author Wajahat Karim
 */
class EndsWithRule(val target: String, var errorMsg: String = "Should end with $target") : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return text.endsWith(target)
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}