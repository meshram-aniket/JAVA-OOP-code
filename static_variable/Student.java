package static_variable;

public class Student {
    String name;
    int rollNo;
    String college = "Xavier Institute of Engineering";

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("name is: "+name+ ", roll no is: "+rollNo+ ", college name: "+college);
    }
}
