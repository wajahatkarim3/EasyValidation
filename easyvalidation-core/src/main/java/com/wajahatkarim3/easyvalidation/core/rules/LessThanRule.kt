package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.view_ktx.validNumber
import java.text.NumberFormat

/**
 * Returns false if the text is number greater than the given target number
 *
 * @author Wajahat Karim
 */
class LessThanRule(var target: Number = 0, var errorMsg: String = "Should be less than $target") : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        // Negative
        if (text.startsWith("-"))
        {
            var txtNum = text.substringAfter("-")
            if (txtNum.validNumber())
            {
                var number = NumberFormat.getNumberInstance().parse(txtNum)
                number = number.toFloat() * -1
                return (number.toFloat() < target.toFloat())
            }
            return false
        }
        // Positive
        else {
            if (text.validNumber())
            {
                var number = NumberFormat.getNumberInstance().parse(text)
                return (number.toFloat() < target.toFloat())
            }
            return false
        }
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}