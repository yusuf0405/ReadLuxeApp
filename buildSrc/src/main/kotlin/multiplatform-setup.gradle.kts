import org.gradle.kotlin.dsl.kotlin

plugins {
    kotlin("multiplatform")
    kotlin("kapt")
    id("com.android.library")
}

kotlin {
    jvm("dekstop")
    android()
    ios()
}