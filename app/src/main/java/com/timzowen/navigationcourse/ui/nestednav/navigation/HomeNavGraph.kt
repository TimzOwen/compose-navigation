package com.timzowen.navigationcourse.ui.nestednav.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.timzowen.navigationcourse.ui.nestednav.screens.CheckoutScreen
import com.timzowen.navigationcourse.ui.nestednav.screens.HomeScreen
import com.timzowen.navigationcourse.ui.nestednav.screens.LogoutScreen
import com.timzowen.navigationcourse.ui.nestednav.screens.PaymentConfirmationScreen
import com.timzowen.navigationcourse.ui.nestednav.screens.ProfileScreen

fun NavGraphBuilder.homeNavGraph(navController: NavController) {

    navigation(startDestination = AppRoutes.HomeScreen.route, route = AppRoutes.Main.route) {

        composable(AppRoutes.HomeScreen.route) {
            HomeScreen(onNavigate = { route ->
                when (route) {
                    AppRoutes.CheckoutScreen.route -> navController.navigate(AppRoutes.CheckoutScreen.route)
                    AppRoutes.ProfileScreen.route -> navController.navigate(AppRoutes.ProfileScreen.route)
                    AppRoutes.LogoutScreen.route -> navController.navigate(AppRoutes.LogoutScreen.route)
                }
            })
        }

        composable(AppRoutes.CheckoutScreen.route) {
            CheckoutScreen(onNavigate = {
                navController.navigate(AppRoutes.ConfirmationScreen.route)
            })
        }

        composable(AppRoutes.ConfirmationScreen.route) {
            PaymentConfirmationScreen(onNavigate = {
                navController.navigate(AppRoutes.HomeScreen.route) {
                    popUpTo(AppRoutes.HomeScreen.route) {
                        inclusive = true
                    }
                }
            })
        }

        composable(AppRoutes.ProfileScreen.route) {
            ProfileScreen(onNavigate = {
                navController.navigate(AppRoutes.HomeScreen.route)
            })
        }

        composable(AppRoutes.LogoutScreen.route) {
            LogoutScreen(onNavigate = {
                navController.navigate(AppRoutes.LoginScreen.route)
            })
        }
    }

}