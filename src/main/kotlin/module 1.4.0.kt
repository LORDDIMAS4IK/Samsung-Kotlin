enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

class Robot(var x: Int, var y: Int, var direction: Direction) {

    fun turnRight() {
        when (direction) {
            Direction.UP -> direction = Direction.RIGHT
            Direction.RIGHT -> direction = Direction.DOWN
            Direction.DOWN -> direction = Direction.LEFT
            Direction.LEFT -> direction = Direction.UP
        }
    }

    fun turnLeft() {
        when (direction) {
            Direction.UP -> direction = Direction.LEFT
            Direction.LEFT -> direction = Direction.DOWN
            Direction.DOWN -> direction = Direction.RIGHT
            Direction.RIGHT -> direction = Direction.UP
        }
    }

    fun stepForward() {
        when (direction) {
            Direction.UP -> y++
            Direction.LEFT -> x--
            Direction.DOWN -> y--
            Direction.RIGHT -> x++
        }
    }

    override fun toString(): String {

        return "x: $x, y: $y, dir: $direction"
    }
}

fun moveRobot(r: Robot, toX: Int, toY: Int) {
    //TODO Реализовать движение робота в точку через методы turnLeft(), turnRight(), stepForward()

}


fun main() {
    val r = Robot(0, 1, Direction.UP)
    moveRobot(r, 3, 7)
    println("${r.x} ${r.y}")
}