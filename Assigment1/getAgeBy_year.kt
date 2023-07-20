fun main() {
    val currentYear = 2023

    println("\tAge Calculator")
    println("\t**************")
    println("It is 2023!")
    print("Enter your Year of birth: ")

    /* Getting input */
    val input = readLine()

    /*separating the input string into words and the picking the first one*/
    val input0 = input?.trim()?.split(Regex("\\s+"))?.get(0)

    /*Handling output*/
    if (input0 != null) {
        val yob = input0.toInt()
        val age: Int = currentYear - yob
        if (yob < currentYear)
            println("You are $age years old")
        else if (yob == currentYear) {
            println("You are less than a year old")
        }
        else {
            println("Invalid input!")
        }
    }
    else {
        println("No value entered!!")
    }
    println("******************************************")
}

