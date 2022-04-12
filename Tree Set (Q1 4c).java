/*
Qpaper-1 4c: Analyze the below code and complete the program to add 5 elements and print all the elements of the collection.
*/

import java.util.*; 

class Main {
    public static void main(String args[]) {
        // Create a tree set.
        TreeSet<String> ts = new TreeSet<String>();
        // Add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        
        System.out.println(ts);
    }
}
