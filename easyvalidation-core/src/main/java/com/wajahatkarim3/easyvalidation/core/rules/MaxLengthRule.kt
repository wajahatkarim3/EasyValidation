package com.wajahatkarim3.easyvalidation.core.rules

/**
 * Returns false if text length is greater than given length
 *
 * @author Wajahat Karim
 */
class MaxLengthRule(val maxLength: Int) : BaseRule {

    override fun validate(text: String): Boolean {
        return text.length <= maxLength
    }

    override fun getErrorMessage(): String {
        return "Length can't be greater than $maxLength"
    }
}