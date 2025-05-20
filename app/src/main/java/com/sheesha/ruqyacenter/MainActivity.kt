package com.sheesha.ruqyacenter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sheesha.ruqyacenter.ui.navigation.RuqyaCenterApp
import com.sheesha.ruqyacenter.ui.theme.RuqyaCenterTheme
import com.sheesha.ruqyacenter.ui.viewmodel.QuranViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel : QuranViewModel = viewModel()
            RuqyaCenterTheme {
                RuqyaCenterApp(viewModel)
                }
            }
        }
    }



