package ConstructorTypes;

public class Student {
    String name;
    int roll_no;

    private void display () {
        this.name = "aniket";
        this.roll_no = 23;
        System.out.println(name+" "+roll_no);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

    }
}


