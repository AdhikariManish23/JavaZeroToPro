package OOPs.Basics.InitialisingObject.Constructor;

// Constructor

// Type : 1
// Default Constructor(no argument) => which is made by compiler


public class Test {
//    int i;
//    String s;
//    public static void main(String[] args) {
//        Test t = new Test();
//        System.out.println(t.i+"  "+t.s);
//    }


//  Type : 2

//  Default Constructor(no argument) => which defined by User

//    Test (){
//        System.out.println("no argument Constructor");
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//    }

// Type : 3

//  Parametrized Constructor

    Test(int a){
        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args) {
        Test t = new Test(10);
    }
}
