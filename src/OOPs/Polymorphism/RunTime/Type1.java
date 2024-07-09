package OOPs.Polymorphism.RunTime;

/*
    We can achieve RunTime by using Method Overriding
=> Same name
=> Different class
=> Same Types arguments : numbers of arguments , sequence of arguments , Type of argument
=> Inheritence

*/


// Same Number of Arguments

// Class 1
public class Type1 {
    // Method of parent class
    void Print()
    {
        // Print statement
        System.out.println("parent class");
    }
}

// Class 2
// Helper class
class subclass1 extends Type1 {
    // Method
    void Print()
    { System.out.println("subclass1"); }
}


// Class 3
// Helper class
class subclass2 extends Type1 {
    // Method
    void Print()
    {
        // Print statement
        System.out.println("subclass2");
    }
}


// Class 4
// Main class
class GFG {
    // Main driver method
    public static void main(String[] args)
    {
        Type1 a = new Type1();
        a.Print();
        subclass1 b =new subclass1();
        b.Print();
        subclass2 c = new subclass2();
        c.Print();
    }
}
