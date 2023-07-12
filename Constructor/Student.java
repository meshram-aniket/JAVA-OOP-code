package Constructor;
//syntax

public class Student {
    Student() {
        System.out.println("my name is aniket");
    }

    public static void main(String[] args) {
        // two ways to call constructor
        Student s1 = new Student();
        new Student();
    }
}
