package OOPs.KeyWords.StaticKeyword;

public class Method {
    static void display(){
        System.out.println("1");
    }
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        // calling static method
        display();  // Within a class
        Method.display();  // both methods are of calling static method
        xyz.hello();  // outside the class u have to use the class name
        // calling non-static m ethod
        Method m = new Method();
        m.show();
    }
}
class xyz{
    static void hello(){
        System.out.println("3");
    }
}
