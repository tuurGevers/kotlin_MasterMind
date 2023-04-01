package mastermind

import java.util.*
import kotlin.random.Random


enum class Colors {
    RED,
    BLUE,
    GREEN,
    ORANGE,
    YELLOW,
    GREY;


    companion object {

        fun getColor(s: String): Colors? {
            return when (s.lowercase(Locale.getDefault())) {
                "red", "r" -> RED
                "blue", "b" -> BLUE
                "green", "g" -> GREEN
                "orange", "o" -> ORANGE
                "yellow", "y" -> YELLOW
                "grey", "gr" -> GREY
                else -> null
            }
        }


        fun randomColor(): Colors {
            return when (Random.nextInt(0, 6)) {
                0 -> RED
                1 -> BLUE
                2 -> GREEN
                3 -> ORANGE
                4 -> YELLOW
                else -> GREY
            }
        }

    }
}