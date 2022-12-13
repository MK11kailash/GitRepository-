package basicProgram_Java_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program_9 {
	public static void main (String[] args) {
		
// 9. Create an array and print second largest number.
		
		int arr [ ] = {100,200,503,5009,504,600};
		int number=arr.length-1;
		Arrays.sort(arr);
		System.out.println("Array sorting "+Arrays.toString(arr));
		System.out.println("SeconndMax Index Number");
		System.out.println(number);
		
	}
    }
