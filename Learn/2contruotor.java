public class Cat{
    float age;

    public Cat(String name){

        System.out.println("cat's name is :" + name);
    }


    public void setage(float catAAAge){

    age = catAAAge;

    }


public float gettaage( ){
    System.out.println("cat's age is :" + age);
    return age;
}


public static void main(String[] args){

Cat Acat = new Cat("remi");

Acat.setage(2);

Acat.gettaage();

System.out.println("setage:"+ Acat.age);

}
}