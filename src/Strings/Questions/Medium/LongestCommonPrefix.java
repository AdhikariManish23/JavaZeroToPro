package Strings.Questions.Medium;

// Input = [ "flower" , "flow" , "flight" ]
// Output = "fl"

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String solution (String[] str ){
        Arrays.sort(str); // Any common prefix found between the first and last strings will also be a common prefix for all other strings in between
        String s1 = str[0];
        String s2= str[str.length-1];
        int i = 0;
        while(i< s1.length() && i < s2.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return s1.substring(0,i);

    }

    public static void main(String[] args) {
       String [] s = {"flower","flow","flight"};
       String result = solution(s);
        System.out.println(result);

// There is another method to write above code::
//        String result = LongestCommonPrefix.solution(new String[] {"flower", "flow", "flight"});
//        System.out.println(result);


// When You dont make the method "static" so you have to call this method like this
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String re = lcp.solution(new String[] {"manish", "mansi", "manas"});
        System.out.println(re);

    }
}
