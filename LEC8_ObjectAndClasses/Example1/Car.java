package LEC8_ObjectAndClasses.Example1;

public class Car {
//    public static void main (String [] args){
//    Car myCar = new Car("Lambogini", 2020);
//    myCar.displayDetails

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;

    }

    public void displayDetails() {
        System.out.println("Car Model: " + model + ",Year:" + year);
    }
}
