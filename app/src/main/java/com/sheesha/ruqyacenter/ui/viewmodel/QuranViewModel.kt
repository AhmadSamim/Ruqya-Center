package com.sheesha.ruqyacenter.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sheesha.ruqyacenter.data.quranapi.AyahResponse
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
    val aynHasadAyat: List<AyahResponse> = emptyList()
)


@HiltViewModel
class QuranViewModel @Inject constructor(
    private val repository: QuranRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(QuranUiState())
    val uiState: StateFlow<QuranUiState> = _uiState

    fun fetchDahmFahishaAyat(verses: List<Pair<Int, Int>>) {
        _uiState.value = _uiState.value.copy(isLoading = true, error = null)

        viewModelScope.launch {
            val ayatList = mutableListOf<AyahResponse>()
            for ((surah, ayah) in verses) {
                try {
                    val response = repository.getAyah(surah, ayah)
                    ayatList.add(response)
                } catch (e: Exception) {
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = "Error loading $surah:$ayah — ${e.message}"
                    )
                    return@launch
                }
            }
            _uiState.value = _uiState.value.copy(
                isLoading = false,
                dahmFahishaAyat = ayatList
            )
        }
    }

    fun fetchAynHasadAyat(verses: List<Pair<Int, Int>>) {
        _uiState.value = _uiState.value.copy(isLoading = true, error = null)

        viewModelScope.launch {
            val ayatList = mutableListOf<AyahResponse>()
            for ((surah, ayah) in verses) {
                try {
                    val response = repository.getAyah(surah, ayah)
                    ayatList.add(response)
                } catch (e: Exception) {
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = "Error loading $surah:$ayah — ${e.message}"
                    )
                    return@launch
                }
            }
            _uiState.value = _uiState.value.copy(
                isLoading = false,
                aynHasadAyat = ayatList
            )
        }
    }
}
