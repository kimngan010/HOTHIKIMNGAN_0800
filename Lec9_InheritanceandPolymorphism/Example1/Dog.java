
package Lec9_InheritanceandPolymorphism.Example1;

public class Dog {
    String dogID = "dog";
    String source = "VietNam";
    void makeSound(){
        System.out.println("make a sound");
    }
    void guardHouse(){
        System.out.println("guard the house");
    }
    public static void main (String [] args ){
        Dog dog = new Dog();
        System.out.println("ID" + dog.dogID);
        System.out.println("SOurce: "+dog.source);
        dog.makeSound();
        dog.guardHouse();
    }
}
