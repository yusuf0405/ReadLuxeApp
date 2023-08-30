import FeatureAddBookPresentationDependencies.featureAddBookPresentationDependencies

plugins {
    id(Plugins.ANDROID_SETUP)
    id(Plugins.COMPOSE_SETUP)
}

android {
    namespace = FeatureAddBookPresentationDependencies.namespace
}

dependencies {
    featureAddBookPresentationDependencies()
}