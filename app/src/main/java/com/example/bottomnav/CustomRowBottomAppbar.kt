package com.example.bottomnav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * My custom made Bottom App bar made using a row and icon buttons
 */
@Composable
fun CustomRowBottomAppbar(modifier: Modifier = Modifier) {
    BottomAppBar {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}) {
                    Icon(
                        Icons.Outlined.Home,
                        contentDescription = "Home"
                    )
                }
                Text(text = "Edit")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}) {
                    Icon(
                        Icons.Outlined.ShoppingCart,
                        contentDescription = "ShoppingCart"
                    )
                }
                Text(text = "Check")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}) {
                    Icon(
                        Icons.Outlined.FavoriteBorder,
                        contentDescription = "Favorite"
                    )
                }
                Text(text = "Favorite")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}) {
                    Icon(
                        Icons.Outlined.Settings,
                        contentDescription = "Settings"
                    )
                }
                Text(text = "Settings")
            }
        }
    }
}