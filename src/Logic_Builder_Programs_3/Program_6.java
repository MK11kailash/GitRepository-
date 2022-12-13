package Logic_Builder_Programs_3;

import java.util.Arrays;

public class Program_6 {

	public static void main(String[] args) {
// 6)Create integer array and find second largest number in an array 
		int [] array = {15,24,17,64,85,45};
		int SecondMax=array.length;
		Arrays.sort(array);
		System.out.println("Sorted Arrays: "+Arrays.toString(array));
		int SecondLarge=array[SecondMax-2];
		System.out.println("Second Large:: "+SecondLarge);

	}

}
