package OOPs.KeyWords.Final;

public class Case1 {
    public static void main(String[] args) {
//  Without Using Final Key word
//        int i = 10;
//        i = i+20;
//        System.out.println(i);

// With using Final KeyWord
         final int i = 10;
//         i = i+10;             // Give you error because you cant access the final key word
        System.out.println(i);
    }
}
