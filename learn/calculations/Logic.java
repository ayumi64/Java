public class Logic{
    public static void main(String[] args){
    
      boolean a =true;
      boolean b =false;

        System.out.println("a && b = " + (a&&b));
//逻辑与
        System.out.println("a || b = " + (a||b));
//逻辑或
        System.out.println("!( a&& b) = " + !(a && b));
//逻辑非

      int c = 5;
      boolean d = (c<4)&&(c++<10);
      System.out.println("短路逻辑运算结果为：" +d);
      System.out.println("c = " +c);




    }
}