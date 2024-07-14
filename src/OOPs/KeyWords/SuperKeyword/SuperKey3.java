package OOPs.KeyWords.SuperKeyword;

public class SuperKey3 {
    SuperKey3(){
        System.out.println("Construtor 1");
    }
}
class hero extends SuperKey3{
    hero(){
    //  super();  // here it is not compulsory to write super Keyword by default it is used By compiler
        System.out.println("Constructor 2");
    }

    public static void main(String[] args) {
        hero h = new hero();  // by default it calls both the Constructor whether you use "super" keyword or not
    }
}
