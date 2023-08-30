package com.joseph.readluxe.core.ui.theme.typography

import androidx.compose.material.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.joseph.readluxe.core.ui.theme.bodyExtraLargeFontSize
import com.joseph.readluxe.core.ui.theme.bodyExtraMediumFontSize
import com.joseph.readluxe.core.ui.theme.bodyExtraSmallFontSize
import com.joseph.readluxe.core.ui.theme.bodyLargeFontSize
import com.joseph.readluxe.core.ui.theme.bodyMediumFontSize
import com.joseph.readluxe.core.ui.theme.bodySmallFontSize
import com.joseph.readluxe.core.ui.theme.titleExtraLargeFontSize
import com.joseph.readluxe.core.ui.theme.titleExtraMediumFontSize
import com.joseph.readluxe.core.ui.theme.titleExtraSmallFontSize
import com.joseph.readluxe.core.ui.theme.titleLargeFontSize
import com.joseph.readluxe.core.ui.theme.titleMediumFontSize
import com.joseph.readluxe.core.ui.theme.titleSmallFontSize

@Immutable
class ReadLuxeTypography(
    //Title
    val titleExtraLarge: ReadLuxeFontsType = titleExtraLargeSet,
    val titleLarge: ReadLuxeFontsType = titleLargeSet,
    val titleExtraMedium: ReadLuxeFontsType = titleExtraMediumSet,
    val titleMedium: ReadLuxeFontsType = titleMediumSet,
    val titleExtraSmall: ReadLuxeFontsType = titleExtraSmallSet,
    val titleSmall: ReadLuxeFontsType = titleSmallSet,

    //Body
    val bodyExtraLarge: ReadLuxeFontsType = bodyExtraLargeSet,
    val bodyLarge: ReadLuxeFontsType = bodyLargeSet,
    val bodyExtraMedium: ReadLuxeFontsType = bodyExtraMediumSet,
    val bodyMedium: ReadLuxeFontsType = bodyMediumSet,
    val bodyExtraSmall: ReadLuxeFontsType = bodyExtraSmallSet,
    val bodySmall: ReadLuxeFontsType = bodySmallSet,
)

private val blackPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Black,
)
private val boldPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Bold,
)
private val regularPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Normal,
)
private val lightPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Light,
)
private val mediumPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Medium,
)
private val semiBoldPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.SemiBold,
)
private val thinPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Thin,
)
private val extraBoldPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.ExtraBold,
)

val titleExtraLargeSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = titleExtraLargeFontSize),
    bold = boldPoppins.copy(fontSize = titleExtraLargeFontSize),
    regular = regularPoppins.copy(fontSize = titleExtraLargeFontSize),
    light = lightPoppins.copy(fontSize = titleExtraLargeFontSize),
    medium = mediumPoppins.copy(fontSize = titleExtraLargeFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleExtraLargeFontSize),
    thin = thinPoppins.copy(fontSize = titleExtraLargeFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleExtraLargeFontSize)
)

val titleLargeSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = titleLargeFontSize),
    bold = boldPoppins.copy(fontSize = titleLargeFontSize),
    regular = regularPoppins.copy(fontSize = titleLargeFontSize),
    light = lightPoppins.copy(fontSize = titleLargeFontSize),
    medium = mediumPoppins.copy(fontSize = titleLargeFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleLargeFontSize),
    thin = thinPoppins.copy(fontSize = titleLargeFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleLargeFontSize)
)

val titleExtraMediumSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = titleExtraMediumFontSize),
    bold = boldPoppins.copy(fontSize = titleExtraMediumFontSize),
    regular = regularPoppins.copy(fontSize = titleExtraMediumFontSize),
    light = lightPoppins.copy(fontSize = titleExtraMediumFontSize),
    medium = mediumPoppins.copy(fontSize = titleExtraMediumFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleExtraMediumFontSize),
    thin = thinPoppins.copy(fontSize = titleExtraMediumFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleExtraMediumFontSize)
)

val titleMediumSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = titleMediumFontSize),
    bold = boldPoppins.copy(fontSize = titleMediumFontSize),
    regular = regularPoppins.copy(fontSize = titleMediumFontSize),
    light = lightPoppins.copy(fontSize = titleMediumFontSize),
    medium = mediumPoppins.copy(fontSize = titleMediumFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleMediumFontSize),
    thin = thinPoppins.copy(fontSize = titleMediumFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleMediumFontSize)
)

val titleExtraSmallSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = titleExtraSmallFontSize),
    bold = boldPoppins.copy(fontSize = titleExtraSmallFontSize),
    regular = regularPoppins.copy(fontSize = titleExtraSmallFontSize),
    light = lightPoppins.copy(fontSize = titleExtraSmallFontSize),
    medium = mediumPoppins.copy(fontSize = titleExtraSmallFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleExtraSmallFontSize),
    thin = thinPoppins.copy(fontSize = titleExtraSmallFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleExtraSmallFontSize)
)

val titleSmallSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = titleSmallFontSize),
    bold = boldPoppins.copy(fontSize = titleSmallFontSize),
    regular = regularPoppins.copy(fontSize = titleSmallFontSize),
    light = lightPoppins.copy(fontSize = titleSmallFontSize),
    medium = mediumPoppins.copy(fontSize = titleSmallFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleSmallFontSize),
    thin = thinPoppins.copy(fontSize = titleSmallFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleSmallFontSize)
)

val bodyExtraLargeSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = bodyExtraLargeFontSize),
    bold = boldPoppins.copy(fontSize = bodyExtraLargeFontSize),
    regular = regularPoppins.copy(fontSize = bodyExtraLargeFontSize),
    light = lightPoppins.copy(fontSize = bodyExtraLargeFontSize),
    medium = mediumPoppins.copy(fontSize = bodyExtraLargeFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyExtraLargeFontSize),
    thin = thinPoppins.copy(fontSize = bodyExtraLargeFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyExtraLargeFontSize)
)

val bodyLargeSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = bodyLargeFontSize),
    bold = boldPoppins.copy(fontSize = bodyLargeFontSize),
    regular = regularPoppins.copy(fontSize = bodyLargeFontSize),
    light = lightPoppins.copy(fontSize = bodyLargeFontSize),
    medium = mediumPoppins.copy(fontSize = bodyLargeFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyLargeFontSize),
    thin = thinPoppins.copy(fontSize = bodyLargeFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyLargeFontSize)
)

val bodyExtraMediumSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = bodyExtraMediumFontSize),
    bold = boldPoppins.copy(fontSize = bodyExtraMediumFontSize),
    regular = regularPoppins.copy(fontSize = bodyExtraMediumFontSize),
    light = lightPoppins.copy(fontSize = bodyExtraMediumFontSize),
    medium = mediumPoppins.copy(fontSize = bodyExtraMediumFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyExtraMediumFontSize),
    thin = thinPoppins.copy(fontSize = bodyExtraMediumFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyExtraMediumFontSize)
)

val bodyMediumSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = bodyMediumFontSize),
    bold = boldPoppins.copy(fontSize = bodyMediumFontSize),
    regular = regularPoppins.copy(fontSize = bodyMediumFontSize),
    light = lightPoppins.copy(fontSize = bodyMediumFontSize),
    medium = mediumPoppins.copy(fontSize = bodyMediumFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyMediumFontSize),
    thin = thinPoppins.copy(fontSize = bodyMediumFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyMediumFontSize)
)

val bodyExtraSmallSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = bodyExtraSmallFontSize),
    bold = boldPoppins.copy(fontSize = bodyExtraSmallFontSize),
    regular = regularPoppins.copy(fontSize = bodyExtraSmallFontSize),
    light = lightPoppins.copy(fontSize = bodyExtraSmallFontSize),
    medium = mediumPoppins.copy(fontSize = bodyExtraSmallFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyExtraSmallFontSize),
    thin = thinPoppins.copy(fontSize = bodyExtraSmallFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyExtraSmallFontSize)
)

val bodySmallSet: ReadLuxeFontsType = ReadLuxeFontsType(
    black = blackPoppins.copy(fontSize = bodySmallFontSize),
    bold = boldPoppins.copy(fontSize = bodySmallFontSize),
    regular = regularPoppins.copy(fontSize = bodySmallFontSize),
    light = lightPoppins.copy(fontSize = bodySmallFontSize),
    medium = mediumPoppins.copy(fontSize = bodySmallFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodySmallFontSize),
    thin = thinPoppins.copy(fontSize = bodySmallFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodySmallFontSize)
)

fun debugTypography(
    debugTextStyle: TextStyle = TextStyle(
        fontWeight = FontWeight.W100,
        fontSize = 6.sp
    ),
) = Typography(
    defaultFontFamily = PoppinsFont,
    h1 = debugTextStyle,
    h2 = debugTextStyle,
    h3 = debugTextStyle,
    h4 = debugTextStyle,
    h5 = debugTextStyle,
    h6 = debugTextStyle,
    subtitle1 = debugTextStyle,
    subtitle2 = debugTextStyle,
    body1 = debugTextStyle,
    body2 = debugTextStyle,
    button = debugTextStyle,
    caption = debugTextStyle,
    overline = debugTextStyle
)