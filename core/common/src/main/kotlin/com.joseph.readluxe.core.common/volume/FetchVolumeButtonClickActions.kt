package com.joseph.readluxe.core.common.volume

import com.joseph.readluxeapp.common.navigation.common.VolumeButtonClickActions
import kotlinx.coroutines.flow.Flow

interface FetchVolumeButtonClickActions {

    fun fetchVolumeButtonClickActions(): Flow<VolumeButtonClickActions>

}