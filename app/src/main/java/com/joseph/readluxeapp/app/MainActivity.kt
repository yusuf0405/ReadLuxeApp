package com.joseph.readluxeapp.app

import android.os.Bundle
import android.view.KeyEvent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.joseph.readluxe.core.ui.theme.ReadLuxeAppTheme
import com.joseph.readluxeapp.common.navigation.common.VolumeButtonClickActions
import com.joseph.readluxeapp.navigation.AppNavGraph
import com.joseph.readluxeapp.navigation.routers.OnboardingScreenRouter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReadLuxeAppTheme {
                AppNavGraph(
                    routers = viewModel.routers.toList(),
                    startDestination = OnboardingScreenRouter.ONBOARDING_SCREEN_ROUTE
                )
            }
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return when (event?.keyCode) {
            KeyEvent.KEYCODE_VOLUME_UP -> {
                viewModel.setVolumeButtonClickActions(VolumeButtonClickActions.VOLUME_UP)
                return true
            }

            KeyEvent.KEYCODE_VOLUME_DOWN -> {
                viewModel.setVolumeButtonClickActions(VolumeButtonClickActions.VOLUME_DOWN)
                return true
            }

            else -> super.onKeyDown(keyCode, event)
        }
    }
}