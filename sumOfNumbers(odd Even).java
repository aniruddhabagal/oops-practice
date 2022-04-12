import java.util.*;

class Main
{
    public static void main(String[] args)
    {

    ArrayList<Integer> al = new ArrayList<Integer>();  // creating array list


    for (int i = 20; i <= 30; i++)
    {
        al.add(i);  // adding numbers to arraylist
	}
	
    Integer ia[] = new Integer[al.size()];   // creating array
    ia = al.toArray(ia);                     // Getting Array from an ArrayList
    
    int even = 0, odd = 0, oddCount = 0, evenCount = 0;
 
    for (int i : ia) {                       // Using for-each loop
        if (i % 2 == 0)
        {
            even += i;
            evenCount++;
        }    
        else{
            odd += i;
            oddCount++;
        }
    }
    
    float oddAvg = odd/oddCount;
    float evenAvg = even/evenCount;
    
    System.out.println("Sum of Odd numbers is: " + odd);
    System.out.println("Avg of Odd numbers is: " + oddAvg);
    System.out.println("Sum of Even numbers is: " + even);
     System.out.println("Avg of Even numbers is: " + evenAvg);
     
    }
}



