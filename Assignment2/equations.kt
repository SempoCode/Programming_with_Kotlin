import kotlin.math.sqrt
fun quadraticEqn(a:Double, b:Double, c:Double)
{

    val z: Double = (b * b) - (4 * a * c)
    if (z >= 0) {
        val x1 = ((-1 * b) + sqrt(z)) / (2 * a)
        val x2 = ((-1 * b) - sqrt(z)) / (2 * a)
        println("The two roots are:")
        println("x1 = $x1 \nx2 = $x2")
    }
    else
    {
        val real = (-1 * b)
        val img1 = (sqrt((-1 * z))) / (2 * a)
        val img2 = -1 * (sqrt((-1 * z))) / (2 * a)

        //x1 = real + img1j,  x2 = real + img2
        println("The two roots are imaginary;")
        println("x1 = $real + j$img1 and x2 = $real + j$img2")
    }

}
fun main()
{
    // solving x^2 + 10x + 25
    println("Given x^2 + 10x + 25")
    quadraticEqn(1.0, 10.0, 25.0)

println("\n======================================")
    //solving x^3 + 7x^2 + 10x = 0
    //on factorizing; x(x^2 + 7x + 10) = 0
    //we have x = 0 and (x^2 + 7x + 10) = 0
    // solve for (x^2 + 7x + 10) = 0
    println("Given x^3 + 7x^2 + 10x = 0")
    println("The first root is:\nx0 = 0")
    quadraticEqn(1.0, 7.0, 10.0)
}
