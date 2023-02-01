/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
    // data members for Course
    private int ID;
    private String name;
    private int code;
    
    // default constructor for Course
    Course() {
        ID = 0;
        name = "X";
        code = 0;
    }
    // overloaded constructor for Course
    Course(int d, String n, int cd) {
        ID = d;
        name = n;
        code = cd;
    }
    
    // setter for ID
    public void setID(int i) {
        ID = i;
    }
    
    // getter for ID
    public int getID() {
        return ID;
    }
    
    // setter for name
    public void setName(String n) {
        name = n;
    }
    
    // getter for name
    public String getName() {
        return name;
    }
    
    // setter for code
    public void setCode(int c) {
        code = c;
    }
    
    // getter for code
    public int getCode() {
        return code;
    }
}
