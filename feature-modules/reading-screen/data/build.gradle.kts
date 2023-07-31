
plugins {
    id("android-setup")
}

android {
    namespace = "com.joseph.readluxe.featuremodules.readingscreen.data"

    dependencies {
        implementation(project(":core:data"))
    }
}