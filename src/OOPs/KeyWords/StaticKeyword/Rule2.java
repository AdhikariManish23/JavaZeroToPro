package OOPs.KeyWords.StaticKeyword;

public class Rule2 {
    static  void display(){


//  it will give you error because A static method can call only static method and cannot call non static method

//        show();
        System.out.println("1");
    }
//  create static method
//  static void show
    void show(){
        System.out.println("2");
    }
}
