package Strings.Questions.Easy;

// Question : Printing Substring of "abcd"

public class Substring {
    public static void main(String[] args) {
        String s = "abcd";
        //     Output : a ab abc abcd b bc bcd c cd d
        for(int i  = 0; i <=3 ; i++){
            for(int j = i+1; j<=4; j++){             // 4 isliye kyu ki substring mai last index excluded hote hai
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
