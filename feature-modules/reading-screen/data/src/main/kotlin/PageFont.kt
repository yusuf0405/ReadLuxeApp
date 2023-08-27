data class PageFontData(
    val titleId: Int,
    val pageFontStyles: List<PageFontStyleData>,
)

data class PageFontStyleData(
    val titleId: Int,
    val fontId: Int
)