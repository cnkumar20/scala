//create a class named Person with a name and age

//create a trait named PersonInterface with a method toString
trait PersonInterface {
  override def toString: String
  def ageByYear(years: Int): String 
}

class Person(val name: String, val age: Int) extends PersonInterface {
  override def toString: String = s"Person(name=$name, age=$age)"
  override def ageByYear(years: Int): String = {
    val newAge = age + years
    s"$name will be $newAge years old in $years years."
  }
}

trait AnimalInterface {
  def makeSound(): String
  def move(distance: Int): String
}
// Create a class that implements the interface
class Dog extends AnimalInterface {
  override def makeSound(): String = "Woof!"
  override def move(distance: Int): String = s"The dog runs $distance meters."
}
// Create another class that implements the interface
class Cat extends AnimalInterface {
  override def makeSound(): String = "Meow!"
  override def move(distance: Int): String = s"The cat jumps $distance meters."
} 

object Main extends App {
    val person = new Person("Alice", 30)

  // Print the person object using the overridden toString method
  println(person.toString)
  println(person.ageByYear(5)) // Example usage of ageByYear method


  // Create instances of Dog and Cat
  val dog = new Dog
  val cat = new Cat

  // Call methods on the Dog instance
  println(dog.makeSound()) // Output: Woof!
  println(dog.move(10))     // Output: The dog runs 10 meters.

  // Call methods on the Cat instance
  println(cat.makeSound()) // Output: Meow!
  println(cat.move(5))      // Output: The cat jumps 5 meters.
}


