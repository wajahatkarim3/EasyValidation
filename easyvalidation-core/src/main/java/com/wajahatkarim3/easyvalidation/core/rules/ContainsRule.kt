package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns true if the text contains the given text
 *
 * @author Wajahat Karim
 */
class ContainsRule(val target: String, var errorMsg: String = "Should contain $target" ) : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return text.contains(target)
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }

}