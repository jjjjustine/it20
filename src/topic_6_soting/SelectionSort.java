/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_6_soting;
import java.util.Scanner;
/**
 *
 * @author Jane Justine
 */
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

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

        // Perform Selection Sort
        selectionSort(arr);

        // Stop the timer
        long endTime = System.currentTimeMillis();

        // Display the sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        // Calculate and display runtime in seconds
        long elapsedTimeInSeconds = (endTime - startTime) / 1000;
        System.out.println("Selection sort runtime: " + elapsedTimeInSeconds + " seconds");
    }
}