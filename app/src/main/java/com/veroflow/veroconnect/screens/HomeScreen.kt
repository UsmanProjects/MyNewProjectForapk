package com.veroflow.veroconnect.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.veroflow.veroconnect.data.MockData

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Home Feed") }) },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* navigate to create post */ }) {
                Text("+")
            }
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            items(MockData.posts) { post ->
                Card(modifier = Modifier.padding(8.dp)) {
                    Column {
                        Text(post.username)
                        Text(post.content)
                        Text("Likes: ${post.likes}")
                        // Buttons for like, comment etc.
                    }
                }
            }
        }
    }
}
