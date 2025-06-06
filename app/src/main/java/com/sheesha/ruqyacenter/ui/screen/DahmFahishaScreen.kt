package com.sheesha.ruqyacenter.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.sheesha.ruqyacenter.data.quranapi.VersesRepository
import com.sheesha.ruqyacenter.ui.viewmodel.QuranViewModel

@Composable
fun DahmFahishaScreen(viewModel: QuranViewModel) {
    val uiState = viewModel.uiState.collectAsState().value

    // Start fetching verses only once when this composable appears
    LaunchedEffect(Unit) {
        // Provide the verses list from your repository or constants
        viewModel.fetchDahmFahishaAyat(
            VersesRepository.Ayat_Dahm_Fahisha()
        )
    }

    VerseListScreen(
        title = "Dahm Fahisha Verses",
        uiState = uiState,
        verses = uiState.dahmFahishaAyat
    )
}


