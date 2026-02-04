
package Lec9_InheritanceandPolymorphism.DogExample;

public class Cat extends Animal {
    @Override 
    void makeSound(){
        System.out.println("Meo meo");
    }
}
