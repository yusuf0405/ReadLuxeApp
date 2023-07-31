plugins {
    id("compose-setup")
    id("android-setup")
}

android {
    namespace = "com.joseph.readluxe.featuremodules.readingscreen.presentation"

    dependencies {
        implementation(project(":core:ui"))
    }
}