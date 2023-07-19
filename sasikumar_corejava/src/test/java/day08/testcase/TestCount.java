package day08.testcase;
import day08.practice.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestCount {
	
	String[] arr = {"Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider"};
	String[] arr2 = {null,""};
	
	@Test
	public void testArray(){
		Assertions.assertTrue(NameCount.Count(arr));
	}
	
	@Test
	public void testArrayNull(){
		try {
			NameCount.Count(null);
			Assertions.fail("validate failed");
		} catch (Exception e) {
			Assertions.assertEquals("Array cannot ba a null", e.getMessage());
		}
	}
	
	@Test
	public void testArrayElementNull(){
		try {
			NameCount.Count(arr2);
			Assertions.fail("validate failed");
		} catch (Exception e) {
			Assertions.assertEquals("Array elements cannot be a null", e.getMessage());
		}
	}
}
