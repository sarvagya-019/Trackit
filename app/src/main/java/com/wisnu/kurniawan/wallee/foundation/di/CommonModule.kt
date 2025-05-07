package com.wisnu.kurniawan.wallee.foundation.di

import com.wisnu.kurniawan.wallee.foundation.wrapper.DateTimeProvider
import com.wisnu.kurniawan.wallee.foundation.wrapper.DateTimeProviderImpl
import com.wisnu.kurniawan.wallee.foundation.wrapper.IdProvider
import com.wisnu.kurniawan.wallee.foundation.wrapper.IdProviderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CommonModule {

    @Singleton
    @Provides
    fun provideIdProvider(): IdProvider {
        return IdProviderImpl()
    }

    @Singleton
    @Provides
    fun provideDateTimeProvider(): DateTimeProvider {
        return DateTimeProviderImpl()
    }

}
