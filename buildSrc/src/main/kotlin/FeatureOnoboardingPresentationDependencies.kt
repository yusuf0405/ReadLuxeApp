import AppDependencies.implementationProjects
import org.gradle.kotlin.dsl.DependencyHandlerScope

object FeatureOnoboardingPresentationDependencies {

    val namespace = "com.joseph.readluxe.onboarding.presentation"

    private val projects = listOf(
        Modules.CORE_COMMON,
        Modules.CORE_DATA,
    )

    fun DependencyHandlerScope.featureOnoboardingPresentationDependencies() {
        implementationProjects(projects)
    }
}