plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    mavenCentral()
    mavenLocal()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle:8.1.0")
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.44")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")
    implementation(kotlin("script-runtime"))
}