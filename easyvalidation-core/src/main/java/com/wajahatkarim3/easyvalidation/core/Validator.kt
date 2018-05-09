package com.wajahatkarim3.easyvalidation.core

import com.wajahatkarim3.easyvalidation.core.rules.EmptyRule

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
     * User settable limits for the numbers of characters that the string can contain
     */
    private var MINIMUM_LENGTH = 0
    private var MAXIMUM_LENGTH = Int.MAX_VALUE

    /*
     * Performs the validation check and returns true or false.
     * Also invokes success and error callbacks if non null.
     */
    fun check() : Boolean
    {
        if (isValid)
            successCallback?.invoke()
        else
            errorCallback?.invoke(errorMessage)

        return isValid
    }

    fun empty() : Validator
    {
        if (EmptyRule(text).validate())
            setError("Cannot be empty!")
        return this
    }

    fun setError(message: String)
    {
        isValid = false
        errorMessage = message
    }
}