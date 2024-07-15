package OOPs.KeyWords.StaticKeyword;

public class Test {
    static int a  = 10;
           int b =20;
// You cant access the static key word with  local variable
    //    void m(){
//        static int b  =20;
//        int b = 20 ;  is the correct way
//    }

}
class demo{
    public static void main(String[] args) {
//        System.out.println(a); // its gives u  error
        System.out.println(Test.a);
//        System.out.println(Test.b);  non-static variable b cannot be referenced from a static context
    }
}