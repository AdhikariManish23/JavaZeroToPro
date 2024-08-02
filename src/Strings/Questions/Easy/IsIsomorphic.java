package Strings.Questions.Easy;

// Also Do this Question by using Hash Map

import java.util.Scanner;

public class IsIsomorphic {

    public static boolean solution (String s , String t){
        int[] indexS = new int[200];  // Stores index of characters in string s
        int[] indexT = new int[200];  // Stores index of characters in string t

        for(int  i =0; i <s.length(); i++){
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]){
    /*  s.charAt(0) = e (ASCII value 101), which means indexS[101] = 0
        t.charAt(0) = a (ASCII value 97), which means indexT[97]  = 0
     * */
                return  false;
            }
//      Same hai toh add number to both the String now indexS and indexT look like :
//      [0,0,0,.....,1,....0,0,0,0]
            indexS[s.charAt(i)] = i +1;
            indexT[t.charAt(i)] = i +1;
    /* Why we Start adding in 'i' because the new array we created holding 0 as there numereic values */
        }
        return true ;

// NOTE : Dry Run of This code You can see in the Copy (String)

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String s = sc.next();
        System.out.println("Enter the 2nd String");
        String t = sc.next();


        System.out.println("is it Isomorphic ? " +" "+solution(s,t));
    }
}
