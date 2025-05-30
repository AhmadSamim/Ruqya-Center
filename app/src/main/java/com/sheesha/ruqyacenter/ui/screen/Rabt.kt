package com.sheesha.ruqyacenter.ui.screen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.sheesha.ruqyacenter.data.quranapi.VersesRepository
import com.sheesha.ruqyacenter.ui.viewmodel.QuranViewModel
@Composable
fun Rabt(viewModel: QuranViewModel) {
    val uiState = viewModel.uiState.collectAsState().value

    LaunchedEffect(Unit) {
        viewModel.fetchAynHasadAyat(
            VersesRepository.Ayat_Sihr_Rabt()
        )
    }

    VerseListScreen(
        title = "Rabt",
        uiState = uiState,
        verses = uiState.sihrRabt
    )
}