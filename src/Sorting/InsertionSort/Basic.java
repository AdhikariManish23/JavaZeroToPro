package Sorting.InsertionSort;

public class Basic {

//  Method 1:
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
//                Swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }
        }
    }


//  Method 2: (Optimised CODE)
//            for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];  // The element to be positioned
//            int j = i - 1;
//
//            // Shift elements of arr[0..i-1] that are greater than key to one position ahead
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j]; // Shift element to the right
//                j--;
//            }
//            arr[j + 1] = key; // Insert the key at the correct position
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {1,7,4,9,5,6};
        insertionSort(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

}