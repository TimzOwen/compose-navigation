package com.timzowen.navigationcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.timzowen.navigationcourse.ui.theme.NavigationCourseTheme
import com.timzowen.navigationcourse.ui.typesafe.AppNavArgsTypeSafe

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationCourseTheme {
//                MainNavGraph()
//                AppNavArgs()
//                MainAppNav()
                AppNavArgsTypeSafe()
            }
        }
    }
}

