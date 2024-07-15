package OOPs.KeyWords.StaticKeyword;

public class CountDemo {
    //    int count = 0; if you used this it will give you 1 1 1 as a output
    static int count = 0;
    CountDemo(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CountDemo c2 =new CountDemo();
        CountDemo c1 =new CountDemo();
        CountDemo c3 =new CountDemo();
    }
}
