package static_variable;

public class demo1 {
    static int a = 10;

    demo1() {
        System.out.println(a);
    }

    void show() {
        System.out.println(demo1.a);
    }

    public static void main(String[] args) {
        demo2 d2 = new demo2();
//        d2.display();
        demo1 d1 = new demo1();
//        d1.show();

    }
}
