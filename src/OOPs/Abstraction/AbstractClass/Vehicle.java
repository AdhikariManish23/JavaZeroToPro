package OOPs.Abstraction.AbstractClass;

abstract class Vehicle {
    // We never Create Abstract class Object
// if there is abstract method then it is must that class is also abstract
    abstract void start();

    // And Even we can also create simple method also
    void display(){
        System.out.println("Namaste");
    }

}