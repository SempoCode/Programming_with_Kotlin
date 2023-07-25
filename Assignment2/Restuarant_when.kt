fun menu1()
{
    println("\tWelcome to your Personal menu")
    println("~~~~~~~~~~~~~~~~~~~~00~~~~~~~~~~~~~~~~~~~~~")
    println("What do you like to eat?")
    println("Choose using  a number to get a place")
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    println("1. Pizza")
    println("2. Chicken")
    println("3. Pancakes")
    println("4. Cakes")
    println("5. Exit")
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
    println("\tEnter your choice: ")
}
fun option1()
{
    var choice = readLine()
    var iterator = true

    while (iterator) {
        when (choice) {
            "1" -> {
                println("You can go to Pizzahut")
                println("Thank you. Make another choice or enter 5 to exit")
                choice = readLine()
            }

            "2" -> {
                println("You can go to KFC")
                println("Thank you. Make another choice or enter 5 to exit")
                choice = readLine()
            }

            "3" -> {
                println("You can go to Foodhub")
                println("Thank you. Make another choice or enter 5 to exit")
                choice = readLine()
            }

            "4" -> {
                println("You can go to Cakely")
                println("Thank you. Make another choice or enter 5 to exit")
                choice = readLine()
            }

            "5" -> {
                println("I hope I was helpful. Don't hesistate to come back.")
                iterator = false
            }

            else -> {
                println("Wrong choice!! Please enter Another:")
                choice = readLine()
            }
        }
    }
}

fun main()
{
    menu1()
    option1()
}
