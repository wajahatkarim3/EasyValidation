package com.wajahatkarim3.easyvalidation.core.rules

class EmptyRule(text: String) : BaseRule(text)
{
    override fun validate(): Boolean = text.isEmpty()
}