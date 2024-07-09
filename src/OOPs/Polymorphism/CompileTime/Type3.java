package OOPs.Polymorphism.CompileTime;

// Different Data Type

public class Type3 {
    void print(int a){
        System.out.println("1");
    }
    void print (String a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Type3 cs3 = new Type3();
        cs3.print(1);
        cs3.print("abs");
    }
}
