package scanner;
import java.util.Scanner;

public class ScannerDemo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("next:");


    if(scan.hasNext()){
      //  String str1 = scan.next();
        String str1 = scan.nextLine();

 /*       next() 与 nextLine() 区别
next():
1、一定要读取到有效字符后才可以结束输入。
2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。 
3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。 
next() 不能得到带有空格的字符串。
nextLine()： 
1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。 
2、可以获得空白。
*/
        System.out.println("input is :"+ str1);
    }
    scan.close();
}
}