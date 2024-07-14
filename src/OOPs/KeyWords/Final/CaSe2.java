package OOPs.KeyWords.Final;

public class CaSe2 {

    // if we use final key word in the Method we are not able to extend this method   And Same goes With Class

    void m1(){
        System.out.println("Namaste");
    }
}
class demo extends CaSe2{
    void m1(){
        System.out.println("Class demo");
    }

    public static void main(String[] args) {
        demo d =new demo();
        d.m1();
    }
}
