package Interface;

public interface I1 {
    public abstract void show1();  //methods in interface is by default public abstract

    public static final int a = 10;   // variable in interface is by default public static final

    default void show2(){            //concrete method should be default in interface
        System.out.println("i m in class I1");
    }

}
