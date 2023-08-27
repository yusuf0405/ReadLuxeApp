import org.gradle.kotlin.dsl.DependencyHandlerScope

object Dependencies {

    object UiController {
        const val systemuicontroller =
            "com.google.accompanist:accompanist-systemuicontroller:${Versions.UiController.version}"
    }

    object Kotlin {
        const val gradlePlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.version}"

        object Serialization {
            const val gradlePlugin = "org.jetbrains.kotlin:kotlin-serialization:1.5.31"
            const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.1"
        }

        object Coroutines {
            const val core =
                "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Kotlin.Coroutines.version}"
        }
    }

    object Compose {
        const val gradlePlugin =
            "org.jetbrains.compose:compose-gradle-plugin:${Versions.Compose.version}"

        val uiCompose = "androidx.compose.ui:ui:${Versions.Compose.version}"
        val uiToolingPreviewCompose =
            "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.version}"
        val materialCompose = "androidx.compose.material:material:${Versions.Compose.version}"
        val activityCompose = "androidx.activity:activity-compose:1.7.2"
        val constraintlayoutCompose = "androidx.constraintlayout:constraintlayout-compose:1.0.1"

        val coilCompose = "io.coil-kt:coil-compose:${Versions.Compose.coilVersion}"
        val drawablePainter =
            "com.google.accompanist:accompanist-drawablepainter:${Versions.Compose.drawablepainterVersion}"

        val lifecycleRuntimeCompose =
            "androidx.lifecycle:lifecycle-runtime-compose:${Versions.Compose.lifecycleComposeVersion}"
        val lifecycleViewModelCompose =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.Compose.lifecycleComposeVersion}"

        // debug implementation
        val uiToolingCompose = "androidx.compose.ui:ui-tooling:${Versions.Compose.version}"
        val uiTestManifestCompose =
            "androidx.compose.ui:ui-test-manifest:${Versions.Compose.version}"
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${Versions.Ktor.version}"
        const val json = "io.ktor:ktor-client-json:${Versions.Ktor.version}"
        const val ios = "io.ktor:ktor-client-ios:${Versions.Ktor.version}"
        const val negotiation = "io.ktor:ktor-client-content-negotiation:${Versions.Ktor.version}"
        const val serialization = "io.ktor:ktor-serialization-kotlinx-json:${Versions.Ktor.version}"
        const val logging = "io.ktor:ktor-client-logging:${Versions.Ktor.version}"
        const val okhttp = "io.ktor:ktor-client-okhttp:${Versions.Ktor.version}"
        const val android = "io.ktor:ktor-client-android:${Versions.Ktor.version}"
    }

    object Android {
        const val gradlePlugin = "com.android.tools.build:gradle:${Versions.Android.agpVersion}"
        const val material = "com.google.android.material:material:${Versions.Android.material}"
    }

    object Hilt {
        private const val version = "2.44"
        const val gradlePlugin =
            "com.google.dagger:hilt-android-gradle-plugin:${Versions.Hilt.version}"

        const val navigation_compose = "androidx.hilt:hilt-navigation-compose:1.0.0"
        const val android = "com.google.dagger:hilt-android:${Versions.Hilt.version}"
        const val kapt = "com.google.dagger:hilt-android-compiler:${Versions.Hilt.version}"

    }

    const val android = "com.google.dagger:hilt-android:${Versions.Hilt.version}"

    object Navigation {
        const val common =
            "androidx.navigation:navigation-common-ktx:${Versions.Navigation.version}"
        const val runtime =
            "androidx.navigation:navigation-runtime-ktx:${Versions.Navigation.version}"
        const val compose = "androidx.navigation:navigation-compose:${Versions.Navigation.version}"
    }

    private const val IMLEMENTATION = "implementation"
    private const val DEBUG_IMLEMENTATION = "debugImplementation"
    private const val KAPT = "kapt"


    fun DependencyHandlerScope.compose() {
        "$IMLEMENTATION"(Compose.activityCompose)
        "$IMLEMENTATION"(Compose.uiCompose)
        "$IMLEMENTATION"(Compose.uiToolingPreviewCompose)
        "$IMLEMENTATION"(Compose.coilCompose)
        "$IMLEMENTATION"(Compose.drawablePainter)
        "$IMLEMENTATION"(Compose.lifecycleRuntimeCompose)
        "$IMLEMENTATION"(Compose.lifecycleViewModelCompose)
        "$IMLEMENTATION"(Compose.constraintlayoutCompose)
        "$IMLEMENTATION"(Compose.materialCompose)
        "$IMLEMENTATION"(Compose.materialCompose)
        "$DEBUG_IMLEMENTATION"(Compose.uiTestManifestCompose)
        "$DEBUG_IMLEMENTATION"(Compose.uiToolingCompose)
    }

    fun DependencyHandlerScope.navigation() {
        "$IMLEMENTATION"(Navigation.common)
        "$IMLEMENTATION"(Navigation.runtime)
        "$IMLEMENTATION"(Navigation.compose)
    }

    fun DependencyHandlerScope.coroutines() {
        "$IMLEMENTATION"(Kotlin.Coroutines.core)
    }


    fun DependencyHandlerScope.ktor() {
        "$IMLEMENTATION"(Ktor.core)
        "$IMLEMENTATION"(Ktor.android)
        "$IMLEMENTATION"(Ktor.json)
        "$IMLEMENTATION"(Ktor.logging)
        "$IMLEMENTATION"(Ktor.okhttp)
        "$IMLEMENTATION"(Ktor.serialization)
        "$IMLEMENTATION"(Kotlin.Serialization.serialization)
    }

    fun DependencyHandlerScope.hilt() {
        "$IMLEMENTATION"(Hilt.android)
        "$IMLEMENTATION"(Hilt.navigation_compose)
        "$KAPT"(Hilt.kapt)
    }

}