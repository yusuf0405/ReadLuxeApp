package com.joseph.readluxeapp

import androidx.lifecycle.ViewModel
import com.joseph.readluxe.core.common.volume.SetVolumeButtonClickActions
import com.joseph.readluxeapp.common.navigation.common.VolumeButtonClickActions
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import com.joseph.readluxeapp.di.navigation.Routers
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel  @Inject constructor(
    @Routers
    val routers: Set<@JvmSuppressWildcards FeatureRouterApi>,
    private val setVolumeButtonClickActions: SetVolumeButtonClickActions
) : ViewModel() {


    fun setVolumeButtonClickActions(volumeButtonClickActions: VolumeButtonClickActions) {
        setVolumeButtonClickActions.setVolumeButtonClickActions(volumeButtonClickActions)
    }
}