package UsesOfThisKeyword;

//there are six uses of "this" keyword
// 1. "this" keyword can be used to reference current class instance variable
// 2. "this" keyword can be used to invoke current class method
// 3. "this()" keyword can be used to invoke current class constructor
// 4. "this:" keyword can be used to pass as an argument in the method call
// 5. "this" keyword can be used to pass as an argument in the constructor call
// 6. "this" keyword can be used to return the current class instance from the method

public class Student {
//    String name;
//    int rollNo;
//    int marks;
    Main cgpa;
//
//    void studentInfo(String name, int rollNo) {
//        this.name = name;
//        this.rollNo = rollNo;
//
//        // "this" keyword can be used to invoke current class method
//        this.display();
//    }
//    void display( ) {
//        System.out.println("name is:" +name+", roll No is:"+rollNo);
//    }
//
//
////"this()" keyword can be used to invoke current class constructor
//    Student() {
////        this(5);
//        System.out.println("i am in non parameterized constructor");
//
//    }
//
//    Student(int marks) {
//        this();
//        System.out.println("i m in parameterized constructor");
//
//    }
//
////    "this:" keyword can be used to call as an argument in the method call
//
//    void show(Student obj) {
//        System.out.println("i am in show method");
//    }
//
//    void show2() {
//        System.out.println("i am in show2 method");
//        show(this);
//    }


//    "this:" keyword can be used to call as an argument in the constructor call
    void show2() {
        ThisDemo t1 = new ThisDemo(this);
    }


////   this can be used to return current class instance form the method
//    Student show3(){
//        System.out.println("i am in show3 method");
//       return this;
//    }


}
