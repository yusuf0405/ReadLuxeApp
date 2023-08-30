object Modules {

    const val CORE_COMMON = ":core:common"
    const val CORE_UI = ":core:ui"
    const val CORE_DATA = ":core:data"

    const val FEATURE_READING_SCREEN_API = ":feature-modules:reading-screen:api"
    const val FEATURE_READING_SCREEN_PRESENTATION = ":feature-modules:reading-screen:presentation"

    const val FEATURE_ADD_BOOK_SCREEN_API = ":feature-modules:reading-screen:api"
    const val FEATURE_ADD_BOOK_SCREEN_PRESENTATION = ":feature-modules:add-book-screen:presentation"

    const val FEATURE_MAIN_SCREEN_API = ":feature-modules:main-screen:api"
    const val FEATURE_MAIN_SCREEN_PRESENTATION = ":feature-modules:main-screen:presentation"

    const val FEATURE_ONBOADING_API = ":feature-modules:onboarding-screen:api"
    const val FEATURE_ONBOADING_PRESENTATION = ":feature-modules:onboarding-screen:presentation"

    val allModules = listOf(
        CORE_COMMON,
        CORE_UI,
        CORE_DATA,
        FEATURE_READING_SCREEN_API,
        FEATURE_READING_SCREEN_PRESENTATION,
        FEATURE_ADD_BOOK_SCREEN_API,
        FEATURE_ADD_BOOK_SCREEN_PRESENTATION,
        FEATURE_MAIN_SCREEN_API,
        FEATURE_MAIN_SCREEN_PRESENTATION,
        FEATURE_ONBOADING_API,
        FEATURE_ONBOADING_PRESENTATION
    )
}
