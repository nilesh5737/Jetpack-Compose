package com.example.jetpackcomposecourse.`24_BottomNavigationBar`

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

data class BottomNavItems(
    val name: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)

@Composable
fun BottomNavigationBarSample() {

    var selectedItemIndex by remember { mutableIntStateOf(0) }

    val bottomNavItems = listOf(
        BottomNavItems("Home", Icons.Filled.Home, Icons.Outlined.Home),
        BottomNavItems("WishList", Icons.Filled.Favorite, Icons.Outlined.FavoriteBorder),
        BottomNavItems("Cart", Icons.Filled.ShoppingCart, Icons.Outlined.ShoppingCart),
        BottomNavItems("Profile", Icons.Filled.Person, Icons.Outlined.Person)
    )

    Scaffold(
        bottomBar = {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = WindowInsets.navigationBars
                            .asPaddingValues()
                            .calculateBottomPadding()
                    )
            ) {
                BottomAppBar {
                    NavigationBar {
                        bottomNavItems.forEachIndexed { index, item ->
                            NavigationBarItem(
                                selected = selectedItemIndex == index,
                                onClick = { selectedItemIndex = index },
                                icon = {
                                    Icon(
                                        imageVector = if (selectedItemIndex == index)
                                            item.selectedIcon else item.unselectedIcon,
                                        contentDescription = item.name
                                    )
                                },
                                label = { Text(text = item.name) }
                            )
                        }
                    }
                }
            }
        }
    ) { paddingValues ->
        // Screen Content Area
        Text(
            text = "Current Screen → ${bottomNavItems[selectedItemIndex].name}",
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun showBottomNavBar(){
    BottomNavigationBarSample()
}
