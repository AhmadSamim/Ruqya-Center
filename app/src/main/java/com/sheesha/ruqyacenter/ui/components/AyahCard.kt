package com.sheesha.ruqyacenter.ui.components


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.sheesha.ruqyacenter.data.quranapi.AyahResponse


@Composable
fun AyahCard(ayah: AyahResponse) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(text = "Surah ${ayah.surahName} (${ayah.surahNo}): Ayah ${ayah.ayahNo}", style = MaterialTheme.typography.titleSmall)
            Spacer(Modifier.height(8.dp))
            Text(text = ayah.arabic1,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Right
            )
            Spacer(Modifier.height(4.dp))
            Text(text = ayah.english, style = MaterialTheme.typography.bodySmall)
        }
    }
}
