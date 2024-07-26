package Strings.Topics;

public class ConversionCase {
    public static void main(String[] args) {


        String s = "manish";
        String s1= "ADHIKARI";

        //   Type Case Conversion method
        System.out.println(s.toUpperCase());
        System.out.println(s1.toLowerCase());


        //  Type Casting method
        //  valurOf
        int a = 10 , b = 20;
        System.out.println(a+b);
        String st = String.valueOf(a);
        String str = String.valueOf(b);
        System.out.println(st+str);

        //  toCharArray
        char[] c = s.toCharArray();
        System.out.println(c);


    }
}
