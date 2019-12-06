import java.util.*;

public class StartEnd{
    public static void main(String args[]) {

    try{
        long start = System.currentTimeMillis();
        Thread.sleep(5*60*10);
        System.out.println(new Date() + "\n");
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println("Difference is :" + diff);
    } catch (Exception e){
        System.out.println("Got Exception");

    }
}
}