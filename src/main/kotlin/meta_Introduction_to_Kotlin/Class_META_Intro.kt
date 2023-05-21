package meta_Introduction_to_Kotlin
// full Player class and fullName function

class Player(private var name: String, private var surName: String) {
    var totalScore = 0
    var personalBestScore = 0
    fun fullName(): String {
        return "$name $surName"
    }
}


// full Scores class and checkBest function
class Scores {
    fun checkBest(best: Int, current: Int): Int {
        if (best < current) {
            return current
        }
        return best
    }
}


fun main() {

    // initialise Player objects

    val player1 = Player("Nicola", "Tesla")

    val player2 = Player("Thomas", " Edison ")

    // create working variables

    val scoring = Scores()  // instance of the Scores class to allow access to checkBest function

    // Level 1

    var lvlScore = 12  // variable to simulate Player level score // insert simulated values for level score

    player1.totalScore += lvlScore // use the combined operator (+=) to add the lvlScore to totalScore

    // supply the parameters for the checkBest function by accessing the Player properties

    player1.personalBestScore = scoring.checkBest(player1.personalBestScore, lvlScore)

    lvlScore = 34

    player2.totalScore += lvlScore

    player2.personalBestScore = scoring.checkBest(player2.personalBestScore, lvlScore)

    // Level 2

    lvlScore = 56 // insert simulated values for level score

    player1.totalScore += lvlScore // use the combined operator (+=) to add the lvlScore to totalScore

    // supply the parameters for the checkBest function by accessing the Player properties

    player1.personalBestScore = scoring.checkBest(player1.personalBestScore, lvlScore)

    lvlScore = 78 // insert simulated values for level score

    player2.totalScore += lvlScore

    player2.personalBestScore = scoring.checkBest(player2.personalBestScore, lvlScore)

    // Level 3

    lvlScore = 99 // insert simulated values for level score

    player1.totalScore += lvlScore // use the combined operator (+=) to add the lvlScore to totalScore

    // supply the parameters for the checkBest function by accessing the Player properties

    player1.personalBestScore = scoring.checkBest(player1.personalBestScore, lvlScore)
    lvlScore = 10
    player2.totalScore += lvlScore
    player2.personalBestScore = scoring.checkBest(player2.personalBestScore, lvlScore)

    // conditional check using an if statement to determine the winner
    if (player1.totalScore > player2.totalScore) {
        // access the Player properties to construct the String to print
        println("The winner is " + player1.fullName() + " with a Score of  " + player1.totalScore)
        println("Personal Best Score is = " + player1.personalBestScore)
    } else {
        println("The winner is " + player2.fullName() + " with a Score of " + player2.totalScore)
        println("Personal Best Score is = " + player2.personalBestScore)
    }
}