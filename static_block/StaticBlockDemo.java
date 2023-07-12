package static_block;

public class StaticBlockDemo {
    static int a;
    StaticBlockDemo() {
        System.out.println("i am in constructor");
    }

    public void display() {
        System.out.println("i am in method");
    }


    //we can create multiple static block and the execution of program is from top to buttom
    static {
        a = 10;
        System.out.println("i am in static block");
        System.out.println(a);
    }

    static {
        System.out.println("i am in static block 3");
    }

    static {
        System.out.println("i am in static block 2");
    }

    public static void main(String[] args) {
        StaticBlockDemo s = new StaticBlockDemo();
        s.display();
//        System.out.println(StaticBlockDemo.a);

    }
}