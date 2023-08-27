import Dependencies.coroutines
import Dependencies.hilt
import Dependencies.navigation

plugins {
    id("org.jetbrains.kotlin.kapt")
}
kapt {
    correctErrorTypes = true
}

dependencies {
    hilt()
}