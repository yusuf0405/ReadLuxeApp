import FeatureOnoboardingPresentationDependencies.featureOnoboardingPresentationDependencies

plugins {
    id(Plugins.ANDROID_SETUP)
    id(Plugins.COMPOSE_SETUP)
}
android {
    namespace = FeatureOnoboardingPresentationDependencies.namespace
}
dependencies {
    featureOnoboardingPresentationDependencies()
}