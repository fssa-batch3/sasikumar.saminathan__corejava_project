package day06.solved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class TestArrayListWithGenerics {
 
    public static void main(String[] args) {
         
        // Store the city names in the List ( use Generics )
        ArrayList<String> cityList  = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
         
        // Display the city names
        for (String cityName : cityList) {           
            System.out.println(cityName);           
        }
        
        
        String[] deptNames = new String[3];
        deptNames[0] = "CSE";
        deptNames[1] = "EEE";
        deptNames[2] = "MECH";
        List<String> list = Arrays.asList(deptNames);
        System.out.println(list);
 
    }
 
}