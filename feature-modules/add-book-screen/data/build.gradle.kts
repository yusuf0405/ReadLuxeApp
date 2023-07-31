
plugins {
    id("android-setup")
}

android {
    namespace = "com.joseph.readluxe.featuremodules.addbookscreen.data"

    dependencies {
        implementation(project(":core:data"))
    }
}