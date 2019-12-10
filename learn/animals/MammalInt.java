package animals;

public class MammalInt implements Animal{

    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal tracels");
    }


    public static void main(String [] args){
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();

    }
}