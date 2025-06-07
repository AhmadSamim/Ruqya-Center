package com.sheesha.ruqyacenter.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sheesha.ruqyacenter.data.quranapi.AyahResponse
import com.sheesha.ruqyacenter.data.quranapi.JinCatchingMeta
import com.sheesha.ruqyacenter.data.quranapi.JinCatchingVerses
import com.sheesha.ruqyacenter.data.quranapi.VersesRepository
import com.sheesha.ruqyacenter.repository.QuranRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class QuranUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val dahmFahishaAyat: List<AyahResponse?> = emptyList(),
    val aynHasadAyat: List<AyahResponse?> = emptyList(),
    val sihrMadfun: List<AyahResponse?> = emptyList(),
    val sihrMakul: List<AyahResponse?> = emptyList(),
    val sihrTafreeq : List<AyahResponse?> = emptyList(),
    val sihrTateelZawaj : List<AyahResponse?> = emptyList(),
    val sihrMarshosh : List<AyahResponse?> = emptyList(),
    val sihrMakud : List<AyahResponse?> = emptyList(),
    val sihrRabt : List<AyahResponse?> = emptyList(),
    val sihrMahaba : List<AyahResponse?> = emptyList()


)

@HiltViewModel
class QuranViewModel @Inject constructor(
    private val repository: QuranRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(QuranUiState())
    val uiState: StateFlow<QuranUiState> = _uiState


    val _jinCatchingVerses = MutableStateFlow<List<JinCatchingVerses>>(emptyList())
    val jinCatchingVerses: StateFlow<List<JinCatchingVerses>> = _jinCatchingVerses


    init {
        viewModelScope.launch {
            getAllAyahtsFromApi()
        }
    }


    fun getAllAyahtsFromApi(){
        viewModelScope.launch {
            for ((surah , ayah) in VersesRepository.allAyats){
                try {
                    val response = repository.getAyahFromApi(surah,ayah)
                    repository.insertAyahtoAyahdb(response)
                } catch (e : Exception){
                    e.printStackTrace()
                }
            }
        }
    }

    fun fetchDahmFahishaAyat(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(dahmFahishaAyat = currentAyatList)
        }
    }

    fun fetchAyatSihrMarshosh(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(sihrMarshosh = currentAyatList)
        }
    }

    fun fetchAyatSihrTateelZawaj(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(sihrTateelZawaj = currentAyatList)
        }
    }

    fun fetchAyatMaqud(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(sihrMakud = currentAyatList)
        }
    }

    fun fetchAyatSihrRabt(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(sihrRabt = currentAyatList)
        }
    }

    fun fetchAyatSihrMahaba(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(sihrMahaba = currentAyatList)
        }
    }

    fun fetchAynHasadAyat(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(aynHasadAyat = currentAyatList)
        }
    }

    fun SihrMadfun(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(sihrMadfun = currentAyatList)
        }
    }

    fun sihrMakool(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(sihrMakul = currentAyatList)
        }
    }






    fun fetchJinCatchingVerses(verses: List<Pair<Int, Int>>) {
        viewModelScope.launch {
            val enrichedList = mutableListOf<JinCatchingVerses>()

            for ((surah, ayah) in verses) {
                try {
                    val response = repository.getAyahFromApi(surah, ayah)
                    val key = "${surah}:${ayah}"
                    val meta = JinCatchingMeta[key]

                    val combined = JinCatchingVerses(
                        title = meta?.first ?: "Untitled",
                        description = meta?.second ?: "No description available.",
                        verseText = response.arabic1,
                        translation = response.english,
                        audio = response.audio
                    )
                    enrichedList.add(combined)
                } catch (e: Exception) {
                    _uiState.value = _uiState.value.copy(error = "Failed at $surah:$ayah — ${e.message}")
                    return@launch
                }
            }

            _jinCatchingVerses.value = enrichedList
        }
    }


    fun fetchSihrTafreeqVerses(verses: List<Pair<Int, Int>>) {
        fetchAyatList(verses) { currentAyatList ->
            _uiState.value.copy(sihrTafreeq = currentAyatList)
        }
    }


    // This is generic method to fetch data from local storage
    fun fetchAyatList(
        verses: List<Pair<Int, Int>>,
        updateList: (List<AyahResponse?>) -> QuranUiState
    ) {
        _uiState.value = _uiState.value.copy(isLoading = true, error = null)
        viewModelScope.launch {
            val ayatList = mutableListOf<AyahResponse?>()
            for ((surah, ayah) in verses) {
                try {
                    val response = repository.getAyahFromAyahDb(surah, ayah)
                    ayatList.add(response)
                } catch (e: Exception) {
                    _uiState.value = _uiState.value.copy(isLoading = false, error = "Error loading $surah:$ayah — ${e.message}")
                    return@launch
                }
            }
            _uiState.value = updateList(ayatList).copy(isLoading = false)
        }
    }

}
