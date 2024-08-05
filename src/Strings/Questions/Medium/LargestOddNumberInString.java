package Strings.Questions.Medium;

//  Input = "52" , "4268" , "35673"
//  Output = "5" , "" , "35673"

public class LargestOddNumberInString {
    public String solution(String s) {

        int l = s.length();
        for (int i = l - 1; i >= 0; i--) {
            int num = s.charAt(i) - '0';  // CONVERT
 /*
    To CONVERT the Char into num subtract any char from char 0 ('0');. Because of ASCII values
    '0' = 48 and you subtract any char value of number for example let take '5' = 53 .
    When you Subtract 53 - 48 you will get 5 in numeric form.
   */
            if (num % 2 != 0) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }

        public static void main (String[]args){
            LargestOddNumberInString lo = new LargestOddNumberInString();
            String result = lo.solution("52");
            System.out.println(result);
        }
    }
