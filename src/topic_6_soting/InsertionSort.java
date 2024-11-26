/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_6_soting;
import java.util. Scanner;
/**
 *
 * @author Jane Justine
 */
public class InsertionSort {
       // Insertion sort method
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Print the array elements
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept array size from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Accept array elements from the user
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display the original array
        System.out.println("Original array:");
        printArray(arr);

        // Start the timer for sorting
        long startTime = System.currentTimeMillis();
        
        // Perform Insertion Sort
        insertionSort(arr);

        // Stop the timer
        long endTime = System.currentTimeMillis();

        // Display the sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        // Calculate and display runtime in seconds
        long elapsedTimeInSeconds = (endTime - startTime) / 1000;
        System.out.println("Insertion sort runtime: " + elapsedTimeInSeconds + " seconds");
    }
}