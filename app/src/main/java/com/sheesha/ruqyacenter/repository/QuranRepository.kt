package com.sheesha.ruqyacenter.repository

import com.sheesha.ruqyacenter.data.ayahdb.AyahDao
import com.sheesha.ruqyacenter.data.quranapi.AyahResponse
import com.sheesha.ruqyacenter.data.quranapi.QuranApiService
import javax.inject.Inject

class QuranRepository @Inject constructor(
    private val quranApiService: QuranApiService,
    private val ayahDao: AyahDao
) {
    suspend fun getAyahFromApi(surahNo: Int, ayahNo: Int): AyahResponse {
        return quranApiService.getAyahResponse(surahNo, ayahNo)
    }

    //Insert the single ayah into our local Db for offline use
    suspend fun insertAyahtoAyahdb(ayah: AyahResponse){
        ayahDao.insertAyah(ayah)
    }

    suspend fun getAyahFromAyahDb(surahNo: Int,ayahNo: Int) : AyahResponse?{
        return ayahDao.getAyah(surahNo, ayahNo)
    }



}
