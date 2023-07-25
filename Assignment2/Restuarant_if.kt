fun menu()
{
    println("\tWelcome to your Personal menu")
    println("~~~~~~~~~~~~~~~~~~~~00~~~~~~~~~~~~~~~~~~~~~")
    println("What do you like to eat?")
    println("Choose by  a number to get a place")
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    println("1. Pizza")
    println("2. Chicken")
    println("3. Pancakes")
    println("4. Cakes")
    println("5. Exit")
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
    println("\tEnter your choice: ")
}
fun option()
{
    var choice = readLine()
    var iterator = true

    while (iterator)
    {
        if (choice == "1" || choice == "Pizza" || choice == "Exit")
        {
            println("You can go to Pizzahut")
            println("Thank you. Make another choice or enter 5 to exit")
            choice = readLine()
        }
        else if (choice == "2" || choice == "chicken" || choice == "Chicken")
        {
            println("You can go to KFC")
            println("Thank you. Make another choice or enter 5 to exit")
            choice = readLine()
        }
        else if (choice == "3" || choice == "pancakes" || choice == "Pancakes")
        {
            println("You can go to Foodhub")
            println("Thank you. Make another choice or enter 5 to exit")
            choice = readLine()
        }
        else if (choice == "4" || choice == "cake" || choice == "Cake")
        {
            println("You can go to Cakely")
            println("Thank you. Make another choice or enter 5 to exit")
            choice = readLine()
        }
        else if (choice == "5" || choice == "exit" || choice == "Exit")
        {
            println("I hope I was helpful. Don't hesistate to come back.")
            iterator = false
        }
        else
        {
            println("Wrong choice!! Please enter Another:")
            choice = readLine()
        }
    }

}

fun main()
{
    menu()
    option()
}
