import FeatureMainPresentationDependencies.featureMainPresentationDependencies

plugins {
    id(Plugins.ANDROID_SETUP)
    id(Plugins.COMPOSE_SETUP)
    id(Plugins.HILT_PLUGIN)
    id(Plugins.HILT_SETUP)
}

android {
    namespace = FeatureMainPresentationDependencies.namespace
}

dependencies {
    featureMainPresentationDependencies()
}