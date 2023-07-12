package Interface;

public interface I2 {
    public abstract void show3();   //abstract method does not have body
    public static final String name = "aniket";
    default void show4(){
        System.out.println("i m in class I2");
    }
}
