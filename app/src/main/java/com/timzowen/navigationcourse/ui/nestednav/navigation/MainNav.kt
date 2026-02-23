package com.timzowen.navigationcourse.ui.nestednav.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun MainAppNav() {

    val navController = rememberNavController()

    NavHost(navController, startDestination = AppRoutes.Auth.route) {

        authGraph(navController)
        homeNavGraph(navController)

    }
}