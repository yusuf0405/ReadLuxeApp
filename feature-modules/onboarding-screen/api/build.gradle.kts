import FeatureOnoboardingApiDependencies.featureOnoboardingApiDependencies

plugins {
    id(Plugins.ANDROID_SETUP)
}

android {
    namespace = FeatureOnoboardingApiDependencies.namespace
}

dependencies {
    featureOnoboardingApiDependencies()
}