package ClassesObjectsMethods;

public class Animal {   //class
    public void eat(){   //method
        System.out.println("dog is eating");
    }


    public static void main(String[] args){
        Animal dog = new Animal();  //object
        dog.eat();
        //dog.fly();   // we can't call method of bird class through dog object
    }
}
class Birds {
    public void fly(){
        System.out.println("sparrow is flying");
    }
}





// we can initialize object in 3 different ways

//1. using reference variable
//2. using method
//3. using constructor


