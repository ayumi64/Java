public class Array {
    public static void main(String[] args) {
       // 数组大小
       int size = 10;
       // 定义数组
       double[] myList = new double[size];
       myList[0] = 5.6;
       myList[1] = 4.5;
       myList[2] = 3.3;
       myList[3] = 13.2;
       myList[4] = 4.0;
       myList[5] = 34.33;
       myList[6] = 34.0;
       myList[7] = 45.45;
       myList[8] = 99.993;
       myList[9] = 11123;
       // 计算所有元素的总和
       double total = 0;
       for (int i = 0; i < size; i++) {
          total += myList[i];
       }
       System.out.println("总和为： " + total);


       
       double[] yourList = {1.9,2.9,3.4,3.5};

       for (int i = 0; i < yourList.length;i++){
          System.out.println(yourList[i]+ "");// 打印所有数组元素

       }

       double totalA = 0;
       for (int i = 0; i < yourList.length; i++){
          totalA += yourList[i];
       }
       System.out.println("Total is " + totalA);

       double max = yourList[0];
       for (int i = 1; i < yourList.length; i++){
          if (yourList[i] > max) max = yourList[i];
       }
       System.out.println("Max is " + max);


    }
 }

 /*
 //创建数组 arrayRefVar = new dataType[arraySize];

 double[] myList;     


 */