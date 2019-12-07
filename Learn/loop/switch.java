public class Test {
    public static void main(String args[]) {
        char grade = '3';

        switch (grade) {
        case '5':
            System.out.println("A+");
            break;

        case '4':
            System.out.println("A");
            break;

        case '3':
            System.out.println("B");
            break;
        
        default :
            System.out.println("还未评估");

        }
     System.out.println("绩效是：" + grade);


    }
}

/*
 * switch(expression){ case value : //语句 break; //可选 case value : //语句 break;
 * //可选 //你可以有任意数量的case语句 default : //可选 //语句 }
 */