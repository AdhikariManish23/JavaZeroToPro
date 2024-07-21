package Strings.Questions.Easy;

// Input: s = "the sky is blue"
// Output s = "blue is sky the"

public class ReverseWords {

    public String Solution(String s) {
        // Split the string into words
        String[] words = s.split(" ");

        // By splitting now it look like an array [i , am , Groot],with index of [0,1,2]

        // Use StringBuilder for efficient string concatenation
        StringBuilder ans = new StringBuilder();

        // Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i != 0) { // Avoid adding a space at the end
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        String s = "i am Groot";
        System.out.println("Original: " + s);
        String result = rw.Solution(s);
        System.out.println("Reversed: " + result);
    }
}