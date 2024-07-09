package OOPs.Inheritence;

// Type 3--Hierarchical

public class A {
    void showA(){
        System.out.println("A class method ");
    }
}

class B extends A
{
    void showB(){
        System.out.println("B Class Method");
    }
}

class C extends A
{
    void showC(){
        System.out.println("C class Method");
    }

    public static void main(String[] args) {
        A z = new A();
        B y = new B();
        C x = new C();
//      calling MEthod
        System.out.println("Printing A class");
        z.showA();
        System.out.println("Printing B class");
        y.showA();
        y.showB();
        System.out.println("Printing C Class");
        x.showA();
        x.showC();


    }
}
