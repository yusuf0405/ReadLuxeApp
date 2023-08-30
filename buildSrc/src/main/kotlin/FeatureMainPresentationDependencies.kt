import AppDependencies.implementationProjects
import gradle.kotlin.dsl.accessors._404981569cb7bc4f1f0ba7441ad57f27.implementation
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

object FeatureMainPresentationDependencies {

    val namespace = "com.joseph.readluxe.mainscreen.presentation"

    private val projects = listOf(
        Modules.CORE_COMMON,
        Modules.CORE_UI,
        Modules.CORE_DATA,
        Modules.FEATURE_MAIN_SCREEN_API,
    )

    fun DependencyHandlerScope.featureMainPresentationDependencies() {
        implementationProjects(projects)
    }
}