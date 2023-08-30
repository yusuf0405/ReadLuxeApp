import FeatureReadingPresentationDependencies.featureReadingPresentationDependencies

plugins {
    id(Plugins.ANDROID_SETUP)
    id(Plugins.COMPOSE_SETUP)
    id(Plugins.HILT_SETUP)
    id(Plugins.HILT_PLUGIN)
}

android {
    namespace = FeatureReadingPresentationDependencies.namespace
}

dependencies {
    featureReadingPresentationDependencies()
}