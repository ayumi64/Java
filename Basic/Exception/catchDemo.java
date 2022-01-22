package exception;

public class catchDemo {
    public  static void main(String[] args){
        try{
            int a[] = new int[2];
            System.out.println("Access element three : " + a[3]);

        }
        catch(Exception e) {
            System.out.println("Exception throw :" + e);
        }
        System.out.println("Out of the block");
    }

}


/**
 * try{
   // 程序代码
}catch(异常类型1 异常的变量名1){
  // 程序代码
}catch(异常类型2 异常的变量名2){
  // 程序代码
}catch(异常类型2 异常的变量名2){
  // 程序代码
}.3+

 */