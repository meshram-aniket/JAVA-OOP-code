package Polymorphism_Overriding;

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();

        Xyz x = new Xyz();
        x.show();

        Test t2 = new Xyz();
        t2.show();


//        cannot possible
//        Xyz z2 = new Test();  //Polymorphism_Overriding.Test cannot be converted to Polymorphism_Overriding.Xyz


    }
}
