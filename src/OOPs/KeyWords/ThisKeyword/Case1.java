package OOPs.KeyWords.ThisKeyword;

//  "this" => it refers to current class instance variable

public class Case1 {
//    int i  = 20 ;
    int  i ;
    void setValue(int i){
//        this.i += i+10;
        this.i = i;
    }
    void display (){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Case1 cs1 = new Case1();
        cs1.setValue(10);
        cs1.display();
    }
}
