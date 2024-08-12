package Sorting.SelectionSort;

public class Basic {

    static void SelectionSort(int[] arr ){
        int n = arr.length;

        for(int i = 0 ; i <n-1 ; i++){  // i represent the current index

            // Find the Minimum Element in the Unsorted Array
            int min_Index = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min_Index]){
                    min_Index = j;
                }
            }
        // swap current element and minimum element  -> current Index i will have correct element
        // arr[min_index] , arr[i]
           int temp = arr[i];
            arr[i] = arr[min_Index];
            arr[min_Index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,6,2,9,1,5};
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
