import java.util.*;
import java.text.*;


public class DateTime {
    public static void main(String args[]){
        Date td = new Date(); 
        System.out.println(td);
        System.out.println("TS Time is：" + td.getTime());
        System.out.println(td.toString());

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        String time = ft.format(dNow);
        System.out.println("The time now is: "+ time);


//解析字符串为时间

        String input = args.length == 0 ? "1818-11-11" : args[0]; 
        System.out.print(input + " Parses as "); 
 
        Date t; 
   
        try { 
            t = ft.parse(input); 
            System.out.println(t); 
        } catch (ParseException e) { 
            System.out.println("Unparseable using " + ft); 
        }




     Date date = new Date(); 
     //c的使用  
     System.out.printf("全部日期和时间信息：%tc%n",date);          
     //f的使用  
     System.out.printf("年-月-日格式：%tF%n",date);  
     //d的使用  
     System.out.printf("月/日/年格式：%tD%n",date);  
     //r的使用  
     System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);  
     //t的使用  
     System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);  
     //R的使用  
     System.out.printf("HH:MM格式（24时制）：%tR",date); 

     System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
     // 显示格式化时间
     System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
    }

//sleep






}


/*
1
boolean after(Date date)
若当调用此方法的Date对象在指定日期之后返回true,否则返回false。
2
boolean before(Date date)
若当调用此方法的Date对象在指定日期之前返回true,否则返回false。
3
Object clone( )
返回此对象的副本。
4
int compareTo(Date date)
比较当调用此方法的Date对象和指定日期。两者相等时候返回0。调用对象在指定日期之前则返回负数。调用对象在指定日期之后则返回正数。
5
int compareTo(Object obj)
若obj是Date类型则操作等同于compareTo(Date) 。否则它抛出ClassCastException。
6
boolean equals(Object date)
当调用此方法的Date对象和指定日期相等时候返回true,否则返回false。
7
long getTime( )
返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
8
int hashCode( )
 返回此对象的哈希码值。
9
void setTime(long time)
 
用自1970年1月1日00:00:00 GMT以后time毫秒数设置时间和日期。
10
String toString( )
把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy 其中： dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)。


https://www.runoob.com/java/java-date-time.html

*/