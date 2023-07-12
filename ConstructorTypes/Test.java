package ConstructorTypes;

//types of constructors
public class Test {

//****************** default constructor *****************
//    int i;
//
//    public static void main(String[] args) {
//        Test t1 = new Test();
//        System.out.printlnd(e1.i);
//
//    }

//*****************No arg constructor*********************

//    int i = 2;
//    Test() {
//
//    }
//
//    public static void main(String[] args) {
//        Test t2= new Test();
//        System.out.println(t2.i);
//    }

//****************Parameterised Constructor***************

    Test(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Test t3 = new Test("aniket");
    }

}