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
