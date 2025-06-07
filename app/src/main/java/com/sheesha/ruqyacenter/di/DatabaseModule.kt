package com.sheesha.ruqyacenter.di

import android.content.Context
import androidx.room.Room
import com.sheesha.ruqyacenter.data.ayahdb.AyahDao
import com.sheesha.ruqyacenter.data.ayahdb.AyahDatabase
import com.sheesha.ruqyacenter.data.ayahdb.Converters
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideConverters(): Converters {
        return Converters()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context,converters: Converters): AyahDatabase {
        return Room.databaseBuilder(
            context,
            AyahDatabase::class.java,
            "ayah_database"
        ).addTypeConverter(converters)
         .build()
    }

    @Provides
    fun provideAyahDao(database: AyahDatabase): AyahDao {
        return database.ayahDao()
    }
}
