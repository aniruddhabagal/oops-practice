/*
Qpaper-2 4a: Develop a program to store 5 integer numbers and to delete the last number using Linkedlist.	10	L3	CO2
*/

import java.util.*; 

class Main {

    public static void main(String[] args)
    {
        
        LinkedList<Integer> ll = new LinkedList<Integer>();    // Create a linked list.
        
        // Add elements to the linked list.
        
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
       
        System.out.println("contents of ll before operation: " + ll);
        
        ll.addFirst(0);     // Add first element
        
        ll.removeLast();    // Remove last element.
       
        System.out.println("ll after Operation: " + ll);
    }
}
