//HEADER
//Program Name: Assignment5_PersonClass
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 02/10/2021
//Description: Person class with all listed attributes and a getter and setter for each attribute. 


//PSUEDOCODE
/**
 * Program Start
 * create first name attribute
 * create last name attribute
 * create age attribute
 * create birthdate attribute
 * assign person p
 * 
 * create person constructor
 * assign each attribute a letter var
 * insert letter var into params
 * insert repeatcode.setname checker that checks names are only letters for firstname
 * repeat for last name
 * insert agehelper.setAge that checks age is between 0 and 125
 * create getter for all attributes
 * create first and last name getter
 * create get all info getter 
 * create setters for all attributes
 * create birthdate getter
 * create birthdate modifier
 * create private utility method calculateage which uses birthdate to give age
 * create change info modifier that allows for all three attributes to be changed
 * Program End
 */

package cs161_am_assignment5;

import java.time.LocalDate;

public class Person extends Main {

	//attributes

	String firstName;
	String lastName;
	int age;
	LocalDate birthdate;
	Person p;

Person(String n,String l,int a) {
	firstName=n;
	lastName=l;
	age=a;
	birthdate = LocalDate.of(1979, 01, 01);
		 RepeatCode.setName(n);
		 RepeatCode.setName(l);
		 AgeHelper.setAge(a);
}


//Method

//Getter


public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public int getAge() {
	return age;
}

//
public String getFullName() {
	return firstName + " " + lastName;	

}

public String getInfo() {
	return firstName + " " + lastName + " " + age;
}
////setter
public void setFirstName(String a) {
	firstName=a; 
}
//
public void setLastName(String b) {
	lastName=b;
}

//public void setAge(int c){
//	age=c;
//}

//modifiers
	public String getBirthdate() {
		return birthdate.toString();
	}
	
	
	public void changeBirthdate(LocalDate d) {
		birthdate=d;
		age = calculateAge(d);
	}
	
	private int calculateAge(LocalDate d) {
		return LocalDate.now().getYear() - d.getYear();
	}
	
	
	public void changeInformation(String a, String b, int c) {

}

		
}
		

//FOOTER
//N/A


	

