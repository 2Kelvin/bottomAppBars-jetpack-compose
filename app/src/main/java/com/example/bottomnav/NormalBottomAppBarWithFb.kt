package com.example.bottomnav

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Default Bottom Appbar with icons and a floating action button
 */
@Composable
fun NormalBottomAppBarWithFB(modifier: Modifier = Modifier) {
    BottomAppBar(
        actions = {
            IconButton(onClick = {}, modifier = Modifier.padding(horizontal = 12.dp)) {
                Icon(
                    Icons.Outlined.Home,
                    contentDescription = "Home"
                )
            }
            IconButton(onClick = {}, modifier = Modifier.padding(horizontal = 12.dp)) {
                Icon(
                    Icons.Outlined.ShoppingCart,
                    contentDescription = "ShoppingCart"
                )
            }
            IconButton(onClick = {}, modifier = Modifier.padding(horizontal = 12.dp)) {
                Icon(
                    Icons.Outlined.FavoriteBorder,
                    contentDescription = "Favorite"
                )
            }
            IconButton(onClick = {}, modifier = Modifier.padding(horizontal = 12.dp)) {
                Icon(
                    Icons.Outlined.Settings,
                    contentDescription = "Settings"
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation() // removing shadow elevation
            ) {
                Icon(
                    Icons.Outlined.Add,
                    contentDescription = "Add"
                )
            }
        },
        modifier = modifier
    )
}