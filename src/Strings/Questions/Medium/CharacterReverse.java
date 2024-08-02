package Strings.Questions.Medium;

// Question : Reverse Each word in String But not the Whole Sentence ;
// input = "i am an educator"
// output = i ma na rotacude


public class CharacterReverse {
    public static void main(String[] args) {
        String str = "i am an educator";
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for(int i= 0; i <str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' ' ){
                sb.append(ch);     // if there is no space store in sb you can see in  example "am" is store in sb(stirng Builder) => Eg;  "am " ; now after "am" there is space now else condition will apply with "am";
            }
            else{
                sb.reverse();    // sb = "i"
                ans += sb;       // ans = "i"
                ans += " ";      // ans = "i "
                //  two methods for empty the String Builder
                sb = new StringBuilder("");   // sb = ""   (empty)
                // sb.delete(0, sb.length());   another method for empty String

                // Now String Builder is empty
            }
        }
        // these 2 steps for the Last string(educator) to print because ,
        // there is no Space in the End due to this the last String word will not print and store in String Builder sb only
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
