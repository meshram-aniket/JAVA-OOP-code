package Practice;

import Uses_Of_Super.Demo2;

public class demo2 {
//    int i = 20;
//    void display(int i) {
//        System.out.println(i);
//        System.out.println(this.i);
//        System.out.println(super.a);
//        super.display();
//    }
//
//    demo2() {
//        super();   // call to super() must be first statement in constructor body
//        System.out.println("i am in demo2 constructor");
//    }



    demo2() {
        Demo g = new Demo(this);

    }

}
