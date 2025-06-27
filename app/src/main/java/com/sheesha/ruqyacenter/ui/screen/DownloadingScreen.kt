package com.sheesha.ruqyacenter.ui.screen


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.LinearProgressIndicator

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sheesha.ruqyacenter.ui.theme.RuqyaCenterTheme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.ui.unit.dp


@Composable
fun DownloadingScreen(
    progress: Float,
    isDownloading: Boolean,
    getAyahts: () -> Unit
) {


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        ) {
            if (isDownloading) {
                Text("Downloading... ${(progress * 100).toInt()}%")
                Spacer(modifier = Modifier.height(12.dp))
                LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier.fillMaxWidth(),)
            } else {
                Button(onClick = { getAyahts }) {
                    Text("Start Download")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DownloadDataFromApiPreview() {
    RuqyaCenterTheme {
        DownloadingScreen (0f,true,{})
    }
}
