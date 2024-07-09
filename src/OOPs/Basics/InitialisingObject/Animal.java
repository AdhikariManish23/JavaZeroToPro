package OOPs.Basics.InitialisingObject;

// Methods Of Initialising a Object

// 1. Reference Variable

public class Animal {
    String color;
    int age;

    public static void main(String[] args) {
        Animal Tuffy = new Animal();

        Tuffy.color = "Brown";
        Tuffy.age = 7 ;
        System.out.println(Tuffy.age+" "+Tuffy.color);
    }

}
