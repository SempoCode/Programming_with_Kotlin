class House {
	var location:String = ""
	var type:String = ""

	fun printLocation() {
		println("The location is $location")
	}

	fun printType() {
		println("The tpye is $type")
	}

}

//class with a primary constructor which is inaccessible inside
class Car(horsePower:Int) {
	val t = horsePower

	fun getPower() {
		println("The horse power is $t"
	}
}

//class with a primary constructor which is accessible inside
class Food(var type:String) {
	
	fun getFoodType() {
		println(type)
	}
}

class Book {
	var t:String = ""

	//Secondary constructor
	constructor(title:String, author:String) {
		this.t = title
	}

	fun createBook() {
		println("Title is $t")
	}
}

fun main()
{
	//Creating object of the house
	var a = House
	
	//Accessing and assigning the attributes of the house
	a.location = "Ndeeba"
	a.type = "Flat"
	
	//Calling the methods in the house
	a.printLocation()
	a.printFlat()

	//Creating cer object
	val car1 = Car(90)

	//Calling the behavior of the car
	car1.getPower()

	//Food object
	val h = Food
	h.getFoodType("Matooke")

	//Book object
	val bk = Book("MTC", "Calculous")
	bk.createBook()
}
