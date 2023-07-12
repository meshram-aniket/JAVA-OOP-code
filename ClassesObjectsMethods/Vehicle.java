package ClassesObjectsMethods;

public class Vehicle {
//        using reference variable

//        int wheel;
//        String color;
//        public static void main(String[] args){
//            Vehicle car = new Vehicle();
//            car.wheel = 4;
//            car.color = "black";
//            System.out.println("car wheel is "+car.wheel);
//            System.out.println("car color is "+car.color);
//        }


    //    using method
    int wheel;
    String color;
    public void carSpecfication(int w, String c){
        wheel = w;
        color = c;
    }

    public void display(){
        System.out.println(wheel+" "+color);
    }

    public static void main(String[] args){
        Vehicle car = new Vehicle();
        car.carSpecfication(4, "white");
        car.display();

    }
}




