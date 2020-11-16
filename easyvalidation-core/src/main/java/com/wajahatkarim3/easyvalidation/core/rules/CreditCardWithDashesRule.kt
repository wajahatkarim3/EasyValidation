package com.wajahatkarim3.easyvalidation.core.rules


/**
 * Returns true if the text is valid credit card number with dashes between 4 characters
 * This supports Visa, Master Card, American Express, Diners Club, Discover, and JCB
 *
 * @author Wajahat Karim
 */
class CreditCardWithDashesRule(errorMsg: String = "Invalid Credit Card Number!") : CreditCardRule(errorMsg) {

    override fun validate(text: String): Boolean {
        return super.validate(text.replace("-", ""))
    }
}