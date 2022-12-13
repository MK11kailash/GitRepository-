package basicProgram_Java_2;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int arr[]= {20,22,24,21,25,23};
		int number=arr.length-1;//(enter number which you want the position this field to checking arrays max, small,secondMax etc..
		Arrays.sort(arr);
		System.out.println("ArraySort: "+Arrays.toString(arr));
		System.out.println("Index Number Of Array: "+number);
		

	}

}
