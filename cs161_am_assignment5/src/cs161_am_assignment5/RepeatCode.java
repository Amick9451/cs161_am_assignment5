//HEADER
//Program Name: Assignment5_RepeatCodeClass
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 02/10/2021
//Description: Repeatcode class checks assigned string to make sure its all letters



//PSUEDOCODE
/**Program Start
 * create set name method
 * insert if if else statement
 * assign first if to (n==null) parameter 
 * create throw illegal exception
 * assign second if to is letter
 * return n if is letter
 * create else statement that throws Illegal Argument
 * 
 * Create is letter boolean method
 * make it check if name is equal to only letters
 * Program End
 */
package cs161_am_assignment5;


public class RepeatCode {

    public static String setName(String n) {
        if(n == null) {
            throw new IllegalArgumentException("Unable to use empty names.");
        }
        
        if(isLetter(n)) {
            return n;
        }
        else {
            throw new IllegalArgumentException("The provided name is not allowed.");
        }
    }
	


	
	 public static boolean isLetter(String name) {
	        return name.matches("[a-zA-Z]+");
	    }
	 
	 /**
	  * Check if string only contains letters 
	  * 
	  * Retrieved from https://stackoverflow.com/questions/5238491/check-if-string-contains-only-letters
	  * 
	  * Illegal Argument Exception 
	  * 
	  * Retrieved from Andrew Burke's Four Door Dash 
	  */
}
//FOOTER
//NO EXPECTED OUTPUT
