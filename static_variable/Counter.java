package static_variable;

//Java Program to illustrate the use of static variable which
//is shared with all objects.
class Counter{

    static int count;// will get memory all time when we create an object of the class
//    static int count;//will get memory only once and retain its value

    Counter(){
        count++;//incrementing the value of static variable
        System.out.println(count);

    }

    public static void main(String args[]){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
    }
}
