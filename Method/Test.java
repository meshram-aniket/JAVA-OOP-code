package Method;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public void test() {
        System.out.println("i am in method test");
    }

    protected void display() {
        System.out.println("i am in display method");
    }


    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();

    }
}
