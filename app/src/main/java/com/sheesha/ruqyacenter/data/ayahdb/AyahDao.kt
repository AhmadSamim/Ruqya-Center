package com.sheesha.ruqyacenter.data.ayahdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sheesha.ruqyacenter.data.quranapi.AyahResponse

@Dao
interface AyahDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAyah(ayah: AyahResponse)

    @Query("SELECT * FROM ayah WHERE surahNo = :surahNo AND ayahNo = :ayahNo LIMIT 1")
    suspend fun getAyah(surahNo: Int, ayahNo: Int): AyahResponse?

    @Query("SELECT * FROM ayah")
    suspend fun getAllAyahs(): List<AyahResponse>

    @Query("DELETE FROM ayah")
    suspend fun clearAll()
}
