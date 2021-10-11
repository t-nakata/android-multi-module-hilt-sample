package com.axiaworks.mms.di

import com.axiaworks.main.MainUiRouter
import com.axiaworks.router.MainUiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object RouterModule {

    @Provides
    fun provideMainUiRouter(impl: MainUiImpl): MainUiRouter = impl
}