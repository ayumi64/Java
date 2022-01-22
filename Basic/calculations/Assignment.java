public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a  = " + c );
//加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数	
//C + = A等价于C = C + A       
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c &= a ;
        System.out.println("c &= a  = " + c );
        c ^= a ;
        System.out.println("c ^= a   = " + c );
        c |= a ;
        System.out.println("c |= a   = " + c );


//条件运算符：variable x = (expression) ? value if true : value if false

        b = (a ==1) ? 20:30;
// 如果 a 等于 1 成立，则设置 b 为 20，否则为 30  
        System.out.println(b);

        b = (a == 10) ? 20 : 30;
// 如果 a 等于 10 成立，则设置 b 为 20，否则为 30

        System.out.println(b);

//instanceof 运算符  检查该对象是否是一个特定类型（      
        String name = "James";
        boolean resultB = name instanceof String;
        System.out.println(resultB);

    }
/*

public class Assign extends Assignment{
    public static void main(String[] args){

    Assign x = new Assign();
    boolean resultA = x instanceof Assignment;
    System.out.println(resultA);

    }
*/
}
