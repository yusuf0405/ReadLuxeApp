import org.gradle.api.JavaVersion

object Versions {

    object UiController {
        const val version = "0.28.0"
    }

    object Kotlin {
        const val version = "1..20"

        object Coroutines {
            const val version = "1.6.4"
        }
    }

    object Compose {
        const val version = "1.4.3"
        const val kotlinCompilerExtensionVersion = "1.4.7"
        const val coilVersion = "2.4.0"
        const val drawablepainterVersion = "0.30.1"
        const val lifecycleComposeVersion = "2.6.1"

    }

    object Ktor {
        const val version = "2.2.1"
    }

    object Android {
        const val agpVersion = "8.1.0"
        const val material = "1.9.0"
    }

    object Hilt {
        const val version = "2.44"

    }

    object Navigation {
        const val version = "2.6.0"
    }

    const val GRADLE = "8.1.0"
    const val KOTLIN = "1.8.21"
    const val COMPOSE = "1.4.3"
    const val HILT = "2.44"

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"
    const val MIN_SDK = 24
    const val TARGET_SDK = 33
    const val COMPILE_SDK = 33

    val JAVA = JavaVersion.VERSION_17
}