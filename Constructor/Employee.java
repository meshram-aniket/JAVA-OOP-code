package Constructor;
// why we use constructor
public class Employee {
    String name;
    int empId;
//
//    public void display() {
//        System.out.println(name + " " + empId);
//    }
//
//    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        e1.name = "aniket";
//        e1.empId = 23;
//        Employee e2 = new Employee();
//        e2.name = "sanket";
//        e2.empId = 11;
//        e1.display();
//    }


// the above is wrong way thats why we use constructor

    public Employee(String n, int id) {
        name = n;
        empId = id;
        System.out.println(name+ " " +empId);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("aniket", 23);
        Employee e2 = new Employee("sanket", 11);
        new Employee("aniket", 23);
        new Employee("sanket", 11);
    }

}