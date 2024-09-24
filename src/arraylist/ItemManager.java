/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
/**
 *
 * @author Jane Justine
 */
import java.util.ArrayList;
public class ItemManager {
    
    private ArrayList<String> items;
    public ItemManager(){
    items= new ArrayList<>();
    }
    
    //this will display items on the array list
      public void displayItems() {
        System.out.println("Items in the list: " + items);
    }
      //this will add items on the array list
      public void addItems(String item) {
        items.add(item);
        System.out.println("You Inserted: " + items);
    }
       //this will update the items
    public void updateItem(int index, String newItem) {
        if(index >= 0 && index < items.size()) {
            String oldItem = items.set(index, newItem);
            System.out.println("You updated: " + oldItem + " to " + newItem);
        } else {
            System.out.println("Index out of bounds");
        }
    }
    }

