
plugins {
    id("com.android.library")
}

android {
    compileSdk = Dependencies.SdkVersions.compileSdk

    defaultConfig {
        minSdk = Dependencies.SdkVersions.minSdk
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    sourceSets {
        named("main"){
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            res.srcDirs("src/androidMain/res", "src/commonMain/resources")
        }
    }
}