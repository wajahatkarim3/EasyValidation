package com.wajahatkarim3.easyvalidation.core.rules

import com.wajahatkarim3.easyvalidation.core.view_ktx.validNumber
import java.math.BigDecimal
import java.math.BigInteger
import java.text.NumberFormat

/**
 * Returns true if the text contains the given text
 *
 * @author Wajahat Karim
 */
class ContainsRule(val target: String) : BaseRule {

    override fun validate(text: String): Boolean {

        if (text.isEmpty())
            return false

        return text.contains(target)
    }

    override fun getErrorMessage(): String = "Should contain $target"

}