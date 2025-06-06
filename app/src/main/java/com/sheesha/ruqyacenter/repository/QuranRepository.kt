package com.sheesha.ruqyacenter.repository

import com.sheesha.ruqyacenter.data.quranapi.AyahResponse
import com.sheesha.ruqyacenter.data.quranapi.QuranApiService
import javax.inject.Inject

class QuranRepository @Inject constructor(
    private val quranApiService: QuranApiService
) {
    suspend fun getAyah(surahNo: Int, ayahNo: Int): AyahResponse {
        return quranApiService.getAyahResponse(surahNo, ayahNo)
    }
}
