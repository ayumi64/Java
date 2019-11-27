public class neko {

    String name;
    int age;
    long number_of_mao;
    float age_2;
    double days ;  
    boolean alive;
    char color;

    public neko(String name){
        System.out.println("name = :"+ name);
        System.out.println("age = :"+ age);
        System.out.println("number_of_mao = :"+ number_of_mao);
        System.out.println("age_2 = :"+ age_2);
        System.out.println("days = :"+ days);
        System.out.println("alive = :"+ alive);
        System.out.println("color = :"+ color);
    }
    
    public void settAge(int nekoage){
        age = nekoage;
    }

    public int gettAge(){
        System.out.println("age_2 = :"+ age);
        return age;

    }


    public static void main(String[] args){

        neko Aneko = new neko("reimi");
        Aneko.settAge( 1 );
        Aneko.gettAge();

        System.out.println("age = :"+ Aneko.age);

    }
}