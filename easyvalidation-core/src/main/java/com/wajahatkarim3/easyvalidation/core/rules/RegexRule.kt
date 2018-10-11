package com.wajahatkarim3.easyvalidation.core.rules

class RegexRule (val pattern: String, var errorMsg: String = "RegEx pattern doesn't match!") : BaseRule {

    override fun validate(text: String): Boolean {
        return text.matches(Regex(pattern))
    }

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}