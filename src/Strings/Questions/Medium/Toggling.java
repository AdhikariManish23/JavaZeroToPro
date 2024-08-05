package Strings.Questions.Medium;
import java.util.Scanner;

// Question : Each Character in String converts Uppercase into Lower and vice versa

public class Toggling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // AdhIkaRi
        System.out.println("Enter the String :");
        StringBuilder str = new StringBuilder(sc.nextLine());

//      METHOD 1:

//        for (int i = 0; i < str.length(); i++) {
//
//            boolean flag = true;  // true => capital
//
//            char ch = str.charAt(i);  // A(65)
//
//            if (ch == ' ') continue;   //  if you want to remove the Space error
//
//            int asci = (int) ch;   //  65
//
//            if (asci >= 97) flag = false;  // small
//
//            if (flag == true) {   // capital
//                asci += 32;
//                char dh = (char) asci;
//                str.setCharAt(i, dh);
//            } else {   // small
//                asci -= 32;
//                char dh = (char) asci;
//                str.setCharAt(i, dh);
//            }
//
//        }
//        System.out.println(str);
//    }
    //      METHOD 2: (optimised code)

        for(int i= 0; i< str.length(); i++){
        char ch  = str.charAt(i);

        if(Character.isUpperCase(ch)){
            str.setCharAt(i, Character.toLowerCase(ch));
        }
        else if (Character.isLowerCase(ch)) {
            str.setCharAt(i,Character.toUpperCase(ch));
        }
    }

        System.out.println(str);
  }

}
