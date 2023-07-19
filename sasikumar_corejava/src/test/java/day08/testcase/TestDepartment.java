package day08.testcase;
import day08.practice.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestDepartment {
	
	String[] arr = {"HR,Ram","HR, Suresh","IT, Basker","IT, Joseph","Admin, Sundar"};
	
	@Test
	public void testArray(){
		
		Assertions.assertTrue(Department.categorizeDepartment(arr));
	}
	
	public void testnull(){
		
		try {
			Department.categorizeDepartment(null);
			Assertions.fail("validate failed");
		} catch (Exception e) {
			Assertions.assertEquals("", e.getMessage());
		}
	}
}
