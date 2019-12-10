public class Cat {
    float age;
    public Cat(String name) {
        System.out.println("cat's name :" + name);
    }
    public void setage(float catAAAge) {
        age = catAAAge;
    }
    public float gettaage() {
        System.out.println("cat's age get :" + age);
        return age;
    }
    public static void main(String[] args) {
        Cat Acat = new Cat("remi");
        Acat.setage(2);
        Acat.gettaage();
        Acat.gettaage();
        System.out.println("cat's age set :" + Acat.gettaage());

    }
}