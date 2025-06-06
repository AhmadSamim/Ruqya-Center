package com.sheesha.ruqyacenter.ui.screen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.sheesha.ruqyacenter.data.quranapi.VersesRepository
import com.sheesha.ruqyacenter.ui.viewmodel.QuranViewModel

@Composable
fun TateelAzawaj(viewModel: QuranViewModel) {
    val uiState = viewModel.uiState.collectAsState().value

    LaunchedEffect(Unit) {
        viewModel.fetchAyatSihrTateelZawaj(
            VersesRepository.Ayat_Sihr_Tateel_Zawaj()
        )
    }

    VerseListScreen(
        title = "Tateel Azawaj",
        uiState = uiState,
        verses = uiState.sihrTateelZawaj
    )
}




