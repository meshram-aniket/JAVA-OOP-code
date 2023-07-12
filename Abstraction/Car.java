package Abstraction;

public class Car extends Vehicle {
    Car(int i){
        this.no_of_tyre = i;
        System.out.println(no_of_tyre);
    }
    void start(){
        System.out.println("car start with key");
    }
}
