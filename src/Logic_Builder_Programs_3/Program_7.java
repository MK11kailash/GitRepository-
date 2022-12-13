package Logic_Builder_Programs_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_7 {

	public static void main(String[] args) {
// 7)Create an array and another integer variable. Verify if integer variable value is present in an array or not. 
		
		Integer [] array = new Integer [] {10,20,30,40,50,60,70,80};
		int num=10;
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		System.out.println(list.contains(num));
		
		} 
	    }


