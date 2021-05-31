package test;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import people.Registry;

class RegistryTest {

	@Test 
	public void shouldCreateArrayofDuplicates() {
		Registry registry = new Registry();
		registry.readFile("people.txt");
		int arraySize = 7;
		
		
		assertTrue(registry.getFormatedDuplicates().size() == arraySize);
	}
	
	@Test 
	public void shouldGetAverageAge() {
		Registry registry = new Registry();
		registry.readFile("people.txt");
		int avgAge = 25;
		
		
		assertTrue(registry.getAverageAge() == avgAge);
	}
	
	@Test 
	public void shouldGetPeopleWithAgeLessThanN() {
		Registry registry = new Registry();
		registry.readFile("people.txt");
		int n = 25;
		int PeoplewithAgeLaeesThan25 = 3;
		
		assertTrue(registry.getPeopleWithAgeLessThan(n).size() == PeoplewithAgeLaeesThan25);
	}
	
	@Test 
	public void shouldGetUniqueCountries() {
		Registry registry = new Registry();
		registry.readFile("people.txt");
		int uniqueCountries = 8;
		
		assertTrue(registry.getUniqueCountries().size() == uniqueCountries);
	}
}
