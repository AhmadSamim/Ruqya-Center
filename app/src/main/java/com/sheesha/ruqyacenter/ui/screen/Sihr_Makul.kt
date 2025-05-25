package com.sheesha.ruqyacenter.ui.screen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.sheesha.ruqyacenter.data.quranapi.JinCatchingVerses
import com.sheesha.ruqyacenter.data.quranapi.VersesRepository
import com.sheesha.ruqyacenter.ui.viewmodel.QuranViewModel

@Composable
fun Sihr_Makul(viewModel: QuranViewModel) {
    val uiState = viewModel.uiState.collectAsState().value

    LaunchedEffect(Unit) {
        viewModel.sihrMakool(
            VersesRepository.Ayat_Sihr_Makul()
        )
    }

    VerseListScreen(
        title = "Sihr Makul",
        uiState = uiState,
        verses = uiState.sihrMakul
    )

}


