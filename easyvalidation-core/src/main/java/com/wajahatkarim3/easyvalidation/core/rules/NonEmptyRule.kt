package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns true if the text is not empty. And returns false if text is empty.
 *
 * @author Wajahat Karim
 */
class NonEmptyRule(var errorMsg: String = "Can't be empty!") : BaseRule
{
    override fun validate(text: String): Boolean = !text.isEmpty()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}