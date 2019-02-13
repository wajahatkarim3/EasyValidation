<div align="center"><p><a href="https://android.jlelse.eu/quickly-easily-validating-your-text-with-easy-validation-498d7eb54b0b"><img alt="New in the EasyValidation" align="center" src="https://img.shields.io/badge/%F0%9F%93%84%20-NEW-red.svg" /></a>&nbsp;
The article on how this library was created is now published. You can <a href="https://android.jlelse.eu/quickly-easily-validating-your-text-with-easy-validation-498d7eb54b0b">read it on this link here. →</a>.
</p></div>

![](https://raw.githubusercontent.com/wajahatkarim3/EasyValidation/master/Art/easyvalidlogo.jpg)


<h1 align="center"><a href="https://twitter.com/intent/tweet?text=Quickly%20and%20easily%20validate%20your%20text%20and%20input%20in%20Android%20apps%20with%20this%20amazing%20library%20EasyValidation%20written%20in%20entirely%20in%20kotlin.:&url=https%3A%2F%2Fgithub.com%2Fwajahatkarim3%2FEasyValidation">
        <img src="https://img.shields.io/twitter/url/http/shields.io.svg?style=social"/>
    </a></h1>

<br/>
<div align="center">
    <!-- AppCenter -->
    <a href="https://appcenter.ms">
        <img src="https://build.appcenter.ms/v0.1/apps/ffd5a8a1-b026-4466-9480-787e049f2f7a/branches/master/badge"/>
    </a>    
    <!-- Bintray -->
    <a href="https://bintray.com/wajahatkarim3/EasyValidation/com.wajahatkarim3.EasyValidation.core/_latestVersion">
        <img src="https://api.bintray.com/packages/wajahatkarim3/EasyValidation/com.wajahatkarim3.EasyValidation.core/images/download.svg"/>
    </a>
    <!-- Arsenal -->
    <a href="https://android-arsenal.com/details/1/7109">
        <img src="https://img.shields.io/badge/Android%20Arsenal-Easy%20Validation-brightgreen.svg?style=flat"/>
    </a>    
    <!-- API -->
    <a href="https://android-arsenal.com/api?level=14">
        <img src="https://img.shields.io/badge/API-14%2B-orange.svg?style=flat"/>
    </a>
    <a href="">
        <img src="https://img.shields.io/badge/PRs-welcome-brightgreen.svg"/>
    </a>
    <!-- GitHub stars 
    <a href="https://github.com/wajahatkarim3/EasyValidation">
        <img src="https://img.shields.io/github/stars/nisrulz/validatetor.svg?style=social&label=Star"/>
    </a> -->
    <!-- GitHub forks 
    <a href="https://github.com/nisrulz/validatetor/fork">
        <img src="https://img.shields.io/github/forks/nisrulz/validatetor.svg?style=social&label=Fork"/>
    </a> -->
    <!-- GitHub watchers 
    <a href="https://github.com/nisrulz/validatetor">
        <img src="https://img.shields.io/github/watchers/nisrulz/validatetor.svg?style=social&label=Watch"/>
    </a> -->
    <!-- Say Thanks! -->
    <a href="https://saythanks.io/to/wajahatkarim3">
        <img src="https://img.shields.io/badge/Say%20Thanks-!-1EAEDB.svg"/>
    </a>
    <a href="https://www.paypal.me/WajahatKarim/5">
        <img src="https://img.shields.io/badge/$-donate-ff69b4.svg?maxAge=2592000&amp;style=flat">
    </a>
    <br/>
     <!-- GitHub followers 
    <a href="https://github.com/nisrulz/validatetor">
        <img src="https://img.shields.io/github/followers/nisrulz.svg?style=social&label=Follow%20@nisrulz"/>
    </a> -->
    <!-- Twitter Follow 
    <a href="https://twitter.com/nisrulz">
        <img src="https://img.shields.io/twitter/follow/nisrulz.svg?style=social"/>
    </a> -->
</div>

<div align="center">
  <sub>Built with ❤︎ by
  <a href="https://twitter.com/WajahatKarim">Wajahat Karim</a> and
  <a href="https://github.com/wajahatkarim3/EasyValidation/graphs/contributors">
    contributors
  </a>
</div>
<br/>
<br/>

## ✔️ Changelog
Changes exist in the [releases](https://github.com/wajahatkarim3/MediumClap-Android/releases) tab.

## 💻 Installation
Add this in app's ```build.gradle``` file:

```groovy
   implementation "com.wajahatkarim3.easyvalidation:easyvalidation-core:1.0.1"
```

## 📄 Documentation
Full documentation is available at [Gitbook](https://wajahatkarim.gitbook.io/easyvalidation/).

## ⭐️ Features
* The Validator way validation support. - [Details](https://wajahatkarim.gitbook.io/easyvalidation/usage/untitled)
* 30+ built-in validation rules like empty, email, credit cards, etc. - [Rules List](https://wajahatkarim.gitbook.io/easyvalidation/usage/built-in-rules)
* Extension methods for `String`, `EditText`, `TextView`, `AutoCompleteTextView`, `TextInputLayout`, and `Spinner`. - [Details](https://wajahatkarim.gitbook.io/easyvalidation/usage/validation-using-extension-methods)
* Multiple Validations and Checks - [Details](https://wajahatkarim.gitbook.io/easyvalidation/usage/multiple-validation-checks)
* Collection Extension Methods for validations on multiple texts and views - [Details](https://wajahatkarim.gitbook.io/easyvalidation/usage/collection-extensions)
* Create your own custom rules - [Details](https://wajahatkarim.gitbook.io/easyvalidation/usage/create-custom-rules)


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
These extension methods are also available for `String`, `EditText`, `TextView`, `AutoCompleteTextView`, `TextInputLayout`, and `Spinner`.
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

## 💰 Donations

This project needs you! If you would like to support this project's further development, the creator of this project or the continuous maintenance of this project, feel free to donate. Your donation is highly appreciated (and I love food, coffee and beer). Thank you!

**PayPal**

* **[Donate $5](https://www.paypal.me/WajahatKarim/5)**: Thank's for creating this project, here's a tea (or some juice) for you!
* **[Donate $10](https://www.paypal.me/WajahatKarim/10)**: Wow, I am stunned. Let me take you to the movies!
* **[Donate $15](https://www.paypal.me/WajahatKarim/15)**: I really appreciate your work, let's grab some lunch!
* **[Donate $25](https://www.paypal.me/WajahatKarim/25)**: That's some awesome stuff you did right there, dinner is on me!
* **[Donate $50](https://www.paypal.me/WajahatKarim/50)**: I really really want to support this project, great job!
* **[Donate $100](https://www.paypal.me/WajahatKarim/100)**: You are the man! This project saved me hours (if not days) of struggle and hard work, simply awesome!
* **[Donate $2799](https://www.paypal.me/WajahatKarim/2799)**: Go buddy, buy Macbook Pro for yourself!

Of course, you can also choose what you want to donate, all donations are awesome!

## 👨 Developed By

```
Wajahat Karim
```
- Website (http://wajahatkarim.com)
- Twitter (http://twitter.com/wajahatkarim)
- Medium (http://www.medium.com/@wajahatkarim3)
- LinkedIn (http://www.linkedin.com/in/wajahatkarim)

# 👍 How to Contribute
1. Fork it
2. Create your feature branch (git checkout -b my-new-feature)
3. Commit your changes (git commit -am 'Add some feature')
4. Push to the branch (git push origin my-new-feature)
5. Create new Pull Request

# 📃 License

    Copyright 2018 Wajahat Karim

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
