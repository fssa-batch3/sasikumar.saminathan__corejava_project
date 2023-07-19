package day08.testcase;
import day08.practice.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestCount {
	
	String[] arr = {"Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider"};
	
	@Test
	public void testArray(){
		Assertions.assertTrue(NameCount.Count(arr));
	}
}
