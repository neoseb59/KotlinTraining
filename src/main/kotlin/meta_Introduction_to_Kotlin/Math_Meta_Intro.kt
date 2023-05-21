package meta_Introduction_to_Kotlin//Exercise: Practice using math operators in Kotlin

fun main () {
    //Task 1: Perform operations on numbers
    //Step 1: Create and print math operations
    println(123 + 456 * 789)
    //Step 2: Perform a longer calculation
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    //Step 3: Perform a calculation with parentheses
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    //Step 4: Perform a division calculation
    println(13530.0 / 1.23)

    //Task 2: Perform math operations on variables
    //Step 1: Create variables and assign values
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86
    //Step 2: Create and print the total and average scores
    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3
    println(totalScore)
    println(averageScore)

    //Task 3: Perform more operations on variables
    //Step 1: Create variables and assign values
    val boostMultiplier= 4
    val scoreBoost= totalScore * boostMultiplier
    val finalBoostedScore = totalScore+scoreBoost
    //Step 2: Create and print math operations
    println(scoreBoost)
    println(finalBoostedScore)
}