package Uses_Of_Super;

public class Demo2 extends Demo{
    // instance variable
    int i = 20;

    void show(int i) {      // local variable or parameter
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }


    // method
    void Display() {
        System.out.println("i m in class Demo2");
        super.show();
    }
    // constructor
    Demo2() {
        super();    // Note: super() must be first statement in constructor body
        System.out.println("My name is Demo2");
    }
}
