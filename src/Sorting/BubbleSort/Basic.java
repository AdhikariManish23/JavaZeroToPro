package Sorting.BubbleSort;
import java.util.*;
public class Basic {

// Space Complexity  is o(1)  And Time Complexity is n*square ......In Best Case We make Time Complexity O(n)
// The optimization involves adding a "flag" that helps in detecting whether any swapping has occurred during a particular pass through the array.

    static void bubbleSort(int [] arr){
        int n = arr.length;

        for (int i= 0 ; i < n-1; i++){

            //  For Optimized Code we need to check there is need to traverse all the i iterations or not if array is sorted only just 1 iteration of i is enough.
            boolean flag = false;  // means there is no Swapping
            for (int j = 0 ; j< n-i-1; j++){  // last i element are already at correct sorted position , so there is no need to check them
                if(arr[j] > arr[j+1]){

            //  SwapPing Method
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    flag = true ; // means swapping is take Place

                }

            }
            if (!flag){   // means if flag is False return the array there is no need to iterate another round of 'i'
                return;
            }

        }

    }

    public static void main(String[] args) {
        int [] a = {7,6,5,4,8};
        System.out.println("Unsorted Array :");
        for (int i : a){
            System.out.print(+i+ "");
        }
        System.out.println();
        System.out.println("Sorted Array :");
        bubbleSort(a);
        for (int i : a){
            System.out.print(i+ "");
        }
    }
}
