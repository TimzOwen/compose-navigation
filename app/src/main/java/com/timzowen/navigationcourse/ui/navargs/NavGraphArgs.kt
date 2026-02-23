package com.timzowen.navigationcourse.ui.navargs

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavArgs(modifier: Modifier = Modifier) {


    val navController = rememberNavController()


    NavHost(navController, startDestination = Route.HomeScreen.route) {

        composable(Route.HomeScreen.route) {
            HomeScreen(
                onNavigate = { name, score ->
                    navController.navigate(Route.ProfileScreen.createRoute(name, score))
                }
            )
        }

        composable(
            Route.ProfileScreen.route,
            arguments = listOf(
                navArgument("name") { type = NavType.StringType },
                navArgument("score") { type = NavType.StringType }
            )
        ) {
            ProfileScreen(
                name = it.arguments?.getString("name"),
                score = it.arguments?.getString("score")
            )
        }
    }
}

sealed class Route(val route: String) {
    data object HomeScreen : Route("Home")

    data object ProfileScreen : Route("profile/{name}/{score}") {
        fun createRoute(name: String, score: String) = "profile/$name/$score"
    }
}

