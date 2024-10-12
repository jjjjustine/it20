/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_2_linkedlist_int;

/**
 *
 * @author ITLAB1-PC24-STUDENT
 */
public class LinkedList {
    public Node head; 

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
     // Method to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        // If the head needs to be removed
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next; 
                return;
            }
            current = current.next;
        }
            System.out.println("Value " + value + " not found in the list.");
    }
     public void moveNodePointer(int index1, int index2) {
      if (head == null || index1 == index2) return;

    Node node1 = head, prev1 = null;
    Node node2 = head, prev2 = null;

    // Find node1 and its previous node
    for (int i = 0; node1 != null && i < index1; i++) {
        prev1 = node1;
        node1 = node1.next;
    }

    // Find node2 and its previous node
    for (int i = 0; node2 != null && i < index2; i++) {
        prev2 = node2;
        node2 = node2.next;
    }

    // If either node is null, return
    if (node1 == null || node2 == null) return;

   
    if (prev1 == node2) {
        // node1 is before node2
        prev1.next = node2.next; 
        node2.next = node1; 
        if (index1 == 0) {
            head = node2; 
        } else {
            prev2.next = node2; 
        }
        return;
    } else if (prev2 == node1) {
        prev2.next = node1.next; 
        node1.next = node2;
        if (index2 == 0) {
            head = node1; 
        } else {
            prev1.next = node1; 
        }
        return;
    }

    if (prev1 != null) {
        prev1.next = node2; 
    } else {
        // Update head if node1 is at the head
        head = node2; 
    }

    if (prev2 != null) {
        prev2.next = node1; 
    } else {
        // Update head if node2 is at the head
        head = node1; 
    }

    // Swap next pointers
    Node temp = node1.next;
    node1.next = node2.next;
    node2.next = temp;
}
}
