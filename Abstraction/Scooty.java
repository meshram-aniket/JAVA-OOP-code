package Abstraction;

public class Scooty extends Vehicle {
    Scooty(int j) {
        this.no_of_tyre = j;
        System.out.println(no_of_tyre);
    }
    void start(){
        System.out.println("scooty start with kick");
    }

}
