interface Movable {
    fun move(dx: Int, dy: Int)
    //(метод move(dx, dy) добавляет dx к координате x, а dy к координате y).
}

internal class Point(var x: Int, var y: Int) : Movable {
    //Point (точка с координатами x, y) и
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }
}

internal class CloudOfPoints(val points: ArrayList<Point>) : Movable {
    // CloudOfPoints (набор точек Point)

    override fun move(dx: Int, dy: Int) {
        points[0].x+=dx
        points[0].y+=dy
    }
}

fun main() {
    val p = Point(1, 1)
    val cloud = CloudOfPoints(arrayListOf(Point(1, 1)))
    p.move(1, 1);
    cloud.move(2, 2)
    val p2 = cloud.points[0]
    println("${p.x} ${p.y}")
    println("${p2.x} ${p2.y}")
    println()
}