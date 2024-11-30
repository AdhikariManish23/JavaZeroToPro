package Sorting.SelectionSort;
import java.util.*;

// Question : Sort the names of fruits in lexicographical Order
// input => ["papaya", "lime", "watermelon" , "apple" , "mango", "kiwi" ]
//output => ["apple" , "kiwi" , "lime" , "mango", "papaya", "watermelon"]

public class LexicographicalOrder {
    static void solution (String[] arr){
        int n = arr.length;

        for(int i = 0 ; i < n-1 ; i++){
            int min_Index = i;
            for(int j = i+1; j < n ; j++){
                if(arr[j].compareTo(arr[min_Index]) < 0){
                    min_Index = j;
                }
//              After finding the min_Index Swap them
                String temp = arr[i];
                arr[i] = arr[min_Index];
                arr[min_Index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[]arr = {"papaya", "lime", "watermelon" , "apple" , "mango", "kiwi"};

//  NOTE : " Arrays.toString " this method is used to convert an array into a readable string representation.

        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array :");
        solution(arr);
//  NOTE :  By this you can also print the array By Printing Both the method you will know the Difference
        for(String s : arr){
            System.out.print(s + " ");
        }
    }
}
