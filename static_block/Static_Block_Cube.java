package static_block;

public class Static_Block_Cube {
    static int x;

    static {
        x = 10;
        x=x*x*x;
    }

    static void display() {
        System.out.println(x);
    }

    public static void main(String[] args) {
//        display();
        Static_Block_Cube.display();

    }
}
