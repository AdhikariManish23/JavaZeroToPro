package OOPs.Polymorphism.CompileTime;

// Related to Automatic Promotion Table

public class Cases2 {

    void white(float b ){
        System.out.println("int float method");
    }
    void white(float a, int b){
        System.out.println("float int method");
    }
    void white(String a ,float b){
        System.out.println("String float method");
    }
    public static void main(String[] args) {
        Cases2 no = new Cases2();
        no.white(24.05f,10);
        no.white(12);
//        no.white(10,21)  it will not work
//        no.white(20.3f,65.2f) it will not work because of automatic promotion
        no.white("abc",20); // it works because now it can convert int 20 into float value
    }
}
