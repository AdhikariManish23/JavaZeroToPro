package OOPs.KeyWords.ThisKeyword;

public class Case2 {
    void display(){
        System.out.println("Hello");
    }
    void shoe(){
//  If you don't write this keyword then by default it take this keyword infront of display
//      display();
        this.display();
    }

    public static void main(String[] args) {
        Case2 c=new Case2();
        c.shoe();
    }
}
