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
fun LoginScreen(onNavigate: (route: String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login Screen",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = { onNavigate(AppRoutes.LoginScreen.route) }
        ) {
            Text("Login")
        }

        Button(
            onClick = { onNavigate(AppRoutes.ResetPinScreen.route) }
        ) {
            Text("Reset pin")
        }

        Button(
            onClick = { onNavigate(AppRoutes.SignupScreen.route) }
        ) {
            Text("SignUp")
        }
    }
}

@Composable
fun SignupScreen(onNavigate: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sign up Screen",
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

@Composable
fun ResetPinScreen(onNavigate: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Reset Pin Screen",
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


