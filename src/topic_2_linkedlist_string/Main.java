/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_2_linkedlist_string;

/**
 *
 * @author ITLAB2-PC12-STUDENT
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        // Adding initial name
        list.add("Mark");
        list.add("Kristine");
        list.add("Pauline");
        list.add("Katelyn");
        list.add("Justine");
        list.add("Jane");
        
         boolean running = true;
        while (running) {
            System.out.println("\nCurrent list of names:");
            System.out.println("----------------------------");
            list.ShowList();

            System.out.println("----------------------------");
            System.out.println("Choose an option:");
            System.out.println("1. Add a name");
            System.out.println("2. Delete a name");
            System.out.println("3. Move or Swap a name");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
             switch (choice) {
                case 1:
                    System.out.print("Enter a name to add: ");
                    String nameToAdd = sc.nextLine();
                    list.add(nameToAdd);
                    System.out.println("Name added.");
                    break;
                    
                     case 2:
                    System.out.print("Enter a name to delete: ");
                    String nameToDelete = sc.nextLine();
                    System.out.print("Are you sure you want to delete \"" + nameToDelete + "\"? (yes/no): ");
                    String confirmation = sc.nextLine();
                    if (confirmation.equalsIgnoreCase("yes")) {
                        list.deleteByValue(nameToDelete);
                        System.out.println("Name deleted.");
                    } else {
                        System.out.println("Deletion canceled.");
                    }
                    break;
                    
                case 3: // Move or Swap
                    System.out.print("Enter the first index: ");
                    int index1 = sc.nextInt();
                    System.out.print("Enter the second index: ");
                    int index2 = sc.nextInt();
                    System.out.print("Do you want to swap? (yes/no): ");
                    String confirm = sc.next();
                    boolean swap = confirm.equalsIgnoreCase("yes");
                    list.moveOrSwapNodes(index1, index2, swap);
                    System.out.println(swap ? "Name swapped." : "Name moved.");
                    break;

                    case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
        System.out.println("Goodbye.");
        
        }
    }    