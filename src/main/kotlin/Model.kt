package mastermind

class Model {
    private var colors: Array<Colors> = emptyArray()

    init {
        newGame()
    }

    private fun newGame() {
        this.colors = Array(6) { Colors.randomColor() }
    }

    fun checkColors(guess: Array<Colors>): String {
        var correct = 0
        var correctColors = 0
        for ((index, color) in guess.withIndex()) {
            if (this.colors[index] == color) {
                correct++
            }
            if (color in this.colors) {
                correctColors++
            }
        }
        return "you have $correct pieces right and $correctColors correct colors"
    }

    fun getColors(): Array<Colors> {
        return colors
    }
}