package com.example.bottomnav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottomnav.ui.theme.BottomNavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BottomNavTheme {
                ScaffoldWithCustomBottomAppBar()
            }
        }
    }
}

/**
 * Scaffold with a custom bottom appbar
 */
@Composable
fun ScaffoldWithCustomBottomAppBar(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = { CustomRowBottomAppbar() },
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        ) {
            Greeting(name = "Bottom Appbars")
        }
    }
}

/**
 * Scaffold with the normal bottom appbar with a floating action button
 */
@Composable
fun ScaffoldWithNormalBottomAppBarWithFB(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = { NormalBottomAppBarWithFB() },
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        ) {
            Greeting(name = "Bottom Appbars")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Practicing $name!",
        modifier = modifier
    )
}

/**
 * Previews
 */
@Preview(showBackground = true)
@Composable
fun ScaffoldWithCustomBottomAppBarPreview() {
    BottomNavTheme {
        ScaffoldWithCustomBottomAppBar()
    }
}

@Preview(showBackground = true)
@Composable
fun ScaffoldWithNormalBottomAppBarWithFBPreview() {
    BottomNavTheme {
        ScaffoldWithNormalBottomAppBarWithFB()
    }
}