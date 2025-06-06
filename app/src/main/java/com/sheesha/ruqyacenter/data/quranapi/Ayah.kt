package com.sheesha.ruqyacenter.data.quranapi

import androidx.room.Entity
import androidx.room.PrimaryKey

data class AudioItem(
    val reciter: String,
    val url: String,
    val originalUrl: String
)

@Entity(tableName = "ayah")
data class AyahResponse(
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    val surahName: String,
    val surahNameArabic: String,
    val surahNameArabicLong: String,
    val surahNameTranslation: String,
    val revelationPlace: String,
    val totalAyah: Int,
    val surahNo: Int,
    val ayahNo: Int,
    val audio: Map<String, AudioItem>,
    val english: String,
    val arabic1: String,
    val arabic2: String,
    val bengali: String,
    val urdu: String
)


data class JinCatchingVerses(
    val title: String,
    val description: String,
    val verseText: String,
    val translation: String,
    val audio: Map<String, AudioItem>
)
