package day08.practice;
import java.util.*;

public class Department {
	
	public static boolean categorizeDepartment(String[] arr) throws IllegalArgumentException {
	
		
	Map<String, List<String>> departmentEmployees = new TreeMap<>();
	
	//If the array is null throw an Exception
	if(arr == null){
		throw new IllegalArgumentException("Array cannot be a null");
	}
	
	//Iterating each elements from arr
	for(String ele : arr){
		
		//Validateing the array elements
		if(ele == null || ele.isEmpty()){
			throw new IllegalArgumentException("Input cannot be a null or empty");
		}
		
		String[] arr2 = ele.split(",");
		
		if(arr2.length != 2){
			throw new IllegalArgumentException("Input must have department and employee name");
		}
		
		String department = arr2[0].trim();
		String employee = arr2[1].trim();
		
		 if(departmentEmployees.containsKey(department)){
			 departmentEmployees.get(department).add(employee);
		 }
		 else{
			 List<String> employees = new ArrayList<>();
			 employees.add(employee);
			 departmentEmployees.put(department, employees);
		 }
	}
	
    for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
        String department = entry.getKey();
        List<String> employees = entry.getValue();
        Collections.sort(employees);
        
        System.out.println(department + ": " + String.join(", ", employees));
    }
    
    return true;
	
}
	public static void main(String[] args) {
		
		String[] arr = {"HR,Ram","HR, Suresh","IT, Basker","IT, Joseph","Admin, Sundar"};
		
		categorizeDepartment(arr);
		
}
}