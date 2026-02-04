package LEC11_Encapsulation.Modifier;

public class AccessModifier2 extends AccessModifier1 {

    @Override
    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
