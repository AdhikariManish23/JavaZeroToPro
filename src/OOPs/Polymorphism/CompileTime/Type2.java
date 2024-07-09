package OOPs.Polymorphism.CompileTime;

// Sequence of Argument

public class Type2 {

    void display(String a , int b){
        System.out.println("Hello");
    }
    void display(int a, String b){
        System.out.println("Namaste");
    }

    public static void main(String[] args) {
        Type2 cs2 = new Type2();
        cs2.display("d",1);
        cs2.display(1,"f");
    }
}
