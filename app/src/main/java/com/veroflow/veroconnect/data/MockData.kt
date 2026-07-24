package com.veroflow.veroconnect.data

data class Post(
    val id: Int,
    val username: String,
    val content: String,
    val imageUrl: String? = null, // mock urls or local
    val likes: Int,
    val comments: Int
)

object MockData {
    val posts = listOf(
        Post(1, "user1", "Beautiful day!", null, 42, 5),
        Post(2, "user2", "Check this out", "mock_image", 120, 23),
        // Add more for 100+ but for demo, several
    )

    // Similarly for users, chats, etc.
}
