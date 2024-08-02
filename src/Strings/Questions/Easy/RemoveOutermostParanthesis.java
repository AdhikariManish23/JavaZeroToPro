package Strings.Questions.Easy;

//  Question available on Leetcode
// A primitive valid parentheses string is a substring that cannot be split into smaller valid parentheses strings. It starts with '(' and ends with ')' and is balanced in between.
//Example: "(()())" is a primitive, "(()())(())" consists of two primitives: "(()())" and "(())".  IMPORTANT=> They must contain paranthesis in Equal number

public class RemoveOutermostParanthesis {

    public String Solution(String s){
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

//  It indicates the start of a new primitive, so we increment the counter but do not add this parenthesis to the result.
            if (c == '(' && count == 0) {
                count++;
            }
//  It is an inner parenthesis, so add it to the result and increment the counter.
            else if (c == '(' && count >= 1) {
                ans.append(c);
                count++;
            }
//  It is an inner parenthesis, so add it to the result and decrement the counter.
            else if (c == ')' && count > 1) {
                ans.append(c);
                count--;
            }
//  it indicates the end of a primitive, so decrement the counter but do not add this parenthesis to the result.
            else if (c == ')' && count == 1) {
                count--;
            }
        }

    return ans.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParanthesis sol = new RemoveOutermostParanthesis();
        String s1 = "(()())(())";
        System.out.println("Input : "+s1);
        String result1 = sol.Solution(s1);
        System.out.println("Output : "+result1);  // Expected output: "()()()"

        System.out.println();

        String s = "(((())()))";
        System.out.println("Input : "+s);
        String result = sol.Solution(s);
        System.out.println("Output : "+result);
    }
}
