plugins {
    id(Plugins.ANDROID_SETUP)
}

android {
    namespace = "com.joseph.readluxe.featuremodules.addbookscreen.data"

    dependencies {
        implementation(project(Modules.CORE_DATA))
    }
}