package models

import androidx.annotation.StringRes
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.joseph.readluxe.core.ui.R

data class BookFont(
    @StringRes val titleId: Int,
    val fontSubTypes: List<BookFontsStyle>
) {

    companion object {

        fun allFonts() = listOf(
            BookFont(
                titleId = R.string.caslon,
                fontSubTypes = listOf(
                    BookFontsStyle(
                        titleId = R.string.regular,
                        fontId = R.font.caslon
                    ),
                    BookFontsStyle(
                        titleId = R.string.bold,
                        fontId = R.font.caslonbold
                    ),
                    BookFontsStyle(
                        titleId = R.string.italic,
                        fontId = R.font.caslon_italic
                    )
                )
            ),

            BookFont(
                titleId = R.string.baskerville,
                fontSubTypes = listOf(
                    BookFontsStyle(
                        titleId = R.string.light,
                        fontId = R.font.baskervillelight
                    ),
                    BookFontsStyle(
                        titleId = R.string.light_italic,
                        fontId = R.font.baskerville_lightitalic
                    ),
                    BookFontsStyle(
                        titleId = R.string.bold,
                        fontId = R.font.baskervillebold
                    ),
                )
            ),

            BookFont(
                titleId = R.string.janson,
                fontSubTypes = listOf(
                    BookFontsStyle(
                        titleId = R.string.regular,
                        fontId = R.font.janson
                    ),
                    BookFontsStyle(
                        titleId = R.string.bold,
                        fontId = R.font.janson_bold
                    ),
                    BookFontsStyle(
                        titleId = R.string.italic,
                        fontId = R.font.janson_italic
                    ),
                )
            ),
            BookFont(
                titleId = R.string.pequena_pro,
                fontSubTypes = listOf(
                    BookFontsStyle(
                        titleId = R.string.regular,
                        fontId = R.font.pequena_pro_regular
                    ),
                    BookFontsStyle(
                        titleId = R.string.layer_one,
                        fontId = R.font.pequena_pro_layer_one
                    ),
                    BookFontsStyle(
                        titleId = R.string.shape,
                        fontId = R.font.pequena_pro_shape
                    ),
                )
            ),

            BookFont(
                titleId = R.string.dante,
                fontSubTypes = listOf(
                    BookFontsStyle(
                        titleId = R.string.regular,
                        fontId = R.font.dante
                    ),
                    BookFontsStyle(
                        titleId = R.string.italic,
                        fontId = R.font.dante_italic
                    ),
                    BookFontsStyle(
                        titleId = R.string.bold,
                        fontId = R.font.dante_bold
                    ),
                )
            ),

            BookFont(
                titleId = R.string.garamond,
                fontSubTypes = listOf(
                    BookFontsStyle(
                        titleId = R.string.regular,
                        fontId = R.font.garamond
                    ),
                    BookFontsStyle(
                        titleId = R.string.bold,
                        fontId = R.font.garamond_bold
                    ),
                    BookFontsStyle(
                        titleId = R.string.italic,
                        fontId = R.font.garamond_italic
                    ),
                )
            )
        )
    }

    fun fontFamily() = FontFamily(
        listOf(
            Font(
                fontSubTypes.first().fontId,
                FontWeight.Normal
            )
        )
    )
}