package com.timzowen.navigationcourse.ui.typesafe

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(name: String?, score: String?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Profile Sceen", fontSize = 30.sp)

        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "Name: $name", fontSize = 20.sp)
        Text(text = "Score: $score", fontSize = 20.sp)
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(modifier: Modifier = Modifier) {
    ProfileScreen(
        "Timz",
        "400"
    )
}