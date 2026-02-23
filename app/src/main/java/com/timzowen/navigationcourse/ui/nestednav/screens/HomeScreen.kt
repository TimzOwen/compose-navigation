package com.timzowen.navigationcourse.ui.nestednav.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.navigationcourse.ui.nestednav.navigation.AppRoutes

@Composable
fun HomeScreen(onNavigate: (route: String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Home Screen",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = { onNavigate(AppRoutes.CheckoutScreen.route) }
        ) {
            Text("Checkout")
        }

        Button(
            onClick = { onNavigate(AppRoutes.ProfileScreen.route) }
        ) {
            Text("Profile")
        }

        Button(
            onClick = { onNavigate(AppRoutes.LogoutScreen.route) }
        ) {
            Text("Logout")
        }
    }
}

@Composable
fun ProfileScreen(onNavigate: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Profile Screen",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = onNavigate
        ) {
            Text("Home")
        }
    }
}

@Composable
fun CheckoutScreen(onNavigate: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Checkout Screen",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = onNavigate
        ) {
            Text("Confirm")
        }
    }
}


@Composable
fun PaymentConfirmationScreen(onNavigate: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Confirmation Screen",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = onNavigate
        ) {
            Text("Home")
        }
    }
}

@Composable
fun LogoutScreen(onNavigate: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Logout Screen",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = onNavigate
        ) {
            Text("Login")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(modifier: Modifier = Modifier) {
    HomeScreen(onNavigate = {})
}

