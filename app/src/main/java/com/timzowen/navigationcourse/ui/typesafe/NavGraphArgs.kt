package com.timzowen.navigationcourse.ui.typesafe

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Composable
fun AppNavArgsTypeSafe(modifier: Modifier = Modifier) {

    val navController = rememberNavController()

    NavHost(navController, startDestination = Home) {

        composable<Home> {
            HomeScreen(
                onNavigate = { name, score ->
                    navController.navigate(Profile(name, score))
                }
            )
        }

        composable<Profile> {
            val args = it.toRoute<Profile>()
            ProfileScreen(
                name = args.name,
                score = args.score
            )
        }
    }
}


@Serializable
data object Home

@Serializable
data class Profile(val name: String, val score: String)

