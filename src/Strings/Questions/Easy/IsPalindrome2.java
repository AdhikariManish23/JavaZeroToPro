package Strings.Questions.Easy;

// Inout : s = "A 1man, a plan, a canal: Panam1a"
// output: true
// NOTE: converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters
public class IsPalindrome2 {

    public boolean solution(String s){
        if(s.isEmpty()){
            return false;
        }

        int start = 0;
        int end = s.length()-1;

        while(start < end ){
            char first = s.charAt(start);
            char last = s.charAt(end);

          if (!Character.isLetterOrDigit(first)){
              start++;
          } else if (!Character.isLetterOrDigit(end)) {
              end--;
          } else if (Character.isLowerCase(start) != Character.isLowerCase(end)) {
              return  false;
          }
          start++;
          end--;

        }

    return true ;
    }

    public static void main(String[] args) {
        IsPalindrome2 ip = new IsPalindrome2();
        System.out.println(ip.solution("A 1man, a plan, a canal: Panam1a"));
    }
}
