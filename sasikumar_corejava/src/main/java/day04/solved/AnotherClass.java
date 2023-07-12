//package day04.solved;
//
//public class AnotherClass extends Square {
//
//	public AnotherClass(double side_length) throws Exception {
//		super(side_length);
//		// TODO Auto-generated constructor stub
//	}  // This line will give compiler error
//
//}
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      str = str.toLowerCase();
      String[] arr = str.split("");
   		String[] lowercaseArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
      for(int i = 0; i < lowercaseArray.length; i++){
      for(int j = 0; j < arr.length; i++){
      if(!arr[j].equals(" ")){
      if(!(lowercaseArray[i].equals(arr[j]))){
      System.out.print("The string isn't a pangram");
      return;
      }
      }
      }
      }
      System.out.print("The string is a pangram");
	}
}