import kotlin.math.sqrt
fun main() {
    var b: Float = 4.0f //base of a right-angled triangle is 4 cm
    var a: Float = 3.0f //opposite of a right-angled triangle is 3cm
    println("A right-angled triangle with;")
    println("based = 4 cm")
    println("opposite = 3 cm")

    b *= b
    a *= a
    val c: Float = sqrt((a + b))
    println("The hypotunese is $c cm")
}
