import AppDependencies.implementationProjects
import gradle.kotlin.dsl.accessors._404981569cb7bc4f1f0ba7441ad57f27.implementation
import org.gradle.kotlin.dsl.DependencyHandlerScope

object FeatureOnoboardingApiDependencies {

    val namespace = "com.joseph.readluxe.onboarding.api"

    private val projects = listOf(
        Modules.CORE_COMMON,
        Modules.CORE_DATA,
    )

    fun DependencyHandlerScope.featureOnoboardingApiDependencies() {
        implementationProjects(projects)
    }
}