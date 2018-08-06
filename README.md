![](https://raw.githubusercontent.com/wajahatkarim3/EasyValidation/master/Art/easyvalidlogo1.jpg)

# EasyValidation
A text and input validation library in Kotlin for Android

[ ![Download](https://api.bintray.com/packages/wajahatkarim3/EasyValidation/com.wajahatkarim3.EasyValidation.core/images/download.svg) ](https://bintray.com/wajahatkarim3/EasyValidation/com.wajahatkarim3.EasyValidation.core/_latestVersion) [![](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)]()

## ✔️ Changelog
Changes exist in the [releases](https://github.com/wajahatkarim3/MediumClap-Android/releases) tab.

## 💻 Installation
Add this in app's ```build.gradle``` file:

```groovy
   implementation "com.wajahatkarim3.easyvalidation:easyvalidation-core:1.0.1"
```

## 📄 Documentation
Full documentation is available at [Gitbook](https://wajahatkarim.gitbook.io/easyvalidation/).

## ❓ Quick Usage

For example, you can validate any email `String` like this:
```kotlin
   var myEmailStr = "john.doe@gmail.com"
   var isValid = myEmailStr.validEmail()  // isValid will be true or false
   
   // Or you can also validate with an error callback method
   myEmailStr.validEmail() {
       // This method will be called when myEmailStr is not a valid email.
       Toast.makeText(contex, it, Toast.LENGTH_SHORT).show()
   }
```
These extension methods are also available for `EditText`, `TextView`, `AutoCompleteTextView`, `TextInputLayout`, and `Spinner`.
```kotlin
   var myEditText = findViewById<EditText>(R.id.myEditText)
   var isValid = myEditText.nonEmpty()        // Checks if edit text is empty or not

   // Or with error callback method like this
   myEditText.nonEmpty() {
       // This method will be called when myEditText is empty.
       myEditText.error = it
   }
```
There are around 30+ built-in rules in the core module library. You can check all these in [Rules page](https://wajahatkarim.gitbook.io/easyvalidation/usage/built-in-rules).
EasyValidation also supports multiple validation checks at same time using [Validator class](https://wajahatkarim.gitbook.io/easyvalidation/usage/untitled) like this:
```kotlin
// This example will check that whether user entered password has
// atleast one number, one spcial character, and one upper case.
var txtPassword = findViewById<EditText>(R.id.txtPassword)
txtPassword.validator()
     .nonEmpty()
     .atleastOneNumber()
     .atleastOneSpecialCharacters()
     .atleastOneUpperCase()
     .addErrorCallback { 
          txtPassword.error = it
          // it will contain the right message. 
          // For example, if edit text is empty, 
          // then 'it' will show "Can't be Empty" message
     }
     .check()
```

For more advanced usage, checkout the [full documentation at GitBook page](https://wajahatkarim.gitbook.io/easyvalidation/).
