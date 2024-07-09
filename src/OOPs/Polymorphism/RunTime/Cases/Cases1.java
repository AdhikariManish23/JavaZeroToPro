package OOPs.Polymorphism.RunTime.Cases;

// Question => Do overriding method must have same return type ?
// ans : yes , child class return type should be sub type of parent class


public class Cases1 {
    Object show(){
        System.out.println("Namaste");
        return null;
    }
}

class test extends Cases1{
    String show(){
        System.out.println("Jai Shree Ram");
        return null;
    }

    public static void main(String[] args) {
        Cases1 p = new Cases1();
        p.show();
        test t =new test();
        t.show();
    }
}