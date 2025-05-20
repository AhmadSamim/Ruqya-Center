package com.sheesha.ruqyacenter.data.quranapi

data class AudioItem(
    val reciter: String,
    val url: String,
    val originalUrl: String
)

data class AyahResponse(
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
