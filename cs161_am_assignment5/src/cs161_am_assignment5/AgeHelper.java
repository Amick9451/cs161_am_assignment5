//HEADER
//Program Name: Assignment5_AgeHelperClass
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 02/10/2021
//Description: AgeHelper class checks assigned age values to make sure its between 0 and 125. Otherwise it tells the user
//the age is invalid



//PSUEDOCODE
/**Program Start
 * Create AgeHelper
 * create setAge method
 * make if statement with Or gate that narrows field of values to between 0 and 125
 * create else statement
 * else statement returns age
 * Program End
 */

package cs161_am_assignment5;

public class AgeHelper {

	public static int setAge(int age) {
	 if(age > 125 || age < 0) {
			throw new IllegalArgumentException("Error: Invalid Age");
		} else {
			return age;
		}
}
}
//FOOTER
//NO EXPECTED OUTPUT