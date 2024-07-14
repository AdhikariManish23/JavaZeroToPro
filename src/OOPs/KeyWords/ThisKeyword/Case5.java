package OOPs.KeyWords.ThisKeyword;

public class Case5 {
    Case5 (ThisDemo td){
        System.out.println("case5 class constructor");
    }
}
class ThisDemo{
    void m1(){
        Case5 cs5 = new Case5(this);
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.m1();
    }
}
