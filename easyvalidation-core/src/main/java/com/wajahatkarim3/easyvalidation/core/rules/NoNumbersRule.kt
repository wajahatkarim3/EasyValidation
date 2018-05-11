package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns false if the text any number or digit.
 *
 * @author Wajahat Karim
 */
class NoNumbersRule : BaseRule {

    override fun validate(text: String): Boolean = !Validator(text).regex(".*\\d.*").check()

    override fun getErrorMessage(): String = "Should not contain any numbers!"
}