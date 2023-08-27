package com.joseph.readluxeapp.di

import com.joseph.readluxeapp.common.VolumeButtonClickHandler
import com.joseph.readluxe.core.common.volume.FetchVolumeButtonClickActions
import com.joseph.readluxe.core.common.volume.SetVolumeButtonClickActions
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CommonModule {

    @Binds
    abstract fun bindFetchVolumeButtonClickActions(
        implementation: VolumeButtonClickHandler
    ): FetchVolumeButtonClickActions

    @Binds
    abstract fun bindSetVolumeButtonClickActions(
        implementation: VolumeButtonClickHandler
    ): SetVolumeButtonClickActions
}