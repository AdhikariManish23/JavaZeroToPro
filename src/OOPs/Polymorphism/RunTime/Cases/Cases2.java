package OOPs.Polymorphism.RunTime.Cases;

// Question => What happen if we change the Access Modifiers in the parent and child class
// ans : You have to give More privelege access modifiers to the child class


public class Cases2 {
    public void show(){
        System.out.println("1");
    }

}
class child {
    protected void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Cases2 cs2 =new Cases2();
        cs2.show();
    }

}
