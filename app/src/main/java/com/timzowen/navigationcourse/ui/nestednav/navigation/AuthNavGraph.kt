package com.timzowen.navigationcourse.ui.nestednav.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.timzowen.navigationcourse.ui.nestednav.screens.LoginScreen
import com.timzowen.navigationcourse.ui.nestednav.screens.ResetPinScreen
import com.timzowen.navigationcourse.ui.nestednav.screens.SignupScreen

fun NavGraphBuilder.authGraph(navController: NavController) {

    navigation(startDestination = AppRoutes.LoginScreen.route, route = AppRoutes.Auth.route) {

        composable(AppRoutes.LoginScreen.route) {
            LoginScreen(onNavigate = { route ->
                when (route) {
                    AppRoutes.LoginScreen.route -> navController.navigate(AppRoutes.HomeScreen.route)
                    AppRoutes.ResetPinScreen.route -> navController.navigate(AppRoutes.ResetPinScreen.route)
                    AppRoutes.SignupScreen.route -> navController.navigate(AppRoutes.SignupScreen.route)
                }
            })
        }

        composable(AppRoutes.SignupScreen.route) {
            SignupScreen(onNavigate = {
                navController.navigate(AppRoutes.LoginScreen.route)
            })
        }

        composable(AppRoutes.ResetPinScreen.route) {
            ResetPinScreen(onNavigate = {
                navController.navigate(AppRoutes.LoginScreen.route)
            })
        }
    }
}