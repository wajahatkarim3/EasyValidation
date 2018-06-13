package com.wajahatkarim3.easyvalidation.core.rules

class RegexRule (val pattern: String) : BaseRule {

    override fun validate(text: String): Boolean {
        return text.matches(Regex(pattern))
    }

    override fun getErrorMessage(): String {
        return "RegEx pattern doesn't match!"
    }
}