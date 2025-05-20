package com.sheesha.ruqyacenter.di

import com.sheesha.ruqyacenter.data.quranapi.QuranApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

import javax.inject.Named
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Named("QuranApi")
    fun provideQuranRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://quranapi.pages.dev/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Named("QuranEncApi")
    fun provideQuranEncRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.quranenc.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideQuranApiService(@Named("QuranApi") retrofit: Retrofit): QuranApiService {
        return retrofit.create(QuranApiService::class.java)
    }

    /*@Provides
    fun provideQuranEncApiService(@Named("QuranEncApi") retrofit: Retrofit): QuranEncApiService {
        return retrofit.create(QuranEncApiService::class.java)
    }*/
}
