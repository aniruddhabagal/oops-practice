/*
  Q-Paper 2: Analyze the below code and complete the program to find the previous and next elements by using an iterator to the collection.
*/


import java.util.*; 

class Main {
    
    public static void main(String args[]) {

        ArrayList<Integer> al = new ArrayList<Integer>();       // Create an array list.
        
        for(int i=1; i<=5; i++){
            al.add(i);
        }
    
        
        ListIterator<Integer> itr = null;          // Use iterator to display contents of al.
        itr = al.listIterator();
        
        System.out.println("In actual order :"); 
        
        while (itr.hasNext()) {                 // Printing in Actual order using next() method
            
            System.out.println(itr.next() );  
        }  
        
        System.out.println("In reverse order :");  
            
        while (itr.hasPrevious()) {
            
            System.out.println(itr.previous() );      // Printing in Actual order using previous() method
        } 
        
    }
}
