package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns false if atleast one or more characters are lower case
 *
 * @author Wajahat Karim
 */
class AllUpercCaseRule : BaseRule
{
    override fun validate(text: String): Boolean = text == text.toUpperCase()

    override fun getErrorMessage(): String = "All letters should be in upper case."
}