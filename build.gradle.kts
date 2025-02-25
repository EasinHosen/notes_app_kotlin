// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false

    id ("com.android.library") version "7.3.1" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}
buildscript {
    repositories {
        google()
    }

    dependencies {
        classpath(libs.androidx.navigation.safe.args.gradle.plugin)
    }
}


//plugins {
//    id ("com.android.application") version "7.3.1" apply false
//    id ("com.android.library") version "7.3.1" apply false
//    id ("org.jetbrains.kotlin.android") version "1.7.20" apply false
//    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
//}