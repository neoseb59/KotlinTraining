package meta_Introduction_to_Kotlin

//Add your function below this line
fun getPoints (basePoint: Int, boost: Int): Int {
    return basePoint * boost
}

fun main() {
    var score = 0
    println(score)
        score += getPoints(10, 1)
    println(score)
        score += getPoints(20, 2)
    println(score)
        score += getPoints(-10, 1)
    println(score)
        score += getPoints(5, 3)
    println(score)
        score += getPoints(-15, 2)
}