package SingleInheritance;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.showA();
//        obj1.showB();

        System.out.println(" ");
        B obj2 = new B();
        obj2.showA();
        obj2.showB();

    }
}
