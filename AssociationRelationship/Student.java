package AssociationRelationship;

public class Student {

    int id_no;
    void id(int id) {
        this.id_no = id;
    }

    void display() {
        System.out.println("student id is "+ id_no);
    }
    void pass() {
        System.out.println("student is pass");
    }

    void fail() {
        System.out.println("student is fail");
    }
}
