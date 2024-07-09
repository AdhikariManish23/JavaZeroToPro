package OOPs.Basics;

public class Concept {
    //    Method
    public void eat() {
//       Function
        System.out.println("I am eating");
    }

    public void run() {
//        Function
        System.out.println("i am running");
    }

    public static void main(String[] args) {

//    this all the files take form concept class we make object in concept file and call here in the main file

        System.out.println("Animal");
//      object making
        Concept Tuffy = new Concept();
        Tuffy.eat();
        Tuffy.run();

//      New Object
        Concept Angaad = new Concept();
        Angaad.eat();

//      Creating Birds class object
        Birds sparrow1 = new Birds();
        sparrow1.fly();
        sparrow1.nest();
    }
}
// Here is another Class and calling there methods in main class

class Birds {
    public void fly() {
        System.out.println("I am FFFFFFlying");
    }

    public void nest() {
        System.out.println("Birds make their Nest");
    }
}
