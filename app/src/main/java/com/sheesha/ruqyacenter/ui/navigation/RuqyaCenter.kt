package com.sheesha.ruqyacenter.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sheesha.ruqyacenter.data.quranapi.VersesRepository
import com.sheesha.ruqyacenter.ui.screen.AynHasadScreen
import com.sheesha.ruqyacenter.ui.screen.DahmFahishaScreen
import com.sheesha.ruqyacenter.ui.screen.HomeScreen
import com.sheesha.ruqyacenter.ui.screen.JinCatchingScreen
import com.sheesha.ruqyacenter.ui.screen.SihrTafreeqScreen
import com.sheesha.ruqyacenter.ui.screen.Sihr_Madfun_Verses
import com.sheesha.ruqyacenter.ui.screen.Sihr_Makul
import com.sheesha.ruqyacenter.ui.viewmodel.QuranViewModel

@Composable
fun RuqyaCenterApp(
    viewModel : QuranViewModel
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationRoutes.Home.route) {

        composable(NavigationRoutes.Home.route) {
            HomeScreen(navController)
        }

        composable(NavigationRoutes.DahmFahisha.route) {

            DahmFahishaScreen(viewModel)
        }

        composable(NavigationRoutes.AynHasad.route) {

            AynHasadScreen(viewModel)
        }

        composable(NavigationRoutes.SihrMadfun.route) {

            Sihr_Madfun_Verses(viewModel)
        }

        composable(NavigationRoutes.SihrMakul.route) {

            Sihr_Makul(viewModel)
        }

        composable(NavigationRoutes.JinCatching.route) {
            LaunchedEffect(Unit) {
                // Provide the verses list from your repository or constants
                viewModel.fetchJinCatchingVerses(
                    VersesRepository.Ayat_Jinn_Catching()
                )
            }

            JinCatchingScreen(title = "JinCatchingVerses",viewModel.jinCatchingVerses.collectAsState().value)
        }

        composable(NavigationRoutes.SihrTafreeq.route) {

            SihrTafreeqScreen(viewModel)

        }
    }
}