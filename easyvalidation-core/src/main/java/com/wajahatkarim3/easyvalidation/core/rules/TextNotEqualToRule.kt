package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns true if the text is not equal to the given text
 *
 * @author Wajahat Karim
 */
class TextNotEqualToRule(val target: String, var errorMsg: String = "Should not be equal to $target") : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return true

        return text != target
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}