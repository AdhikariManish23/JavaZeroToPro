package OOPs.Polymorphism.RunTime;

// Same Sequence of Argument

// parent class
public class Type2 {
    void Print(int a ,String b)
    {
        // Print statement
        System.out.println("Gang class");
    }
}

// Class 2
// child class
class Road extends Type2 {
    // Method
    void Print(int a,String b)
    { System.out.println("Road Gang1"); }
}


// Class 3
// child class
class Gali extends Road {
    // Method
    void Print(int a, String b)
    {
        // Print statement
        System.out.println("Gali Road Gang2");
    }
}
// Class 4
// Main class
class thief {
    // Main driver method
    public static void main(String[] args)
    {
        System.out.println("Class 1:");
        Type2 a= new Type2();
        a.Print(2,"abc");
        System.out.println("Class 2:");
        Road b =new Road();
        b.Print(2,"abc");
        System.out.println("Class 3:");
        Gali c = new Gali();
        c.Print(2,"abc");
    }
}
