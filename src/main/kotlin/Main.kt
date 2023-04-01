package mastermind

import java.util.*

fun main() {
    val model = Model()
    println("Welcome to Mastermind!")
    println("I've picked a secret code of 6 colors.")
    println("Each color can be red, blue, green, orange, yellow, or grey.")
    println("You have 10 tries to guess the code.")
    println("After each guess, I'll tell you how many pieces are correct and how many colors are correct but in the wrong position.")
    println("Good luck!")
    var guesses = 0
    while (guesses < 10) {
        print("Enter your guess (e.g. red blue green yellow orange grey): ")
        val input = readLine()?.split(" ")?.mapNotNull { Colors.getColor(it.uppercase(Locale.getDefault())) }
            ?.toTypedArray() ?: emptyArray()
        if (input.size == 6) {
            val result = model.checkColors(input)
            println(result)
            if (result.startsWith("You have 6 pieces right")) {
                println("Congratulations, you won!")
                return
            }
        } else {
            println("Invalid guess. Please enter exactly 6 colors separated by spaces.")
        }
        guesses++
    }
    println("Sorry, you lost. The correct code was: ${model.getColors().joinToString(" ")}")
}
