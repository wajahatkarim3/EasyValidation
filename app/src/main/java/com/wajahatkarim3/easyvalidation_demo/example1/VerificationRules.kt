package com.wajahatkarim3.easyvalidation_demo.example1

import android.widget.EditText
import com.wajahatkarim3.easyvalidation.core.view_ktx.*

typealias VerificationMethod = EditText.() -> Unit

object VerificationRuleSamples {

    val samples by lazy {
        listOf(
                Sample("All lowercase", "android") { allLowerCase { this.error = "All lowercase letters needed" } },
                Sample("At least one lowercase", "TEDx") { atleastOneLowerCase { this.error = "At least one uppercase letter needed" } },
                Sample("At least one number", "Pixel 3a") { atleastOneNumber { this.error = "At least one number needed" } },
                Sample("At least one uppercase", "Android") { atleastOneUpperCase { this.error = "At least one lowercase letter needed" } },
                Sample("At least one special", "Hello!") { atleastOneSpecialCharacters { this.error = "At least one special character needed" } },
                Sample("Contains \"valid\"", "Easy validation") { contains("valid") { this.error = "Does not contain \"valid\"" } },
                Sample("Credit card number", "4111111111111111") { creditCardNumber { this.error = "Invalid credit card number" } },
                Sample("Credit card number (with dashes)", "4111-1111-1111-1111") { creditCardNumberWithDashes { this.error = "Invalid credit card number" } },
                Sample("Credit card number (with spaces)", "4111 1111 1111 1111") { creditCardNumberWithSpaces { this.error = "Invalid credit card number" } },
                Sample("E-mail address", "john.smith@email.com") { validEmail { this.error = "Invalid E-mail" } },
                Sample("Ends with \"droid\"", "Android") { endssWith("droid") { this.error = "Does not end with \"droid\"" } },
                Sample("Greater or equals to 5", "7") { greaterThanOrEqual(5) { this.error = "Not greater or equal to 5" } },
                Sample("Greater than 5", "7") { greaterThan(5) { this.error = "Not greater than 5" } },
                Sample("Less or equals to 5", "3") { lessThanOrEqual(5) { this.error = "Not less or equal to 5" } },
                Sample("Less than 5", "3") { lessThan(5) { this.error = "Not less than 5" } },
                Sample("Max length (7)", "Android") { maxLength(7) { this.error = "Text too long" } },
                Sample("Min length (7)", "Android") { minLength(7) { this.error = "Text too short" } },
                Sample("Not empty", "Android") { nonEmpty { this.error = "Text empty" } },
                Sample("No numbers", "Android") { noNumbers { this.error = "Contains numbers" } },
                Sample("No special character", "Android") { noSpecialCharacters { this.error = "Contains special characters" } },
                Sample("Not contains \"Droid\"", "Android") { notContains("Droid") { this.error = "Contains \"Droid\"" } },
                Sample("Number 5", "5") { numberEqualTo(5) { this.error = "Not equal to 5" } },
                Sample("Only numbers", "12345") { onlyNumbers { this.error = "Input invalid" } },
                Sample("Matches regex \".{4}5\"", "12345") { regex(".{4}5") { this.error = "Does not match the regex" } },
                Sample("Starts with no number", "Android") { startWithNonNumber { this.error = "Starts with a number" } },
                Sample("Starts with number", "1Android") { startWithNumber { this.error = "Needs to start with a number" } },
                Sample("Starts with \"And\"", "Android") { startsWith("And") { this.error = "Input invalid" } },
                Sample("Equals \"Android\"", "Android") { textEqualTo("Android") { this.error = "Input invalid" } },
                Sample("Number", "3.14") { validNumber { this.error = "Not a valid number" } },
                Sample("URL", "https://www.google.com") { validUrl { this.error = "Invalid Url!" } }
        ).sortedBy { it.methodName }
    }

    class Sample(
            val methodName: String,
            val sampleText: String,
            val func: VerificationMethod
    ) {
        override fun toString(): String {
            return methodName
        }
    }
}