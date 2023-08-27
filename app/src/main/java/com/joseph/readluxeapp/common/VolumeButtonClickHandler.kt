package com.joseph.readluxeapp.common


import com.joseph.readluxe.core.common.volume.FetchVolumeButtonClickActions
import com.joseph.readluxe.core.common.volume.SetVolumeButtonClickActions
import com.joseph.readluxeapp.common.navigation.common.VolumeButtonClickActions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class VolumeButtonClickHandler @Inject constructor(
) : FetchVolumeButtonClickActions, SetVolumeButtonClickActions {

    private val volumeButtonClickActionsFlow = MutableSharedFlow<VolumeButtonClickActions>(1)
    override fun fetchVolumeButtonClickActions(): Flow<VolumeButtonClickActions> =
        volumeButtonClickActionsFlow.asSharedFlow()

    override fun setVolumeButtonClickActions(volumeButtonClickActions: VolumeButtonClickActions) {
        volumeButtonClickActionsFlow.tryEmit(volumeButtonClickActions)
    }
}