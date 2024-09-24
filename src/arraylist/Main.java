/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.Scanner;

/**
 *
 * @author Jane Justine
 */
public class Main {
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
 ItemManager list = new ItemManager();  
  String item, newItem, finditem;
        int index;
        //gi tawag niya ang display items sa sub class nga ItemManager
        list.displayItems();
    
        System.out.println("Enter an item you want to add: ");
        item = sc.nextLine();
        
        //mabutang diri ang gi add nga name
        list.addItems(item);
          System.out.println(".........................");
          
          //mabutang diri gina update or change ang item
           System.out.println("Enter an index number that you want to change: ");
        index = sc.nextInt(); 
        
        sc.nextLine();
        
        System.out.println("Enter a new name that you want to change on that index number: ");
        newItem = sc.nextLine();
        
        list.updateItem(index, newItem);
        list.displayItems();
        System.out.println(".........................");
        
        //mabutang diri ang gina pangita niya ang item
        System.out.println("Enter a name that you want to find: ");
        finditem = sc.nextLine();
        
        list.findItem(finditem);
        list.displayItems();
        System.out.println(".........................");

        //diri para delete
        System.out.println("Enter an index number to delete: ");
        int newIndex = sc.nextInt();
        
        list.deleteItem(newIndex);
        list.displayItems();
        sc.close();
}
}