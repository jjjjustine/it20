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
        
    }
}
