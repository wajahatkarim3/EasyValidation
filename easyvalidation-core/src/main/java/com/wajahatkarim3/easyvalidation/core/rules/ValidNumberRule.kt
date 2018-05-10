package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if the text is any valid number
 *
 * @author Wajahat Karim
 */
class ValidNumberRule : BaseRule {

    override fun validate(text: String): Boolean = Validator(text).regex("^[1-9]\\d*(\\.\\d+)?$").check()

    override fun getErrorMessage(): String = "Invalid Number!"
}