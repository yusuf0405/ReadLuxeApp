package com.joseph.readluxe.core.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.joseph.readluxe.core.ui.theme.colors.AccentActive
import com.joseph.readluxe.core.ui.theme.colors.AccentActiveDark
import com.joseph.readluxe.core.ui.theme.colors.AccentActiveInverted
import com.joseph.readluxe.core.ui.theme.colors.AccentActiveInvertedDark
import com.joseph.readluxe.core.ui.theme.colors.AccentNegative
import com.joseph.readluxe.core.ui.theme.colors.AccentNegativeDark
import com.joseph.readluxe.core.ui.theme.colors.AccentNegativeInverted
import com.joseph.readluxe.core.ui.theme.colors.AccentNegativeInvertedDark
import com.joseph.readluxe.core.ui.theme.colors.AccentPositive
import com.joseph.readluxe.core.ui.theme.colors.AccentPositiveDark
import com.joseph.readluxe.core.ui.theme.colors.AccentPositiveInverted
import com.joseph.readluxe.core.ui.theme.colors.AccentPositiveInvertedDark
import com.joseph.readluxe.core.ui.theme.colors.AccentWarning
import com.joseph.readluxe.core.ui.theme.colors.AccentWarningDark
import com.joseph.readluxe.core.ui.theme.colors.AccentWarningInverted
import com.joseph.readluxe.core.ui.theme.colors.AccentWarningInvertedDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundHover
import com.joseph.readluxe.core.ui.theme.colors.BackgroundHoverDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundInverted
import com.joseph.readluxe.core.ui.theme.colors.BackgroundInvertedDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundModal
import com.joseph.readluxe.core.ui.theme.colors.BackgroundModalDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundNavbarIos
import com.joseph.readluxe.core.ui.theme.colors.BackgroundNavbarIosDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundOverlay
import com.joseph.readluxe.core.ui.theme.colors.BackgroundOverlayDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundPrimary
import com.joseph.readluxe.core.ui.theme.colors.BackgroundPrimaryDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundPrimaryElevated
import com.joseph.readluxe.core.ui.theme.colors.BackgroundPrimaryElevatedDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundSecondary
import com.joseph.readluxe.core.ui.theme.colors.BackgroundSecondaryDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundSecondaryElevated
import com.joseph.readluxe.core.ui.theme.colors.BackgroundSecondaryElevatedDark
import com.joseph.readluxe.core.ui.theme.colors.BackgroundStroke
import com.joseph.readluxe.core.ui.theme.colors.BackgroundStrokeDark
import com.joseph.readluxe.core.ui.theme.colors.Brand
import com.joseph.readluxe.core.ui.theme.colors.ControlActiveTabbar
import com.joseph.readluxe.core.ui.theme.colors.ControlActiveTabbarDark
import com.joseph.readluxe.core.ui.theme.colors.ControlAlternative
import com.joseph.readluxe.core.ui.theme.colors.ControlAlternativeDark
import com.joseph.readluxe.core.ui.theme.colors.ControlInactive
import com.joseph.readluxe.core.ui.theme.colors.ControlInactiveDark
import com.joseph.readluxe.core.ui.theme.colors.ControlInactiveTabbar
import com.joseph.readluxe.core.ui.theme.colors.ControlInactiveTabbarDark
import com.joseph.readluxe.core.ui.theme.colors.ControlPrimaryActive
import com.joseph.readluxe.core.ui.theme.colors.ControlPrimaryActiveDark
import com.joseph.readluxe.core.ui.theme.colors.ControlSecondaryActive
import com.joseph.readluxe.core.ui.theme.colors.ControlSecondaryActiveDark
import com.joseph.readluxe.core.ui.theme.colors.ControlTertiaryActive
import com.joseph.readluxe.core.ui.theme.colors.ControlTertiaryActiveDark
import com.joseph.readluxe.core.ui.theme.colors.IconsPrimary
import com.joseph.readluxe.core.ui.theme.colors.IconsPrimaryDark
import com.joseph.readluxe.core.ui.theme.colors.IconsSecondary
import com.joseph.readluxe.core.ui.theme.colors.IconsSecondaryDark
import com.joseph.readluxe.core.ui.theme.colors.IconsTertiary
import com.joseph.readluxe.core.ui.theme.colors.IconsTertiaryDark
import com.joseph.readluxe.core.ui.theme.colors.LocalReadLuxeColors
import com.joseph.readluxe.core.ui.theme.colors.ProvideReadLuxeColors
import com.joseph.readluxe.core.ui.theme.colors.ReadLuxeColors
import com.joseph.readluxe.core.ui.theme.colors.TextHeadline
import com.joseph.readluxe.core.ui.theme.colors.TextHeadlineDark
import com.joseph.readluxe.core.ui.theme.colors.TextInverted
import com.joseph.readluxe.core.ui.theme.colors.TextInvertedDark
import com.joseph.readluxe.core.ui.theme.colors.TextNegative
import com.joseph.readluxe.core.ui.theme.colors.TextNegativeDark
import com.joseph.readluxe.core.ui.theme.colors.TextPositive
import com.joseph.readluxe.core.ui.theme.colors.TextPositiveDark
import com.joseph.readluxe.core.ui.theme.colors.TextPrimary
import com.joseph.readluxe.core.ui.theme.colors.TextPrimaryDark
import com.joseph.readluxe.core.ui.theme.colors.TextPrimaryLink
import com.joseph.readluxe.core.ui.theme.colors.TextPrimaryLinkDark
import com.joseph.readluxe.core.ui.theme.colors.TextPrimaryLinkInverted
import com.joseph.readluxe.core.ui.theme.colors.TextPrimaryLinkInvertedDark
import com.joseph.readluxe.core.ui.theme.colors.TextSecondary
import com.joseph.readluxe.core.ui.theme.colors.TextSecondaryDark
import com.joseph.readluxe.core.ui.theme.colors.TextSecondaryLink
import com.joseph.readluxe.core.ui.theme.colors.TextSecondaryLinkDark
import com.joseph.readluxe.core.ui.theme.colors.TextTertiary
import com.joseph.readluxe.core.ui.theme.colors.TextTertiaryDark
import com.joseph.readluxe.core.ui.theme.colors.debugColors
import com.joseph.readluxe.core.ui.theme.typography.LocalReadLuxeTypography
import com.joseph.readluxe.core.ui.theme.typography.ProvideReadLuxeTypography
import com.joseph.readluxe.core.ui.theme.typography.ReadLuxeTypography
import com.joseph.readluxe.core.ui.theme.typography.debugTypography


// Не ограничивать видимость,
// т.к. предоставляем возможность расширения палитры
val lightPalette = ReadLuxeColors(
    /** Text **/
    /** Text **/
    textHeadline = TextHeadline,
    textPrimary = TextPrimary,
    textSecondary = TextSecondary,
    textTertiary = TextTertiary,
    textInverted = TextInverted,
    textPositive = TextPositive,
    textNegative = TextNegative,
    textPrimaryLink = TextPrimaryLink,
    textPrimaryLinkInverted = TextPrimaryLinkInverted,
    textSecondaryLink = TextSecondaryLink,

    /** Background **/

    /** Background **/
    backgroundPrimary = BackgroundPrimary,
    backgroundPrimaryElevated = BackgroundPrimaryElevated,
    backgroundModal = BackgroundModal,
    backgroundStroke = BackgroundStroke,
    backgroundSecondary = BackgroundSecondary,
    backgroundSecondaryElevated = BackgroundSecondaryElevated,
    backgroundInverted = BackgroundInverted,
    backgroundOverlay = BackgroundOverlay,
    backgroundHover = BackgroundHover,
    backgroundNavbarIos = BackgroundNavbarIos,

    /** Icons **/

    /** Icons **/
    iconsPrimary = IconsPrimary,
    iconsSecondary = IconsSecondary,
    iconsTertiary = IconsTertiary,

    /** Controls **/

    /** Controls **/
    controlsPrimaryActive = ControlPrimaryActive,
    controlsSecondaryActive = ControlSecondaryActive,
    controlsTertiaryActive = ControlTertiaryActive,
    controlsInactive = ControlInactive,
    controlsAlternative = ControlAlternative,
    controlsActiveTabBar = ControlActiveTabbar,
    controlsInactiveTabBar = ControlInactiveTabbar,

    /** Accent **/

    /** Accent **/
    accentActive = AccentActive,
    accentPositive = AccentPositive,
    accentWarning = AccentWarning,
    accentNegative = AccentNegative,

    accentActiveInverted = AccentActiveInverted,
    accentPositiveInverted = AccentPositiveInverted,
    accentWarningInverted = AccentWarningInverted,
    accentNegativeInverted = AccentNegativeInverted,

    brandMtsRed = Brand,

    isDark = false
)

// Не ограничивать видимость,
// т.к. предоставляем возможность расширения палитры
val darkPalette = ReadLuxeColors(
    /** Text **/
    textHeadline = TextHeadlineDark,
    textPrimary = TextPrimaryDark,
    textSecondary = TextSecondaryDark,
    textTertiary = TextTertiaryDark,
    textInverted = TextInvertedDark,
    textPositive = TextPositiveDark,
    textNegative = TextNegativeDark,
    textPrimaryLink = TextPrimaryLinkDark,
    textPrimaryLinkInverted = TextPrimaryLinkInvertedDark,
    textSecondaryLink = TextSecondaryLinkDark,

    /** Background **/
    backgroundPrimary = BackgroundPrimaryDark,
    backgroundPrimaryElevated = BackgroundPrimaryElevatedDark,
    backgroundModal = BackgroundModalDark,
    backgroundStroke = BackgroundStrokeDark,
    backgroundSecondary = BackgroundSecondaryDark,
    backgroundSecondaryElevated = BackgroundSecondaryElevatedDark,
    backgroundInverted = BackgroundInvertedDark,
    backgroundOverlay = BackgroundOverlayDark,
    backgroundHover = BackgroundHoverDark,
    backgroundNavbarIos = BackgroundNavbarIosDark,

    /** Icons **/
    iconsPrimary = IconsPrimaryDark,
    iconsSecondary = IconsSecondaryDark,
    iconsTertiary = IconsTertiaryDark,

    /** Controls **/
    controlsPrimaryActive = ControlPrimaryActiveDark,
    controlsSecondaryActive = ControlSecondaryActiveDark,
    controlsTertiaryActive = ControlTertiaryActiveDark,
    controlsInactive = ControlInactiveDark,
    controlsAlternative = ControlAlternativeDark,
    controlsActiveTabBar = ControlActiveTabbarDark,
    controlsInactiveTabBar = ControlInactiveTabbarDark,

    /** Accent **/
    accentActive = AccentActiveDark,
    accentPositive = AccentPositiveDark,
    accentWarning = AccentWarningDark,
    accentNegative = AccentNegativeDark,

    accentActiveInverted = AccentActiveInvertedDark,
    accentPositiveInverted = AccentPositiveInvertedDark,
    accentWarningInverted = AccentWarningInvertedDark,
    accentNegativeInverted = AccentNegativeInvertedDark,

    brandMtsRed = Brand,

    isDark = true
)

@Composable
fun ReadLuxeAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    typography: ReadLuxeTypography = ReadLuxeTypography(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) darkPalette else lightPalette

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colors.backgroundPrimary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    ProvideReadLuxeTypography(typography) {
        ProvideReadLuxeColors(colors) {
            MaterialTheme(
                colors = debugColors(darkTheme),
                typography = debugTypography(),
                content = content
            )
        }
    }
}


object ReadLuxeAppTheme {
    val colors:  ReadLuxeColors
        @Composable
        get() = LocalReadLuxeColors.current

    val typography: ReadLuxeTypography
        @Composable
        get() = LocalReadLuxeTypography.current
}