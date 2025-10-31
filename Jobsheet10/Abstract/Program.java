package Jobsheet10.Abstract;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat(3);
        Fish fish = new Fish(1);

        People person = new People("Izuu");
        person.walkPet(cat);
        person.walkPet(fish);

        cat.grow();
        fish.grow();
    }
}

// Is it allowed if a subclass that extends an abstract class does not implement the abstract method in its parent class?, -> No, it is not allowed. If a subclass of an abstract class does not implement the abstract method, then the subclass itself must be declared abstract.
// 1. Explain the program above. -> This program demonstrates the concept of abstraction in Object-Oriented Programming (OOP). The Animal class is an abstract class that defines general characteristics for all animals. The Cat and Fish classes are subclasses that specify their own way of moving. The People class represents a user who can command an animal to move. This shows polymorphism, where the same method (moving()) behaves differently depending on the object type.
// 2. What happens if the moving() method is changed to a non-abstract method? -> If the moving() method has a body (not abstract), subclasses are not required to override it. However, if they still override it, the code will run normally. The parent class Animal can also provide a default implementation of movement behavior.
// 3. What happens if there is no overriding of the moving() method? -> If Cat or Fish does not override the moving() method, a compilation error will occur because every concrete subclass of an abstract class must implement all abstract methods.
// 4. What happens if the abstract method moving() is declared in the Fish class? -> It is not allowed, because Fish is not declared as an abstract class.