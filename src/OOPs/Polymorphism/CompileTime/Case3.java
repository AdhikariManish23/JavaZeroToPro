package OOPs.Polymorphism.CompileTime;

// Different Data Type

public class Case3 {
    void print(int a){
        System.out.println("1");
    }
    void print (String a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Case3 cs3 = new Case3();
        cs3.print(1);
        cs3.print("abs");
    }
}
