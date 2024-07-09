package OOPs.Polymorphism.CompileTime;

/*
    we can achieve compile time by using Method Overloading
=> same name
=> same class
=> different arguments : numbers of arguments , sequence of arguments , Type of argument
 */


// Different Number of Arguments
public class Case1 {

    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    void show(int a,int b){
        System.out.println("3");
    }

    public static void main(String[] args) {
        Case1 cs1 = new Case1();

        cs1.show();
        cs1.show(1);
        cs1.show(1,2);
    }
}
