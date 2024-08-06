package Strings.Questions.Easy;

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Input : s= "anagram", t = "nagaram"
// Output : true

import OOPs.Inheritence.A;

import java.util.Arrays;

public class AnagramOrNot {

    public boolean solution (String s , String t){
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        //  1: Method is to direct compare both arrays

        return Arrays.equals(sChars, tChars);



        //  2: Method for comparing is :
        // Manually compare the sorted char arrays
//        if (sChars.length != tChars.length) {
//            return false;
//        }
//
//        for (int i = 0; i < sChars.length; i++) {
//            if (sChars[i] != tChars[i]) {
//                return false;
//            }
//        }
//
//        return true;

    }

    public static void main(String[] args) {
        AnagramOrNot a1 = new AnagramOrNot();
        System.out.println(a1.solution("manish","ishman"));
    }
}
