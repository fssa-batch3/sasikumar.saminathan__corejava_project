package day08.testcase;
import day08.practice.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestDepartment {
	
	String[] arr = {"HR,Ram","HR, Suresh","IT, Basker","IT, Joseph","Admin, Sundar"};
	String[] arr2 = {"",""};
	String[] arr3 = {"HR,Ram,IT"};
	
	@Test
	public void testArray(){
		
		Assertions.assertTrue(Department.categorizeDepartment(arr));
	}
	
	@Test
	public void testNull(){
		
		try {
			Department.categorizeDepartment(null);
			Assertions.fail("validate failed");
		} catch (Exception e) {
			Assertions.assertEquals("Array cannot be a null", e.getMessage());
		}
	}
	
	@Test
	public void testElementNull(){
		
		try {
			Department.categorizeDepartment(arr2);
			Assertions.fail("validate failed");
		} catch (Exception e) {
			Assertions.assertEquals("Input cannot be a null or empty", e.getMessage());
		}
	}
	
	@Test
	public void testElementContains(){
		
		try {
			Department.categorizeDepartment(arr3);
			Assertions.fail("validate failed");
		} catch (Exception e) {
			Assertions.assertEquals("Input must have department and employee name", e.getMessage());
		}
	}
	
	
}
