package com.wisnu.kurniawan.wallee.features.dashboard.di

import com.wisnu.kurniawan.wallee.features.dashboard.data.DashboardEnvironment
import com.wisnu.kurniawan.wallee.features.dashboard.data.IDashboardEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DashboardModule {

    @Binds
    abstract fun provideEnvironment(
        environment: DashboardEnvironment
    ): IDashboardEnvironment

}
