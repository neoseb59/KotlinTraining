package meta_Introduction_to_Kotlin

// Step 1: Prepare to store a comment and an author

class Comment(
    val userId: Int,
    val message: String
)

fun main() {
    // Step 2: Store all the comments
    val comments = listOf<Comment>(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What’s going on?"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone, :)"),
    )

    // Step 3: Create a set of blocked user ids
    val blockedUserIds = setOf<Int>(5224, 9001)

    // Step 4: Create a map of user relationships
    val userIdToRelation = mapOf<Int, String>(
        5241 to "Friend",
        6624 to "Work Colleague"
    )

    // Step 5: Filter and display comments
    for (comment in comments) {
        if (comment.userId !in blockedUserIds) {
            // Step 6: Find the relationships
            if (comment.userId in userIdToRelation) {
                println("Comment: ${comment.message} from ${userIdToRelation[comment.userId]}")
            } else {
                println("Comment: ${comment.message} from unknown")
            }
        }
    }
}