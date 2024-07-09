package OOPs.Polymorphism.RunTime;

// Same type of Argument

public class Type3 {
    void show(String a){
        System.out.println("1");
    }
}
class name extends Type3{
    void show(String b){

        System.out.println("Manish");
    }

    public static void main(String[] args) {
        Type3 t = new Type3();
        t.show("a");
        name n = new name();
        n.show("s");
    }
}
