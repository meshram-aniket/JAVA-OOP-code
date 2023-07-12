package Interface;

public class Main implements I1, I2 {
    public void show1(){
        System.out.println("i m in show method");
    }

    public void show3(){
        System.out.println("i m in show method 3");
    }

    public static void main(String args[]){
//        I1 a = new I1();   // I1 is abstract class cannot be instantiated
//        I2 b = new I2();   // I2 is abstract class cannot be instantiated
        Main m1 = new Main();
        m1.show1();
        m1.show2();
        m1.show3();
        m1.show4();
    }
}
