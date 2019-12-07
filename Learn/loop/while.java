public class Test {
    public static void main(String args []){
        int x =8;
        while(x < 10 ){
            System.out.println("Value of x :" + x);
            x++;
            System.out.print("\n");
        }

        int y =2;

        do{
            System.out.println("value of y :" + y);
            y++;
            System.out.print("\n");

        }while (y < 5);


        int[] numbers = {10,20,30,40,50};

        for (int z : numbers){
            System.out.print(z);
            System.out.print("\n");
        };


        for (int h : numbers){
            if (h == 30){
            break;
            }
            System.out.print(h);
            System.out.print("\n");
        }

        for (int conti : numbers){
            if (conti == 30){
                continue;  //跳过30
            }
            System.out.print(conti);
            System.out.print("\n");
        }

    }
}




/*
while( 布尔表达式 ) {
  //循环内容
}

do {
       //代码语句
}while(布尔表达式);


for(声明语句 : 表达式)
{
   //代码句子
}

*/