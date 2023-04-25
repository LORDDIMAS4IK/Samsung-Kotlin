enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

class Robot(var x: Int, var y: Int, var direction: Direction) {

    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.RIGHT -> Direction.DOWN
            Direction.DOWN -> Direction.LEFT
            Direction.LEFT -> Direction.UP
        }
    }

    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.LEFT -> Direction.DOWN
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
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
    // Реализовать движение робота в точку через методы turnLeft(), turnRight(), stepForward()
    if (r.x < toX && toX >= 0) {
        while (r.x != toX) {
            r.x++
        }
    }
    if (r.x > toX && toX >= 0) {
        while (r.x != toX) {
            r.x--
        }
    }
    if ((r.x > toX) && (toX <= 0)) {
        while (r.x != toX) {
            r.x--
        }
    }
    if ((r.x < toX) && (toX <= 0)) {
        while (r.x != toX) {
            r.x++
        }
    }
    if (r.y < toY && toY >= 0) {
        while (r.y != toY) {
            r.y++
        }
    }
    if (r.y > toY && toY >= 0) {
        while (r.y != toY) {
            r.y--
        }
    }
    if ((r.y > toY) && (toY <= 0)) {
        while (r.y != toY) {
            r.y--
        }
    }
    if ((r.y < toY) && (toY <= 0)) {
        while (r.y != toY) {
            r.y++
        }
    }
}

    fun main() {

        val r = Robot(0,1,Direction.UP)
        r.turnRight()
        r.stepForward()
        r.stepForward()
        r.stepForward()
        r.turnRight()
        r.stepForward()
        r.stepForward()
        r.turnLeft()
        println(r)

        moveRobot(r, 3, 7)
        println("${r.x} ${r.y}")
    }
