package com.sheesha.ruqyacenter.data.quranapi



import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface QuranApiService {
    @GET("/api/{surahNo}/{ayahNo}.json")
    suspend fun getAyahResponse(
        @Path("surahNo") surahNo: Int,
        @Path("ayahNo") ayahNo: Int
    ): AyahResponse

}

