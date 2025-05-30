package com.sheesha.ruqyacenter.ui.screen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.sheesha.ruqyacenter.data.quranapi.VersesRepository
import com.sheesha.ruqyacenter.ui.viewmodel.QuranViewModel
@Composable
fun MarshoshScreen(viewModel: QuranViewModel) {
    val uiState = viewModel.uiState.collectAsState().value

    LaunchedEffect(Unit) {
        viewModel.fetchAynHasadAyat(
            VersesRepository.Ayat_Sihr_Marshosh()
        )
    }

    VerseListScreen(
        title = "Marshosh",
        uiState = uiState,
        verses = uiState.sihrMarshosh
    )
}