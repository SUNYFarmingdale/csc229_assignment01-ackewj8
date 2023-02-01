
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
     public static void main(String[] args) {
         // default constructor for Course
        Course c = new Course();
        
        // setting the values (default constructor)
        c.setID(214);
        c.setName("John Doe");
        c.setCode(713);
        
        // printing the values (default constructor)
        System.out.println("Default ID: " + c.getID()); 
        System.out.println("Default Name: " + c.getName()); 
        System.out.println("Default Code: " + c.getCode()); 
        
        // overloaded constructor for Course
        Course a = new Course(543, "Jane Doe", 925);
        
        // printing the values (overloaded constructor)
        System.out.println("Overloaded ID: " + a.getID());
        System.out.println("Overloaded Name: " + a.getName());
        System.out.println("Overloaded Code: " + a.getCode());
    }
    
}
