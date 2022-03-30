package com.wajahatkarim3.easyvalidation.core

import org.junit.Test
import org.junit.Assert.*

class EmailRuleTests {

    @Test
    fun emailRule_withSimpleEmail_isValid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate("goblinbutler@twitch.tv")
        assertTrue(validationResult)
    }

    @Test
    fun emailRule_withPlusSign_isValid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate("goblin+butler@twitch.tv")
        assertTrue(validationResult)
    }

    @Test
    fun emailRule_withNonconsecutivePlusSigns_isValid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate("gob+lin+butler@twitch.tv")
        assertTrue(validationResult)
    }

    @Test
    fun emailRule_withConsecutivePlusSigns_isValid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate("goblin++butler@twitch.tv")
        assertTrue(validationResult)
    }

    @Test
    fun emailRule_withPeriodInMiddle_isValid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate("goblin.butler@twitch.tv")
        assertTrue(validationResult)
    }

    @Test
    fun emailRule_withPeriodAtBeginning_isInvalid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate(".goblinbutler@twitch.tv")
        assertFalse(validationResult)
    }

    @Test
    fun emailRule_withPeriodAtEnd_isInvalid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate("goblinbutler.@twitch.tv")
        assertFalse(validationResult)
    }

    @Test
    fun emailRule_withConsecutivePeriods_isInvalid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate("goblin..butler@twitch.tv")
        assertFalse(validationResult)
    }

    @Test
    fun emailRule_withNonconsecutivePeriods_isValid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate("goblin.but.ler@twitch.tv")
        assertFalse(validationResult)
    }

    @Test
    fun emailRule_withLongTopLevelDomain_isValid() {
        val emailRule = EmailRule()
        val validationResult = emailRule.validate("goblinbutler@twitch.streaming")
        assertTrue(validationResult)
    }
}