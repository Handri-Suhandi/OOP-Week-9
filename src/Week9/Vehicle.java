package Week9;

public class Vehicle {
    interface action{
        void start();
        void stop();
    }

    private String name;

    public Vehicle(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void displayInfo(){
        System.out.println("Vehicle : " + name);
    }
}
