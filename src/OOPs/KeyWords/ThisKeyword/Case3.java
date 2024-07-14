package OOPs.KeyWords.ThisKeyword;

public class Case3 {
//   Creating  Constructor
    Case3 (){
//      no argument constructor
        System.out.println("No Argument constructor");
    }
    Case3(int a){
        this();    // prints no argumanet constructor
        System.out.println("Parameterised Constructor");
    }

    public static void main(String[] args) {
//      Case3 cs3 = new Case3();     give you default constructor
        Case3 cs3 = new Case3(10);


    }
}
