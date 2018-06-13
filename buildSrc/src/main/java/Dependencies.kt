object Versions {
    val kotlin = "1.2.41"
    val support_lib = "27.1.0"
    val gradle = "3.1.1"
}

object Deps {
    // Gradle
    val gradle_plugin = "com.android.tools.build:gradle:${Versions.gradle}"
    val gradle_bintray = "com.jfrog.bintray.gradle:gradle-bintray-plugin:1.4"
    val gradle_maven = "com.github.dcendents:android-maven-gradle-plugin:1.4.1"

    // Kotlin
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    // Support
    val support_v13 = "com.android.support:support-v13:${Versions.support_lib}"
    val support_annotations = "com.android.support:support-annotations:${Versions.support_lib}"
    val support_appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support_lib}"
    val support_desgign = "com.android.support:design:${Versions.support_lib}"
    val support_cardview = "com.android.support:cardview-v7:${Versions.support_lib}"
    val support_vector_drawables = "com.android.support:support-vector-drawable:${Versions.support_lib}"

    // Support Miscellaneous
    val constraint_layout = "com.android.support.constraint:constraint-layout:1.0.2"
    val multidex = "com.android.support:multidex:1.0.3"
    val android_ktx = "androidx.core:core-ktx:0.3"
    val parceler = "org.parceler:parceler-api:1.1.9"
    val parceler_compiler = "org.parceler:parceler:1.1.9"
}