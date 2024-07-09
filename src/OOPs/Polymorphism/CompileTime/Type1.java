package OOPs.Polymorphism.CompileTime;

/*
    we can achieve compile time by using Method Overloading
=> same name
=> same class
=> Different Types arguments : numbers of arguments , sequence of arguments , Type of argument
 */


// Different Number of Arguments
public class Type1 {

//  0 Argument
    void show(){
        System.out.println("1");
    }

//  1 Argument
    void show(int a){
        System.out.println("2");
    }

//  2 Argument
    void show(int a,int b){
        System.out.println("3");
    }

    public static void main(String[] args) {
        Type1 cs1 = new Type1();

        cs1.show();
        cs1.show(1);
        cs1.show(1,2);
    }
}
