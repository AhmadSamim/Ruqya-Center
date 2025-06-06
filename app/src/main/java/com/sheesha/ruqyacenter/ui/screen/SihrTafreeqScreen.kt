package com.sheesha.ruqyacenter.ui.screen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.sheesha.ruqyacenter.data.quranapi.VersesRepository
import com.sheesha.ruqyacenter.ui.viewmodel.QuranViewModel


@Composable
fun SihrTafreeqScreen(viewModel: QuranViewModel) {
    val uiState = viewModel.uiState.collectAsState().value

    // Start fetching verses only once when this composable appears
    LaunchedEffect(Unit) {
        // Provide the verses list from your repository or constants
        viewModel.fetchSihrTafreeqVerses(
            VersesRepository.Ayat_Sihr_Tafreeq()
        )
    }

    VerseListScreen(
        title = "Sihr Tafreeq",
        uiState = uiState,
        verses = uiState.sihrTafreeq
    )
}