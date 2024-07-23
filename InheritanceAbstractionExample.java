package assess;

//Abstract class representing a generic Animal
abstract class Animal {
  String name;

 // Constructor
 public Animal(String name) {
     this.name = name;
 }

 // Abstract method (must be implemented by subclasses)
 public abstract void makeSound();

 // Concrete method
 public void sleep() {
     System.out.println(name + " is sleeping.");
 }
}

//Dog class inheriting from Animal
class Dog extends Animal {
 // Constructor
 public Dog(String name) {
     super(name);
 }

 // Implementing the abstract method
 @Override
 public void makeSound() {
     System.out.println(name + " says: bow bow!");
 }
}

//Cat class inheriting from Animal
class Cat extends Animal {
 // Constructor
 public Cat(String name) {
     super(name);
 }

 // Implementing the abstract method
 @Override
 public void makeSound() {
     System.out.println(name + " says: Meow Meow!");
 }
}

//Main class to demonstrate Inheritance and Abstraction
public class InheritanceAbstractionExample {
 public static void main(String[] args) {
     // Creating instances of Dog and Cat
     Animal myDog = new Dog("Buddy");
     Animal myCat = new Cat("Whiskers");

     // Calling methods on Dog instance
     myDog.makeSound();
     myDog.sleep();

     // Calling methods on Cat instance
     myCat.makeSound();
     myCat.sleep();
 }
}
