package OOPs.Abstraction.AbstractClass;

public class Scooter extends Vehicle{
    void start(){
        System.out.println("Scooter Start with kick");
    }

    public static void main(String[] args) {
        Car c =new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
        s.display();
    }
}
