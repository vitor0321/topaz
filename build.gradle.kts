plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}
buildscript {
    dependencies {
        classpath(libs.gradle)
    }
}
