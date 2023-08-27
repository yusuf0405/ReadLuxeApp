import Dependencies.compose

plugins {
    id("com.android.library")
    kotlin("android")
}

android {

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.Compose.kotlinCompilerExtensionVersion
    }

    compileOptions {
        sourceCompatibility = Versions.JAVA
        targetCompatibility = Versions.JAVA
    }

    kotlinOptions {
        jvmTarget = Versions.JAVA.toString()
    }

}

dependencies {
    compose()
    implementation(Dependencies.Android.material)
}