package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns true if the text is not empty. And returns false if text is empty.
 *
 * @author Wajahat Karim
 */
class NonEmptyRule : BaseRule
{
    override fun validate(text: String): Boolean = !text.isEmpty()

    override fun getErrorMessage(): String = "Can't be empty!"
}