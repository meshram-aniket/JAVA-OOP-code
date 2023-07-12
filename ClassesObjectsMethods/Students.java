package ClassesObjectsMethods;

public class Students {
    int marks;
    String name;
    public void studentInfo(int m, String n){
        marks = m;
        name = n;
    }

    public void display(){
        System.out.println(marks+" "+ name);
    }

    public static void main(String[] args){
        Students s1 = new Students();
        s1.studentInfo(95, "aniket");
        Students s2 = new Students();
        s2.studentInfo(98, "tanmay");
        s1.display();
        s2.display();
    }
}
