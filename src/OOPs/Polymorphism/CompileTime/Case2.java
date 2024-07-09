package OOPs.Polymorphism.CompileTime;

// Sequence of Argument

public class Case2 {
    void display(String a , int b){
        System.out.println("Hello");
    }
    void display(int a, String b){
        System.out.println("Namaste");
    }

    public static void main(String[] args) {
        Case2 cs2 = new Case2();
        cs2.display("d",1);
        cs2.display(1,"f");
    }
}
