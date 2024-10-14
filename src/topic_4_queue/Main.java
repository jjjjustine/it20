/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_4_queue;

import java.util.Scanner;

/**
 *
 * @author Jane Justine
 */
public class Main {
    public static void main(String[] args) {
    Queue customerQueue = new Queue();
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve customer");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextLine();

        }   
    }
}
