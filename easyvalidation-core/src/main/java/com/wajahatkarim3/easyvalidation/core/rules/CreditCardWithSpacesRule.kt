package com.wajahatkarim3.easyvalidation.core.rules

import java.util.*



/**
 * Returns true if the text is valid credit card number with spaces between 4 characters
 * This supports Visa, Master Card, American Express, Diners Club, Discover, and JCB
 *
 * @author Wajahat Karim
 */
class CreditCardWithSpacesRule(var errorMsg: String = "Invalid Credit Card Number!") : BaseRule {

    override fun validate(text: String): Boolean {
        val listOfPattern = ArrayList<String>()
        val ptVisa = "^4[0-9]{6,}$"
        listOfPattern.add(ptVisa)
        val ptMasterCard = "^5[1-5][0-9]{5,}$"
        listOfPattern.add(ptMasterCard)
        val ptAmeExp = "^3[47][0-9]{5,}$"
        listOfPattern.add(ptAmeExp)
        val ptDinClb = "^3(?:0[0-5]|[68][0-9])[0-9]{4,}$"
        listOfPattern.add(ptDinClb)
        val ptDiscover = "^6(?:011|5[0-9]{2})[0-9]{3,}$"
        listOfPattern.add(ptDiscover)
        val ptJcb = "^(?:2131|1800|35[0-9]{3})[0-9]{3,}$"
        listOfPattern.add(ptJcb)

        // remove all spaces
        var newtext = text.replace(" ", "")

        for (pattern in listOfPattern)
        {
            if (newtext.matches(Regex(pattern)))
                return true
        }
        return false
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}