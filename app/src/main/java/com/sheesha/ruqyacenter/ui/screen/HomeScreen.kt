package com.sheesha.ruqyacenter.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sheesha.ruqyacenter.ui.navigation.NavigationRoutes


import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Ruqyah Center",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            )
        }
    ) { paddingValue ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValue)
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { navController.navigate(NavigationRoutes.DahmFahisha.route) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("🕌 Dahm Fahisha Verses")
            }
            Button(
                onClick = { navController.navigate(NavigationRoutes.AynHasad.route) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("🧿 Ayn Hasad Verses")
            }

            Button(
                onClick = { navController.navigate(NavigationRoutes.SihrMadfun.route) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("🪦 Sihr Madfun Verses")

            }


            Button(
                onClick = { navController.navigate(NavigationRoutes.SihrMakul.route) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("🥣 Sihr Makul Verses")


            }


            Button(
                onClick = { navController.navigate(NavigationRoutes.JinCatching.route) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("🔒 Jinn Catching")


            }

            Button(
                onClick = { navController.navigate(NavigationRoutes.SihrTafreeq.route) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("💔 Sihr Tafreeq")


            }
        }
    }
}
