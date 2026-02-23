package com.timzowen.navigationcourse.ui.nestednav.navigation

import com.timzowen.navigationcourse.ui.navargs.Route

sealed class AppRoutes(val route: String) {
    data object HomeScreen : AppRoutes("home")
    data object CheckoutScreen : AppRoutes("checkout")
    data object ProfileScreen : AppRoutes("profile")
    data object ConfirmationScreen : AppRoutes("confirmation")
    data object LoginScreen : AppRoutes("login")
    data object SignupScreen : AppRoutes("sign_up")
    data object ResetPinScreen : AppRoutes("reset_pin")
    data object LogoutScreen : AppRoutes("Logout")

    data object Auth : AppRoutes("auth")

    data object Main : AppRoutes("main")
}