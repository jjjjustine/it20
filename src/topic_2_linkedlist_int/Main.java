/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_2_linkedlist_int; 

import java.util.Scanner;

/**
 *
 * @author ITLAB1-PC24-STUDENT
 */
public class Main { 
    public static void main(String[] args) { 
     LinkedList list = new LinkedList();
     
       Scanner sc = new Scanner(System.in); 

        // Adding elements to the list
        System.out.println("Enter 5 numbers you want to add: ");
        // Loops five times to add numbers, and then adds user input to the linked list.
        for (int i = 0; i < 5; i++) { 
            list.add(sc.nextInt());
        }
        
        System.out.println("Current Linked List:"); 
        list.printList();
        System.out.println(""); 
        
     // delete
        boolean validInput = false;
         // Loops until a valid input is true.
        while (!validInput) { 
            System.out.print("Enter a number that you want to delete: ");
            
            // Reads the number to delete.
            int num6 = sc.nextInt();
            
            // Check if the number exists in the list
            if (existsInList(list, num6)) {
                list.deleteByValue(num6); 
                System.out.println("You successfully deleted: " + num6);
                System.out.println("");
                //if valid ang input ma human na ang loop
                validInput = true; 
            } //if still dili valid ang input sa user
            else {
                System.out.println("Value " + num6 + " not found in the list. Please enter again.");
            }
        }
          // Displays the updated linked list.
        System.out.println("Current Linked List:"); 
        list.printList(); 

     // Move/Swap 
        boolean swapValid = false; 
        while (!swapValid) { 
            System.out.println();
            System.out.println("Swapping node, start from 0");
            System.out.print("Enter two index that you want to swap: "); 
            // Reads first index to swap.
            int num7 = sc.nextInt(); 
            // Reads second index to swap.
            int num8 = sc.nextInt(); 

            // Checks if indices are valid.
            if (isValidIndex(list, num7) && isValidIndex(list, num8)) { 
                list.moveNodePointer(num7, num8); 
                 // Displays the list after swap.
                System.out.println("Current Linked List after swapping:"); 
                list.printList(); 
                //if valid ang index
                swapValid = true; 
            } 
            // id dili valid ang index
            else {
                System.out.println("Invalid indices. Please enter again."); 
            }
        }
    }
            
     private static boolean existsInList(LinkedList list, int value) {
        Node current = list.head; 
        // Iterates through the list.
        while (current != null) { 
            // Checks if current node's data matches the value.
            if (current.data == value) { 
                // Returns true if found.
                return true; 
            }
            current = current.next;
        }
        // Returns false if not found.
        return false;
    }
     private static boolean isValidIndex(LinkedList list, int index) {
        int size = getSize(list); 
        // Returns true if index is valid.
        return index >= 0 && index < size;
    }

    private static int getSize(LinkedList list) { 
        int size = 0; 
        Node current = list.head; 
        while (current != null) { 
            size++; 
            current = current.next; 
        }
        // Returns the total size of the list.
        return size; 
    }
}

