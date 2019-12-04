//final 最终的值

public class Final{
    final int value = 10;

    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    public void changeValue(){
     //   value = 12;  //The final field Final.value cannot be assigned
    }
}