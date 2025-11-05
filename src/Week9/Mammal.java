package Week9;

public class Mammal implements Animal{
    public Mammal(){}

    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal Travel");
    }

    public static void main(String[] args){
        Mammal m = new Mammal();
        m.eat();
        m.travel();
    }
}
