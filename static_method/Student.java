package static_method;

public class Student {
    String name;
    int rollNo;
    static String college = "VJTI";

    static void changeCollege() {
        college = "XIE";
    }

    Student (String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    void display(){
        System.out.println(name+ " ," +rollNo+ " ," +college);
    }


    public static void main(String[] args) {
        Student s1 = new Student("aniket", 33);
        s1.display();
    }
}
