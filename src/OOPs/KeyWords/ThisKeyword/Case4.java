package OOPs.KeyWords.ThisKeyword;

// This keyword can be used to pass as an argument

public class Case4 {
    void m1(Case4 gh){
        System.out.println("Jai Mata Dii");
    }
    void m2(){
        m1(this);   // here this point out the above method
    }

    public static void main(String[] args) {
        Case4 tx=new Case4();
        tx.m2();
    }
}
