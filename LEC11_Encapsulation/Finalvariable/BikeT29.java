
package LEC11_Encapsulation.Finalvariable;

public class BikeT29 {
    final int speedlimit = 90;
    void run(){
        speedlimit = 400;
    }
    public static void main (String args[]){
        Bike obj = new Bike();
        obj.run();
    }
}
