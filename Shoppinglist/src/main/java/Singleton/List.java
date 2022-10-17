/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Harish
 */
public class List {
    Scanner s= new Scanner(System.in);
    // initialize the singleton variable
    private static List single_instance = null;
    
    // empty constructor for whatever
    private List() {}

    // get the singleton instance, or create one if it doesnt already exist
    public static List getInstance(){
        if (single_instance == null)
            single_instance = new List();
        return single_instance;
    }
    
    // the actual array
    private static ArrayList<String> shoppinglist=new ArrayList();
    
    // getter
     public ArrayList<String> getList(){
        return shoppinglist;
      }

     // add stuff and return the new list
    public void addItem(){
        
        for(int i=0;i<10;i++){
            String item_name=s.nextLine();
           shoppinglist.add(item_name);
        }
       
        System.out.println(shoppinglist);
    }

    // remove stuff and return the new list
    public ArrayList<String> deleteItem(int index){
        shoppinglist.remove(index);
        return shoppinglist;
    }
}

