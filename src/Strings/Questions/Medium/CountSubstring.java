package Strings.Questions.Medium;

// Question : Count the number of Palindromic Substring


public class CountSubstring {

    public static boolean isPalindrome(String s ){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void substring(String s){
        int count = 0;
        for(int i = 0; i<= s.length()-1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j)) == true) {
                    System.out.println(s.substring(i, j));
                    count++;
                }
            }

        }
        System.out.println("\nThe Number of palindrome substring are : "+count);
    }


    public static void main(String[] args) {
        String str = "abcba";

        CountSubstring cs = new CountSubstring();
        cs.substring(str);


    }
}
