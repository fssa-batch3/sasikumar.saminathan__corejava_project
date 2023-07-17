package day08.practice;
import java.util.*;

public class Department {
	public static void main(String[] args) {
		
		String[] arr = {"HR,Ram","HR, Suresh","IT, Basker","IT, Joseph","Admin, Sundar"};
		
		Map<String, List<String>> departmentEmployees = new HashMap<>();
		
		for(String ele : arr){
			
			String[] arr2 = ele.split(",");
			
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
            System.out.println(department + ": " + String.join(", ", employees));
        }
	}
}
