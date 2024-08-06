package Strings.Questions.Easy;

//Input: s = "()[]{}"
//Output: true

import java.util.Stack;

public class ValidParantheses {
        public boolean solution (String s ){
            if(s.length() == 0){
                return false;
            }
            Stack<Character> st =new Stack<>();
            for(int i = 0; i< s.length(); i++){
               char ch = s.charAt(i);
               if (ch == '(' || ch == '{' || ch == '['){
                   st.push(ch);
               }
               else {
                   if(st.isEmpty()) return false;
                   char c = st.pop();
                   if((ch == '(' && c != ')') || (ch == '{' && c != '}') || (ch == '[' && c != ']')){
                       return false;
                   }
               }


            }
            if(st.size() == 0){
                return true;
            }
            return false;

        }

    public static void main(String[] args) {
        ValidParantheses vp =new ValidParantheses();
        System.out.println(vp.solution("]{}()"));
    }
}
