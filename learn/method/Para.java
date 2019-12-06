
public class Para{

    public static void main(String[] args){
        int num1 =1;
        int num2 =2;

        System.out.println(num1 + ":" + num2);

        swap(num1,num2);
        System.out.println(num1 + ":" + num2);
    }


    public static void swap(int n1, int n2){
        System.out.println("in");
        System.out.println("out");

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("over");
    }
}