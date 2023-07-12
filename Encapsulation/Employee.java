package Encapsulation;

public class Employee {

    private int empid;   //data hiding
    private String empname;   //data hiding
    public void setEmpid(int emp) {      //setter method is used to set the value
        empid = emp;
    }

    public void setEmpname(String nm) {
        empname = nm;
    }

    public int getEmpid() {          // getter method is used to get the value
        return empid;
    }

    public String getEmpname() {
        return empname;
    }


    void displayId() {
        System.out.println("my id is: "+ empid);
    }
    void displayName(){
        System.out.println("my name is: "+empname);
    }
}
