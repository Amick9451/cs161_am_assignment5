//HEADER
//Program Name: Assignment5_MainClass
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 02/10/2021
//Description: A main class that uses the other classes to meet requirements a-i on Assignment 5


//PSUEDOCODE
//Program start
//example person created
//print all info out to console (first name, last name, age)
//print out just first and last name
//print out just age
//change birthday
//check age has updated
//program end

package cs161_am_assignment5;

import java.time.LocalDate;

public class Main{
	
	
	public static void main(String[] args) {
	
		Person p = new Person("John","DingleHeim",42); // new Persons doesn't accept numbers
		//in first or last name
		// age in new Person cannot be set above 125 or below 0
		
		System.out.println(p.getInfo());
		System.out.println(p.getFullName());
		System.out.println(p.getAge());
		p.changeBirthdate(LocalDate.of(1998, 11, 19));
		System.out.println(p.getAge()); //age is correctly calculated with change of birthdate
	}
}	

//FOOTER
// John DingleHeim 42
//John DingleHeim
//42
//23
//