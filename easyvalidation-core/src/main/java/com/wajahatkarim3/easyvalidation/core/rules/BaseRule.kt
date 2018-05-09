package com.wajahatkarim3.easyvalidation.core.rules

abstract class BaseRule(val text: String) {

    abstract fun validate() : Boolean

}