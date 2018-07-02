# EasyValidation
A text and input validation library in Kotlin for Android

[ ![Download](https://api.bintray.com/packages/wajahatkarim3/EasyValidation/com.wajahatkarim3.EasyValidation.core/images/download.svg) ](https://bintray.com/wajahatkarim3/EasyValidation/com.wajahatkarim3.EasyValidation.core/_latestVersion)

## Installation
Add this in project's ```build.gradle``` file:

```groovy
// ...
allprojects {
    repositories {
        // ....
        // ....
        maven { url "https://dl.bintray.com/wajahatkarim3/EasyValidation" }
    }
}
// ...
```

And then add this in app's ```build.gradle``` file:

```groovy
   implementation "com.wajahatkarim3.easyvalidation:easyvalidation-core:1.0.0"
```

## Documentation
Full documentation is available at Gitbook

## How it works

There are two ways to validate ```EditText```.

### Validator Way
The ```Validator``` way is a lot more customizable and allows you add as many rules as you like. Some rules are already developed in the library. Here is an example, which tells that ```EditText``` cannot be empty and will have number of characters between 3 and 10. 

```kotlin

var edittext = findViewById<EditText>(R.id.myeditid)
edittext.validator()
        .nonEmpty()       // Check if the EditText is not empty
        .minLength(3)     // Check if the EditText length is greater than or equal to 3
        .maxLength(10)    // Check if the EditText length is less than or equal to 10
        .addErrorCallback { message ->
              edittext.error = message        // Show any error or toast or snack or dialog etc. here
        }
        .check()          // Performs validation check
```

### Extension Way
There's another smaller and easier way. This uses kotlin extensions. This library comes with already built-in rules' extensions. For the above same example, validation will be like this:

```kotlin
var edittext = findViewById<EditText>(R.id.myeditid)
edittext.nonEmpty() {
    edittext.error = it
    return
}
edittext.minLength(3) {
    edittext.error = it
    return
}
edittext.maxLength(10) {
    edittext.error = it
    return
}
```

Or you can do all at once like:

```kotlin

if (edittext.nonEmpty() && edittext.minLength(3) && edittext.maxLength(10))
{
    // The EditText satisfies all checks. So you are free to use the EditText text.
}
else 
{
    // Any one condition from empty or minimum length or maximum length has returned false. 
    // Show any error or toast or snack or dialog etc. here
}
```

### Collection Extensions
You can also check multiple views at same time using collection extensions. For example,

```kotlin
    // Works with views like EditText, TextView, Spinner etc.
    nonEmptyList(txtUsername, txtEmail, txtPassword, txtPhoneNumber) { view, message ->
        view.error = message
    }
    
    // Also works with direct view IDs for only in Activity or Fragment
    minLengthList(3, R.id.txtUsername, R.id.txtPassword, R.id.txtPhoneNumber) { view, message ->
        view.error = message
    }
```


You can apply all the built-in rules just by adding ```List``` suffix in the rule name. For example, ```nonEmpty``` becomes ```nonEmptyList```, the ```validEmail``` becomes ```validEmailList``` and so on. 
