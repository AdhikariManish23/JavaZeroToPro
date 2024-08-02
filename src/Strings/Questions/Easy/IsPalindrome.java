package Strings.Questions.Easy;

// String s = "madam";  // palindrom => a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam , mam.
// Input = madam;
// Output = madam ;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "abcba";
        String m = "";

        for(int i = s.length()-1; i>=0; i--){
            m += s.charAt(i);      // + is use for Concat
            //  storing the string values from backward in 'm' variable
        }

        // 1st method
        boolean isPalindrome = s.equals(m);

        System.out.println(isPalindrome);


        // 2nd Method
        // if (s.equals(m)) {
        //     System.out.println("Palindrome String");
        // }
        // else{
        //     System.out.println("Not a Palindrome String");
        // }

        /*

            NOTE : To check the reverse string s.length() and s.charAT() Methods used
                    To check the Palindrome String s.length() , s.charAT() and s.equals()  Method used

        */

    }
}
