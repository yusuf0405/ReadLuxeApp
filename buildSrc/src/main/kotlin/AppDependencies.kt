import gradle.kotlin.dsl.accessors._404981569cb7bc4f1f0ba7441ad57f27.implementation
import org.gradle.api.artifacts.dsl.DependencyHandler

object AppDependencies {

    //util functions for adding the different type dependencies from build.gradle file
    fun DependencyHandler.kapts(list: List<String>) {
        list.forEach { dependency ->
            add("kapt", dependency)
        }
    }

    fun DependencyHandler.implementationProjects(list: List<String>) {
        list.forEach { path ->
            implementation(project(mapOf("path" to path)))
        }
    }

    fun DependencyHandler.implementations(list: List<String>) {
        list.forEach { dependency ->
            add("implementation", dependency)
        }
    }

    fun DependencyHandler.huaweiImplementations(list: List<String>) {
        list.forEach { dependency ->
            add("huaweiImplementation", dependency)
        }
    }

    fun DependencyHandler.debugImplementations(list: List<String>) {
        list.forEach { dependency ->
            add("debugImplementation", dependency)
        }
    }

    fun DependencyHandler.androidTestImplementations(list: List<String>) {
        list.forEach { dependency ->
            add("androidTestImplementation", dependency)
        }
    }

    fun DependencyHandler.testImplementations(list: List<String>) {
        list.forEach { dependency ->
            add("testImplementation", dependency)
        }
    }
}