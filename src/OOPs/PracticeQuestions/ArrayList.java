package OOPs.PracticeQuestions;

// Making Own Array List

import java.util.Arrays;

public class ArrayList {
     int[] arr = new int[2]; // Initial array with size 2
     int size = 0; // Tracks the number of elements added

    public void add(int ele) {
        // If the array is full, resize it to double its current length
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        // Add the element to the array and update size
        arr[size] = ele;
        size++;
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(6); // Add element 6
        arr.add(8); // Add element 8
        System.out.println("Array's Old Size: " + arr.size); // Print current size (2)
        arr.add(79); // Add element 79, triggers resizing of array
        System.out.println("Array Size After adding more elements: " + arr.size); // Print updated size (3)
        arr.add(45);
        System.out.println("Array Size After adding more elements: " + arr.size);
    }
}