package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.view_ktx.validNumber
import java.math.BigDecimal
import java.math.BigInteger
import java.text.NumberFormat

/**
 * Returns true if the text is not equal to the given text
 *
 * @author Wajahat Karim
 */
class TextNotEqualToRule(val target: String) : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return true

        return text != target
    }

    override fun getErrorMessage(): String = "Should not be equal to $target"

}