import Dependencies.ktor

plugins {
    id(Plugins.ANDROID_SETUP)
}

android {
    namespace = "com.joseph.readluxe.core.data"
}

dependencies {
    ktor()
}