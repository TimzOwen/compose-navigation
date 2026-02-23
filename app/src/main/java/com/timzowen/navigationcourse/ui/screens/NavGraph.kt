package com.timzowen.navigationcourse.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavGraph() {

    // Step 1 --> NavController
    val navController = rememberNavController()

    // Step 2 ---> NavHost (navC, destination)
    NavHost(navController = navController, startDestination = Route.ScreenA.route) {

        // Step 3--> Declare your screens(route, composable screen, params(NaC))
        composable(Route.ScreenA.route) {
            ScreenA(onNavigate = {
                navController.navigate(Route.ScreenB.route)
            })
        }

        composable(Route.ScreenB.route) {
            ScreenB(onNavigate = {
                navController.navigate(Route.ScreenC.route)
            })
        }

        composable(Route.ScreenC.route) {
            ScreenC(onNavigate = {
                navController.navigate(Route.ScreenA.route) {
                    popUpTo(Route.ScreenA.route) {
                        inclusive = true
                    }
                }
            })
        }
    }
}


sealed class Route(val route: String) {
    data object ScreenA : Route("A")
    data object ScreenB : Route("B")
    data object ScreenC : Route("C")
}



















