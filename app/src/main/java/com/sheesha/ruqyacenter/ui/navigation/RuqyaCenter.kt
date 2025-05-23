package com.sheesha.ruqyacenter.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sheesha.ruqyacenter.ui.screen.AynHasadScreen
import com.sheesha.ruqyacenter.ui.screen.DahmFahishaScreen
import com.sheesha.ruqyacenter.ui.screen.HomeScreen
import com.sheesha.ruqyacenter.ui.screen.Sihr_Madfun_Verses
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
    }
}