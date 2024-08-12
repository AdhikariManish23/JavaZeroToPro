package Sorting.BubbleSort;

public class MoveZeros {
    static void solution(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1; i++){
            for(int j = i; j <n-i-1; j++){
                if(arr[j] == 0 && arr[j+1] != 0){
//                     swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,5,0,4,0,8,0,11,0,76};
        for(int p : arr){
            System.out.print(p+" ");
        }
        System.out.println();
        System.out.println("Move Zeros :");
        solution(arr);
        for(int p : arr){
            System.out.print(p+" ");
        }
    }
}
