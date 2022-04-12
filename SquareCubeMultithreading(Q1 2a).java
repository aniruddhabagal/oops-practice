/*
QPaper-1 2a: Develop a Java program to find square and cube of a number using multithreading.
*/

import java.util.*;

class NewThread implements Runnable{
    
    String name;
    Thread t;
    int num;
    
    NewThread(String tname, int n){
        
        name = tname;
        num = n;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        
        t.start();
        
    }
    
    public void square(){
        
        int sq = 0;
        sq = num*num;
        
        System.out.println("Square of the " + num + " is: " + sq);
    }
    
    public void cube(){
        
        int cub = 0;
        cub = num*num*num;
        System.out.println("Cube of the " + num + " is: " + cub);
    }
    
    
    public void run(){
        try{
            
            square();
            cube();
            Thread.sleep(1000);
            
        } catch(InterruptedException e){
            System.out.println(name + "Interrupted");
        }
        System.out.println("Exiting: " + name);
    }
}

public class Main {
    public static void main(String[] args)
    {
       new NewThread("One", 2);
       new NewThread("Two", 3);
    //   new NewThread("Two");
       
       try{
            System.out.println("Main Thread Starting");
            Thread.sleep(10000);
       }
       catch(InterruptedException e){
           System.out.println("Main Interrupted");
       }
       
       System.out.println("Main exiting");
    }
}




/*
Outut:

New Thread: Thread[One,5,main]
New Thread: Thread[Two,5,main]
Main Thread Starting
Square of the 2 is: 4
Square of the 3 is: 9
Cube of the 2 is: 8
Cube of the 3 is: 27
Exiting: One
Exiting: Two
Main exiting

*/
