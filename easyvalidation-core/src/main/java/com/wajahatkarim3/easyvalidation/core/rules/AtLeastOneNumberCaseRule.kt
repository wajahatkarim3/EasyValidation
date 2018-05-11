package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if atleast one or more characters are numbers
 *
 * @author Wajahat Karim
 */
class AtLeastOneNumberCaseRule : BaseRule
{
    override fun validate(text: String): Boolean = Validator(text).regex(".*\\d.*").check()

    override fun getErrorMessage(): String = "At least one letter should be a number."
}