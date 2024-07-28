package Strings.Topics;

public class SubSequence {

    public static void main(String[] args) {
        String s = "this is demo";
//  INDEX           0123456789..
        // Sub Seuqence
        System.out.println(s.subSequence(3, 9)); // s is d    return in charSequence

        // Sub String
        System.out.println(s.substring(3)); // s is demo   return in  string

        System.out.println(s.substring(5,11)); // s is dem
    }
}
