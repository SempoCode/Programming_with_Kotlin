fun main() {
    val num1 = 4  //tha value can not be changed
    var num2 = 3 //the value can be changed
    var sum = num1 + num2
    println("This is my first program in Kotlin")
    println("The sum of $num1 and $num2 is $sum")

    num2 = 8
    sum = num1 + num2
    println("The sum of $num1 and $num2 is $sum")

    //Using Data types
    val x:Int = 12  //4 bytes
    val y:Long =13  //8 bytes.....
    val z = x + y
    println("The sum of $x and $y is $z")

    val flo4:Float = .3f //8 bytes
    val do4:Double = 0.3 //16 bytes
    println(flo4)
    println(do4)

    val c:Char = 'A'
    val s:String = " string"
    print(c)
    println(s)

    val b:Boolean = true
    print(b)


}
