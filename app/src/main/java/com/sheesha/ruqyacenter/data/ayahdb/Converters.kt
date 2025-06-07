package com.sheesha.ruqyacenter.data.ayahdb

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sheesha.ruqyacenter.data.quranapi.AudioItem

@ProvidedTypeConverter
class Converters {
    private val gson = Gson()

    @TypeConverter
    fun fromAudioMap(value: Map<String, AudioItem>?): String? {
        return gson.toJson(value)
    }

    @TypeConverter
    fun toAudioMap(value: String?): Map<String, AudioItem>? {
        if (value == null) return null
        val type = object : TypeToken<Map<String, AudioItem>>() {}.type
        return gson.fromJson(value, type)
    }
}
