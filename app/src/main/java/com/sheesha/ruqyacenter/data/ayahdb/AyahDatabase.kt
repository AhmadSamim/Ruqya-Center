package com.sheesha.ruqyacenter.data.ayahdb

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.sheesha.ruqyacenter.data.quranapi.AyahResponse

@Database(entities = [AyahResponse::class], version = 1)
@TypeConverters(Converters::class)
abstract class AyahDatabase : RoomDatabase() {
    abstract fun ayahDao(): AyahDao
}