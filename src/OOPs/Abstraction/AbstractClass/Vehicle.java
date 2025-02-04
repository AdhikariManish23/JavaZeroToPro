package OOPs.Abstraction.AbstractClass;

abstract class Vehicle {
    // a method must always be declared in an abstract class , or we can say that if a class has an abstract method, it should be declared abstract as well
    abstract void start();

    // And Even we can also create simple method also
    void display(){
        System.out.println("Namaste");
    }

}
class Car extends Vehicle {

    // if a regular class extend abstract class then it is must have to create all the abstract methods if abstract parent class
    void start(){
        System.out.println("Car Starts with key");
    }

}
class Scooter extends Vehicle{
    void start(){
        System.out.println("Scooter Start with kick");
    }

    public static void main(String[] args) {

        // we can't create an Object of Abstract class
        Car c =new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
        s.display();
    }
}
