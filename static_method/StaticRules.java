package static_method;

public class StaticRules {
    int a;
    static int b;

    void show() {
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String[] args) {
        StaticRules s1 = new StaticRules();
        s1.show();
    }
}

