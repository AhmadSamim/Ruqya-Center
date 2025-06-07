package com.sheesha.ruqyacenter.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sheesha.ruqyacenter.data.quranapi.AyahResponse
import com.sheesha.ruqyacenter.ui.components.AyahCard
import com.sheesha.ruqyacenter.ui.viewmodel.QuranUiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerseListScreen(title: String, uiState: QuranUiState, verses: List<AyahResponse?>) {
    Scaffold(
        topBar = { TopAppBar(title = { Text(title) }) }
    ) { padding ->

        when {
            uiState.isLoading -> {
                Box(Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center) {
                    CircularProgressIndicator()
                }
            }
            uiState.error != null -> {
                Box(Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center) {
                    Text(text = uiState.error, color = MaterialTheme.colorScheme.error)
                }
            }
            else -> {
                LazyColumn (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(verses) { ayah ->
                        AyahCard(ayah)
                    }
                }
            }
        }
    }
}