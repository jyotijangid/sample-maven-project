package com.sapient.trg.pl;

import java.time.LocalDate;

import com.sapient.trg.service.Person;

public class App 
{
    public static void main( String[] args ){
    	//creating instance/object of a class
    	//ClassName objectName = new ClassName();
    	
    	Person person1 = new Person();
    	person1.setPersonId(1);
    	person1.setFirstName("Ravi");
    	person1.setFirstName("Kumar");
    	System.out.println(person1.getPersonId()+","+person1.getFirstName()+","+person1.getLastName());
    	
    	
    	Person person2 = new Person(2, "Virat", "Kolhi", LocalDate.of(1999, 12, 12) , 123457891L);
    	System.out.println(person2.getPersonId()+","+person2.getFirstName()+","+person2.getLastName()+","+person2.getMobile());
    	
    }
}
