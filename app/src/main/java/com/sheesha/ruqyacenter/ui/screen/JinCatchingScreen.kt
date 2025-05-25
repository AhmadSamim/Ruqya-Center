package com.sheesha.ruqyacenter.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sheesha.ruqyacenter.data.quranapi.JinCatchingVerses
import com.sheesha.ruqyacenter.ui.components.JinCatchingVerseCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JinCatchingScreen(title: String, verses: List<JinCatchingVerses>) {
    Scaffold(
        topBar = { TopAppBar(title = { Text(title) }) }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items (verses) { verse ->
                JinCatchingVerseCard(verse)
            }
        }
    }
}
