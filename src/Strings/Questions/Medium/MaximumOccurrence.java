package Strings.Questions.Medium;
import java.util.*;

// Question : Print If there is Multiple Maximum Occurrence of a Character

public class MaximumOccurrence {

    public static void main(String[] args) {
        String s = "Manish adhikari";

        int[] arr = new int[127];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
        }

        int max = -1;

        // Find the maximum occurrence
        for (int i = 0; i < 127; i++) {
            if (max < arr[i]) {
                max = arr[i];
                // The maximum occurrence max is updated to 3 when it reaches arr[97] and arr[105]

            }
        }

        List<Character> maxChars = new ArrayList<>();

        // Collect all characters with the maximum occurrence
        for (int i = 0; i < 127; i++) {
            if (arr[i] == max) {
                maxChars.add((char) i);
                // When it finds arr[97]  == 3, it adds 'a' to maxChars           97 = 'a'
            }
        }

        // Print all characters with the highest occurrence
        System.out.println("Characters with the highest occurrence:");
        for (char c : maxChars) {
            System.out.println(c);
        }
    }
}

// This Method for finding Only One Maximum Character


//    public static void main(String[] args) {
//        String s = "Manish Adhiakri";
//
//        int [] arr = new int [127];
//
//        for(int i = 0 ; i <s.length(); i++){
//            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
//
//        }
//
//        int  max = -1;
//        char c = ' ';
//
////      Method 1:
//
//        for (int i = 0; i < 127; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//                c = (char) i; // (char) i converts the integer i to its corresponding Unicode character
//            }
//        }
//
////      Method 2:
//
//        // for(int  i = 0; i< s.length(); i++){
//        //     if (max < arr[s.charAt(i)]){
//        //         max =  arr[s.charAt(i)];
//        //         c = s.charAt(i);
//        //     }
//        // }
//        System.out.println(c);
//    }
//}
