package Abstraction;

public class Main {
    public static void main(String[] args) {
        Car c = new Car(4);
        c.start();

        Vehicle v = new Scooty(2);
        v.start();

        Scooty s = new Scooty(2);
        s.start();
    }
}
