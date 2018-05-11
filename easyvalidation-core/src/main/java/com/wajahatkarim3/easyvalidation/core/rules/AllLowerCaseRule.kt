package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns false if atleast one or more characters are upper case
 *
 * @author Wajahat Karim
 */
class AllLowerCaseRule : BaseRule
{
    override fun validate(text: String): Boolean = text == text.toLowerCase()

    override fun getErrorMessage(): String = "All letters should be in lower case."
}