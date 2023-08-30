import AppDependencies.implementationProjects
import Dependencies.compose
import Dependencies.navigation
import Dependencies.coroutines
import gradle.kotlin.dsl.accessors._404981569cb7bc4f1f0ba7441ad57f27.implementation

dependencies {
    implementationProjects(Modules.allModules)
    coroutines()
    compose()
    navigation()
}