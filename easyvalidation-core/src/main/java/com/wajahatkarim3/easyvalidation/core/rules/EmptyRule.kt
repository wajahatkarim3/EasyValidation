package com.wajahatkarim3.easyvalidation.core.rules

class EmptyRule : BaseRule
{
    override fun validate(text: String): Boolean = !text.isEmpty()

    override fun getErrorMessage(): String = "Can't be empty!"
}