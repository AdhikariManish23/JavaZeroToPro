package OOPs.PracticeQuestions;

import jdk.dynalink.beans.StaticClass;

public class PassByValueOrReference {


    // Pass By Value
    static void change(int x){
        x *= 100;
        System.out.println("Inside changing value " + x);
    }

    // Pass By Reference
    String name;
    int rno;

    void id(String a, int x){
        this.name = a;
        this.rno = x;
//        System.out.println("Inside method: " + a + " " + x);
    }

    public static void main(String[] args) {

        // Pass By Value
        int x = 5;
        System.out.println("Before changing value " + x);
        change(x);
        System.out.println("After changing value " + x);

        System.out.println("Pass By refernce ");

        // Pass By Reference
        PassByValueOrReference ps = new PassByValueOrReference();
        ps.id("manish", 10);
        System.out.println("before method call: " + ps.name + " " + ps.rno);
        ps.id("rajesh",34);
        System.out.println("After method call: " + ps.name + " " + ps.rno);
    }

}
