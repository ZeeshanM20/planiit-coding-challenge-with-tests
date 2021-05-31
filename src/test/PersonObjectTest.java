package test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import people.Person;

public class PersonObjectTest {
	
	@Test 
	public void shouldCreatePersonAndReturnName() {
		String name = "Gary";
		String date = "08-06-1995";
		String nationality = "Indonesia";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(date, formatter); 
		
		Person person = new Person(name, dob, nationality);
		
		assertTrue(person.getName().equals(name));
	}

	@Test 
	public void shouldCreatePersonAndReturnDOB() {
		String name = "Gary";
		String date = "08-06-1995";
		String nationality = "Indonesia";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(date, formatter); 
		
		Person person = new Person(name, dob, nationality);
		
		System.out.println(person.getName());
		assertTrue(person.getDOB().equals(dob));
	}
	
	@Test 
	public void shouldCreatePersonAndRetunNationality() {
		String name = "Gary";
		String date = "08-06-1995";
		String nationality = "Indonesia";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(date, formatter); 
		
		Person person = new Person(name, dob, nationality);
		
		System.out.println(person.getName());
		assertTrue(person.getNationality().equals(nationality));
	}
}
