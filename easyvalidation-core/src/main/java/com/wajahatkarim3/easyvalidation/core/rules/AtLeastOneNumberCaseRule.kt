package com.wajahatkarim3.easyvalidation.core.rules

import android.support.annotation.StringRes
import com.wajahatkarim3.easyvalidation.core.Validator

/**
 * Returns true if atleast one or more characters are numbers
 *
 * @author Wajahat Karim
 */
class AtLeastOneNumberCaseRule(@StringRes var errorMsg: String = "At least one letter should be a number.") : BaseRule
{
    override fun validate(text: String): Boolean = Validator(text).regex(".*\\d.*").check()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}