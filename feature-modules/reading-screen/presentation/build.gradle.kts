import Dependencies.coroutines

plugins {
    id(Plugins.ANDROID_SETUP)
    id(Plugins.COMPOSE_SETUP)
    id(Plugins.HILT_SETUP)
    id(Plugins.HILT_PLUGIN)
}

android {
    namespace = "com.joseph.readluxe.featuremodules.readingscreen.presentation"
}

dependencies {
    implementation(project(Modules.CORE_COMMON))
    implementation(project(Modules.CORE_UI))
    implementation(project(Modules.CORE_DATA))
    coroutines()
}