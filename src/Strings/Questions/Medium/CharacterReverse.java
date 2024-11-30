package Strings.Questions.Medium;

// Question : Reverse Each word in String But not the Whole Sentence ;
// input = "i am an educator"
// output = i ma na rotacude


public class CharacterReverse {

    public static void reverse(StringBuilder sb ,int i , int j){
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("my name is manish");

       int n = sb.length();
       int i = 0, j = 0;

       while(j<n){

           if(sb.charAt(j) != ' ') j++;
           else{
           //  sb.reverse();  if we just reverse sb it reverse the entire string
               reverse(sb,i,j-1);  // not j because right now j is on space position that why j-1
               i = j+1;
               j = i;
           }
       }
       reverse(sb,i,j-1);
        System.out.println(sb);
    }
}
