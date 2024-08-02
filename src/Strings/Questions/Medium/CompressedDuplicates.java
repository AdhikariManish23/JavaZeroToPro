package Strings.Questions.Medium;

// Qeustion : The String should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates;

// input => aaabbbbccddde;
// output => a3b4c2d3e;     // if there is only 1 charater then do not print 1 only Just character

public class CompressedDuplicates {

    public static void main(String[] args) {
        String str = "aaabbbbcdddeeeee";
        String ans = ""+ str.charAt(0);  // Without adding "" you can't add character in String
        int count = 1;   // Beacuse we already Start with the character
        for(int i = 1; i< str.length(); i++){
            char curr = str.charAt(i);    // 1 index (a)
            char prev = str.charAt(i-1);  // 0 index (a)

            if(curr == prev){
                count++;    // count 2
            }
            else{
//      if condition for when characater value is more than 1 than print the count otherwise print only character
                if(count>1) ans += count;
//      reseting the count for the next character
                count = 1;
                ans += curr;
            }
        }
        if(count>1) ans += count; // this for the printing number of occurrence of last character
        System.out.println(ans);
    }
}
