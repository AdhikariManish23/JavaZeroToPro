package OOPs.Polymorphism.CompileTime;

public class Cases1 {
    void show(StringBuffer a) {
        System.out.println("StringBuffer Method");
    }

    void show(String a) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Cases1 first = new Cases1();
        first.show("abc");
        first.show(new StringBuffer("abc")); // or case1.show((String) "abc");
//      case1.show(); it will not run because compiler got confuse what to choose which method to be choose
    }
}
