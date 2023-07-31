
plugins {
    id("compose-setup")
    id("android-setup")
}

android {
    namespace = "com.joseph.readluxe.featuremodules.addbookscreen.presentation"

    dependencies {
        implementation(project(":core:ui"))
    }
}