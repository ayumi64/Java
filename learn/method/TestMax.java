public class TestMax {
    /** 主方法 
     * 调用了max方法
    */
    public static void main(String[] args) {
       int i = 5;
       int j = 2;
       int k = max(i, j);
       System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);
    

       double h = 2.2;
       double m = 2.1;
       double b = max(h, m);
    System.out.println( h + " 和 " + m + " 比较，最大值是：" + b);
 }

  
    /** 返回两个整数变量较大的值 */
    public static int max(int num1, int num2) {
       int result;
       if (num1 > num2)
          result = num1;
       else
          result = num2;
  
       return result; 
    }


    public static double max(double num1, double num2) {
        double result;
        if (num1 > num2)
           result = num1;
        else
           result = num2;
   
        return result; 
     }
 }