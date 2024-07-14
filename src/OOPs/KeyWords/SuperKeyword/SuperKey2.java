package OOPs.KeyWords.SuperKeyword;

public class SuperKey2 {
    void m1(){
        System.out.println("i am in 1 class");
    }
}
class b extends SuperKey2{
    void m1(){
        System.out.println("i am in 2 class");
    }
    void show(){
        m1();  // current class method
        super.m1();     // parent class method
    }

    public static void main(String[] args) {
        b ob = new b();
        ob.show();
    }
}
