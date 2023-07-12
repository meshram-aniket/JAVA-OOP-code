package Practice;

class A
{
   B obj;
   A(B obj) {
       this.obj = obj;
       obj.display();
   }
}

class B
{
   int x = 10;

   B() {
       A a = new A(this);

   }

   void display() {
       System.out.println("the value of x is : "+ x );
   }

   public static void main(String[] args) {
       B b = new B();
   }
}
