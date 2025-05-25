package com.sheesha.ruqyacenter.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sheesha.ruqyacenter.data.quranapi.AyahResponse
import com.sheesha.ruqyacenter.data.quranapi.JinCatchingMeta
import com.sheesha.ruqyacenter.data.quranapi.JinCatchingVerses
import com.sheesha.ruqyacenter.repository.QuranRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class QuranUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val dahmFahishaAyat: List<AyahResponse> = emptyList(),
    val aynHasadAyat: List<AyahResponse> = emptyList(),
    val sihrMadfun: List<AyahResponse> = emptyList(),
    val sihrMakul: List<AyahResponse> = emptyList(),


)

@HiltViewModel
class QuranViewModel @Inject constructor(
    private val repository: QuranRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(QuranUiState())
    val uiState: StateFlow<QuranUiState> = _uiState


    val _jinCatchingVerses = MutableStateFlow<List<JinCatchingVerses>>(emptyList())
    val jinCatchingVerses: StateFlow<List<JinCatchingVerses>> = _jinCatchingVerses

    fun fetchDahmFahishaAyat(verses: List<Pair<Int, Int>>) {
        _uiState.value = _uiState.value.copy(isLoading = true, error = null, dahmFahishaAyat = emptyList())



        viewModelScope.launch {
            for ((surah, ayah) in verses) {
                try {
                    val response = repository.getAyah(surah, ayah)
                    val currentList = _uiState.value.dahmFahishaAyat.toMutableList()
                    currentList.add(response)
                    _uiState.value = _uiState.value.copy(dahmFahishaAyat = currentList)
                } catch (e: Exception) {
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = "Error loading $surah:$ayah — ${e.message}"
                    )
                    return@launch
                }
            }
            _uiState.value = _uiState.value.copy(isLoading = false)
        }
    }

    fun fetchAynHasadAyat(verses: List<Pair<Int, Int>>) {
        _uiState.value = _uiState.value.copy(isLoading = true, error = null, aynHasadAyat = emptyList())

        viewModelScope.launch {
            for ((surah, ayah) in verses) {
                try {
                    val response = repository.getAyah(surah, ayah)
                    val currentList = _uiState.value.aynHasadAyat.toMutableList()
                    currentList.add(response)
                    _uiState.value = _uiState.value.copy(aynHasadAyat = currentList)
                } catch (e: Exception) {
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = "Error loading $surah:$ayah — ${e.message}"
                    )
                    return@launch
                }
            }
            _uiState.value = _uiState.value.copy(isLoading = false)
        }
    }

    fun SihrMadfun(verses: List<Pair<Int, Int>>) {
        _uiState.value = _uiState.value.copy(isLoading = true, error = null, sihrMadfun = emptyList())

        viewModelScope.launch {
            for ((surah, ayah) in verses) {
                try {
                    val response = repository.getAyah(surah, ayah)
                    val currentList = _uiState.value.sihrMadfun.toMutableList()
                    currentList.add(response)
                    _uiState.value = _uiState.value.copy(sihrMadfun = currentList)
                } catch (e: Exception) {
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = "Error loading $surah:$ayah — ${e.message}"
                    )
                    return@launch
                }
            }
            _uiState.value = _uiState.value.copy(isLoading = false)
        }
    }

    fun sihrMakool(verses: List<Pair<Int, Int>>) {
        _uiState.value = _uiState.value.copy(isLoading = true, error = null, sihrMakul = emptyList())

        viewModelScope.launch {
            for ((surah, ayah) in verses) {
                try {
                    val response = repository.getAyah(surah, ayah)
                    val currentList = _uiState.value.sihrMakul.toMutableList()
                    currentList.add(response)
                    _uiState.value = _uiState.value.copy(sihrMakul = currentList)
                } catch (e: Exception) {
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = "Error loading $surah:$ayah — ${e.message}"
                    )
                    return@launch
                }
            }
            _uiState.value = _uiState.value.copy(isLoading = false)
        }
    }

    fun fetchJinCatchingVerses(verses: List<Pair<Int, Int>>) {
        viewModelScope.launch {
            val enrichedList = mutableListOf<JinCatchingVerses>()

            for ((surah, ayah) in verses) {
                try {
                    val response = repository.getAyah(surah, ayah)
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

}
