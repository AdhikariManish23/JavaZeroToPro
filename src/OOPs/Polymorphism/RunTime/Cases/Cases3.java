package OOPs.Polymorphism.RunTime.Cases;

// SUPER KeyWord Use

public class Cases3 {
    void show(){
        System.out.println("1");
    }
}
class xyz extends Cases3{
    void show(){

//      Wtih the help of "super" we can call Type1 class method in child class
        super.show();
        System.out.println("2");
    }

    public static void main(String[] args) {
        xyz x =new xyz();
        x.show(); // print both 1 and 2
    }
}
