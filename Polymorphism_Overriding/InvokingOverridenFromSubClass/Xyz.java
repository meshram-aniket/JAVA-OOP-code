package Polymorphism_Overriding.InvokingOverridenFromSubClass;

public class Xyz extends Test {
    void show() {
        super.show();         // super is used to call parent class method
        System.out.println("2");
    }
}
