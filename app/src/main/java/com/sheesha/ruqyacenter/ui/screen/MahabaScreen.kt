package com.sheesha.ruqyacenter.ui.screen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.sheesha.ruqyacenter.data.quranapi.VersesRepository
import com.sheesha.ruqyacenter.ui.viewmodel.QuranViewModel

@Composable
fun MahabaScreen(viewModel: QuranViewModel) {
    val uiState = viewModel.uiState.collectAsState().value

    LaunchedEffect(Unit) {
        viewModel.fetchAyatSihrMahaba(
            VersesRepository.Ayat_Sihr_Mahaba()
        )
    }

    VerseListScreen(
        title = "Mahaba",
        uiState = uiState,
        verses = uiState.sihrMahaba
    )
}