import org.gradle.kotlin.dsl.dependencies

plugins {
    id("org.jetbrains.compose")
    id("com.android.library")
}

android {
    dependencies {
        implementation(compose.runtime)
        implementation(compose.foundation)
        implementation(compose.material3)
        implementation(compose.preview)
        implementation(compose.uiTooling)
        implementation(compose.animation)
        implementation(compose.ui)
    }
}