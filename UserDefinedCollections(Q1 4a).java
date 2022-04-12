/*
  QPaper-1:  4.(a) Develop a program to store the name and address fields of a person using user defined collections.
*/

import java.util.*;

class Person
{
    int sNumber;
    String name;
    String address;
    
    Person(int sl, String n , String a)
    {
        sNumber = sl;
        name = n;
        address = a;
    }
}


public class Main
{
    public static void main(String[] args)
    {
        
        Person p1 = new Person(1, "Arun", "UP, India");
        Person p2 = new Person(2, "Rakesh", "JP Nagar, Mysore, India");
        Person p3 = new Person(3, "Krishna", "Tamil Nadu, India");
        
        ArrayList al=new ArrayList();           //creating arraylist
        al.add(p1);                             //adding Student class object
        al.add(p2);
        al.add(p3);
        
        System.out.println(al);
        
        //displaying arraylist
        
        System.out.println("The name and address of person " + p1.sNumber + ": " + p1.name + " - " + p1.address);
        System.out.println("The name and address of person " + p2.sNumber + ": " + p2.name + " - " + p2.address);
        System.out.println("The name and address of person " + p3.sNumber + ": " + p3.name + " - " + p3.address);
        
               
    }
}
