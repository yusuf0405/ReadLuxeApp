import AppDependencies.implementationProjects
import org.gradle.kotlin.dsl.DependencyHandlerScope

object FeatureOnoboardingPresentationDependencies {

    val namespace = "com.joseph.readluxe.onboarding.presentation"

    private val projects = listOf(
        Modules.CORE_COMMON,
        Modules.CORE_DATA,
        Modules.CORE_UI,
        Modules.FEATURE_ONBOADING_API,
    )

    fun DependencyHandlerScope.featureOnoboardingPresentationDependencies() {
        implementationProjects(projects)
    }
}