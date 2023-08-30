import AppDependencies.implementationProjects
import AppDependencies.implementations
import Dependencies.coroutines
import gradle.kotlin.dsl.accessors._404981569cb7bc4f1f0ba7441ad57f27.implementation
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

object FeatureAddBookPresentationDependencies {

    val namespace = "com.joseph.readluxe.addbookscreen.presentation"

    val projects = listOf(
        Modules.CORE_COMMON,
        Modules.CORE_UI,
        Modules.CORE_DATA
    )

    fun DependencyHandlerScope.featureAddBookPresentationDependencies() {
        implementationProjects(projects)
        coroutines()
    }
}