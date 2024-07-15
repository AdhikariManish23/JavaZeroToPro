package OOPs.KeyWords.StaticKeyword;

public class Rule1 {
//  A static method can access only static data. it cannot access non-static data
//  int i =10;
    static int i = 10;
    static void display(){
        System.out.println(i);
    }
}

