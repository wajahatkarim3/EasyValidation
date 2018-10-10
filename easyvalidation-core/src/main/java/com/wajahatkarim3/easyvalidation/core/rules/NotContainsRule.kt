package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns false if the text contains the given text
 *
 * @author Wajahat Karim
 */
class NotContainsRule(val target: String, var errorMsg: String = "Should not contain $target") : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return !text.contains(target)
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}