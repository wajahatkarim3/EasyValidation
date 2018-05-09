package com.wajahatkarim3.easyvalidation.core

/**
 * The core Validator builder class for validation operations and checks!
 *
 * This class allows developers to process single or multiple validation checks on input views.
 *
 * @author Wajahat Karim
 * @date 08/05/18
 */
class Validator
{
    /*
     * Boolean to determine whether all the validations have passed successfully!
     * If any validation check is failed, then the value to
     * false and result is returned to developer
     */
    private var isValid = true

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
    * */
    private var MINIMUM_LENGTH = 0
    private var MAXIMUM_LENGTH = Int.MAX_VALUE
}