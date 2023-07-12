package ConstructorTypes;

public class Car {
    String name;
    String color;
    Car() {
        System.out.println("this is no arg constructor");
    }
    Car(String name, String color) {
        System.out.println("this is parameterised constructor");
    }
    public static void main(String[] args) {
        Car honda = new Car();
        Car mahindra = new Car("xuv", "black" );
        System.out.println("this is default constructor:" +honda.name+" "+honda.color);

    }
}
