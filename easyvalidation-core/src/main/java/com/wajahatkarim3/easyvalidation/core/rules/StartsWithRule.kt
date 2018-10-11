package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns true if the text starts with the given text
 *
 * @author Wajahat Karim
 */
class StartsWithRule(val target: String, var errorMsg: String = "Should start with $target") : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return text.startsWith(target)
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}