fun condition()
{
    val speed = 20 // 20 k/h
    var time: Int
    var dist: Int
    var loop = true

    var route = readlnOrNull()
    while (loop) {
        if (route == "1") {
            dist = 5000   // 5000 km
            time = dist / speed
            println("You will take $time hours while using route one at 20 km/h speed")
            println("Choose another route or enter five 5 to exit: ")
            route = readlnOrNull()
        } else if (route == "2") {
            dist = 25000 // 25000 km
            time = dist / speed
            println("You will take $time hours while using route two at 20 km/h speed")
            println("Choose another route or enter five 5 to exit: ")
            route = readlnOrNull()
        }
        else if (route == "3") {
            dist = 50000 // 50000 km
            time = dist / speed
            println("You will take $time hours while using route three at 20 km/h speed")
            println("Choose another route or enter five 5 to exit: ")
            route = readlnOrNull()
        }
        else if (route == "4") {
            dist = 10000 // 25000 km
            time = dist / speed
            println("You will take $time hours while using route four at 20 km/h speed")
            println("Choose another route or enter five 5 to exit: ")
            route = readlnOrNull()
        }
        else if (route == "5") {
            loop = false
            println("Thank you for coming around")
            println("Enjoy your journey")
        } else {
            println("Invalid input!")
            println("Choose another route using a number or enter five 5 to exit: ")
            route = readlnOrNull()
        }
    }
}

fun main()
{
    println("Get to know the time for your journey")
    println("Choose your route using numbers")
    println("\t1. Route one")
    println("\t2. Route two")
    println("\t3. Route three")
    println("\t4. Route four")
    println("\t5. Exit")
    println("=======================================")
    println("Enter the number of you route:")

    condition()

}
