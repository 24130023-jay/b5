// Base class (Parent class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
// Derived class (Child class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Create object of the derived class
        Dog myDog = new Dog();
        
        // Call method from base class
        myDog.eat();   // Inherited from Animal
        
        // Call method from derived class
        myDog.bark();  // Defined in Dog
    }
}
