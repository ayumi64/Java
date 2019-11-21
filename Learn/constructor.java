public class cat{     //cat class
    String name;  
    float age;
    String color;
    int month;

    void miao(){        //多个方法

    }
    void eat(){

    }


public cat(String name){    //构造方法 参数:name
System.out.println("cat's name is : "+ name);
}

public static void main(String[] args){
    cat Acat = new cat("remi");   //创建对象 new一个cat
    cat Bcat = new cat("muQ"); 
    cat xxx = new cat("reimu"); 
}

/*
public cat(String color){    //构造方法 参数:name
System.out.println("cat's color is : "+ color);
}

public static void main(String[] args){
    cat AAAcat = new cat("white");   //创建对象 new一个cat
    cat BCCcat = new cat("black"); 
    cat xxx = new cat("yellow"); 
}
*/

/*
public cat(float age){
System.out.println("cat's age is : " + age); //构造一个方法,参数是age 
}

public void 1age(float age){
    cat Ccat = new cat("1");
    cat xxx = new cat("1.5");

}
*/

}