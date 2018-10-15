package com.wajahatkarim3.easyvalidation.core

import com.wajahatkarim3.easyvalidation.core.rules.*
import java.math.BigDecimal
import java.math.BigInteger

/**
 * The core Validator builder class for validation operations and checks!
 *
 * This class allows developers to process single or multiple validation checks on input views.
 *
 * @author Wajahat Karim
 * @date 08/05/18
 */
class Validator(val text: String)
{
    /*
     * Boolean to determine whether all the validations have passed successfully!
     * If any validation check is failed, then the value to
     * false and result is returned to developer
     */
    private var isValid = true

    /*
     The error message to be sent in the error callback
     */
    private var errorMessage: String = ""

    /*
     * In case of validation error or failure, this callback is invoked
     */
    var errorCallback: ((message: String) -> Unit)? = null

    /*
     * In case of validation success, this callback is invoked
     */
    var successCallback: (() -> Unit)? = null

    /*
     * The rules list to check for validation
     */
    var rulesList = ArrayList<BaseRule>()

    /*
     * Performs the validation check and returns true or false.
     * Also invokes success and error callbacks if non null.
     */
    fun check() : Boolean
    {
        for (rule in rulesList)
        {
            if (!rule.validate(text))
            {
                setError(rule.getErrorMessage())
                break
            }
        }

        // Invoking callbacks
        if (isValid)
            successCallback?.invoke()
        else
            errorCallback?.invoke(errorMessage)

        return isValid
    }

    fun setError(message: String)
    {
        isValid = false
        errorMessage = message
    }

    fun addRule(rule: BaseRule) : Validator
    {
        rulesList.add(rule)
        return this
    }

    fun addErrorCallback(callback: (message: String) -> Unit) : Validator
    {
        errorCallback = callback
        return this
    }

    fun addSuccessCallback(callback: () -> Unit) : Validator
    {
        successCallback = callback
        return this
    }

    // Rules
    fun nonEmpty(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {NonEmptyRule(errorMsg)}?: NonEmptyRule()
        addRule(rule)
        return this
    }

    fun minLength(length: Int,errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {MinLengthRule(length,errorMsg)}?: MinLengthRule(length)
        addRule(rule)
        return this
    }

    fun maxLength(length: Int,errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {MaxLengthRule(length,errorMsg)}?: MaxLengthRule(length)
        addRule(rule)
        return this
    }

    fun validEmail(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {EmailRule(errorMsg)}?: EmailRule()
        addRule(rule)
        return this
    }

    fun validNumber(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {ValidNumberRule(errorMsg)}?: ValidNumberRule()
        addRule(rule)
        return this
    }

    fun greaterThan(number: Number, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {GreaterThanRule(number,errorMsg)}?: GreaterThanRule(number)
        addRule(rule)
        return this
    }

    fun greaterThanOrEqual(number: Number, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {GreaterThanOrEqualRule(number,errorMsg)}?: GreaterThanOrEqualRule(number)
        addRule(rule)
        return this
    }

    fun lessThan(number: Number, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {LessThanRule(number,errorMsg)}?: LessThanRule(number)
        addRule(rule)
        return this
    }

    fun lessThanOrEqual(number: Number, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {LessThanOrEqualRule(number,errorMsg)}?: LessThanOrEqualRule(number)
        addRule(rule)
        return this
    }

    fun numberEqualTo(number: Number, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {NumberEqualToRule(number,errorMsg)}?: NumberEqualToRule(number)
        addRule(rule)
        return this
    }

    fun allLowerCase(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {AllLowerCaseRule(errorMsg)}?: AllLowerCaseRule()
        addRule(rule)
        return this
    }

    fun allUpperCase(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {AllUpercCaseRule(errorMsg)}?: AllUpercCaseRule()
        addRule(rule)
        return this
    }

    fun atleastOneUpperCase(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {AtLeastOneUpercCaseRule(errorMsg)}?: AtLeastOneUpercCaseRule()
        addRule(rule)
        return this
    }

    fun atleastOneLowerCase(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {AtLeastOneLowerCaseRule(errorMsg)}?: AtLeastOneLowerCaseRule()
        addRule(rule)
        return this
    }

    fun atleastOneNumber(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {AtLeastOneNumberCaseRule(errorMsg)}?: AtLeastOneNumberCaseRule()
        addRule(rule)
        return this
    }

    fun noNumbers(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {NoNumbersRule(errorMsg)}?: NoNumbersRule()
        addRule(rule)
        return this
    }

    fun onlyNumbers(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {OnlyNumbersRule(errorMsg)}?: OnlyNumbersRule()
        addRule(rule)
        return this
    }

    fun startWithNumber(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {StartsWithNumberRule(errorMsg)}?: StartsWithNumberRule()
        addRule(rule)
        return this
    }

    fun startWithNonNumber(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {StartsWithNoNumberRule(errorMsg)}?: StartsWithNoNumberRule()
        addRule(rule)
        return this
    }

    fun noSpecialCharacters(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {NoSpecialCharacterRule(errorMsg)}?: NoSpecialCharacterRule()
        addRule(rule)
        return this
    }

    fun atleastOneSpecialCharacters(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {AtleastOneSpecialCharacterRule(errorMsg)}?: AtleastOneSpecialCharacterRule()
        addRule(rule)
        return this
    }

    fun textEqualTo(target: String, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {TextEqualToRule(target,errorMsg)}?: TextEqualToRule(target)
        addRule(rule)
        return this
    }

    fun textNotEqualTo(target: String, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {TextNotEqualToRule(target,errorMsg)}?: TextNotEqualToRule(target)
        addRule(rule)
        return this
    }

    fun startsWith(target: String, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {StartsWithRule(target,errorMsg)}?: StartsWithRule(target)
        addRule(rule)
        return this
    }

    fun endsWith(target: String, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {EndsWithRule(target,errorMsg)}?: EndsWithRule(target)
        addRule(rule)
        return this
    }

    fun contains(target: String, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {ContainsRule(target,errorMsg)}?: ContainsRule(target)
        addRule(rule)
        return this
    }

    fun notContains(target: String, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {NotContainsRule(target,errorMsg)}?: NotContainsRule(target)
        addRule(rule)
        return this
    }

    fun creditCardNumber(creditCardErrorMsg:String? = null,minLengthErrorMsg:String? = null,
                         maxLengthErrorMsg:String? = null) : Validator
    {
        val minLengthRule = minLengthErrorMsg?.let {MinLengthRule(16,minLengthErrorMsg)}?: MinLengthRule(16)
        val maxLengthRule  = maxLengthErrorMsg?.let {MaxLengthRule(16,maxLengthErrorMsg)}?: MaxLengthRule(16)
        val creditCardRule = creditCardErrorMsg?.let {CreditCardRule(creditCardErrorMsg)}?: CreditCardRule()

        addRule(minLengthRule)
        addRule(maxLengthRule)
        addRule(creditCardRule)
        return this
    }

    fun creditCardNumberWithSpaces(creditCardErrorMsg:String? = null,minLengthErrorMsg:String? = null,
                                   maxLengthErrorMsg:String? = null) : Validator
    {
        val minLengthRule = minLengthErrorMsg?.let {MinLengthRule(16,minLengthErrorMsg)}?: MinLengthRule(19)
        val maxLengthRule  = maxLengthErrorMsg?.let {MaxLengthRule(16,maxLengthErrorMsg)}?: MaxLengthRule(19)
        val creditCardRule = creditCardErrorMsg?.let {CreditCardWithSpacesRule(creditCardErrorMsg)}?: CreditCardWithSpacesRule()

        addRule(minLengthRule)
        addRule(maxLengthRule)
        addRule(creditCardRule)
        return this
    }

    fun creditCardNumberWithDashes(creditCardErrorMsg:String? = null,minLengthErrorMsg:String? = null,
                                   maxLengthErrorMsg:String? = null) : Validator
    {
        val minLengthRule = minLengthErrorMsg?.let {MinLengthRule(16,minLengthErrorMsg)}?: MinLengthRule(19)
        val maxLengthRule  = maxLengthErrorMsg?.let {MaxLengthRule(16,maxLengthErrorMsg)}?: MaxLengthRule(19)
        val creditCardRule = creditCardErrorMsg?.let {CreditCardWithDashesRule(creditCardErrorMsg)}?: CreditCardWithDashesRule()

        addRule(minLengthRule)
        addRule(maxLengthRule)
        addRule(creditCardRule)
        return this
    }

    fun validUrl(errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {ValidUrlRule(errorMsg)}?: ValidUrlRule()
        addRule(rule)
        return this
    }

    fun regex(pattern: String, errorMsg:String? = null) : Validator
    {
        val rule = errorMsg?.let {RegexRule(pattern,errorMsg)}?: RegexRule(pattern)
        addRule(rule)
        return this
    }
}