
package Lec9_InheritanceandPolymorphism.Super1;

public class Husky extends Dog {
    int price = 1500;
    void displayPrice(){
        System.out.println ("Dog's price: "+super.price);
        System.out.println("Husky's price:"+price);
    }
}
