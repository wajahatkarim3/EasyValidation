package com.wajahatkarim3.easyvalidation.core.rules

interface BaseRule {

    fun validate(text: String) : Boolean
    fun getErrorMessage() : String
    fun setError(msg: String)
}