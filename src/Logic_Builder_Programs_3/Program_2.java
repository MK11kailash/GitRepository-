package Logic_Builder_Programs_3;

import java.util.Arrays;

public class Program_2 {

	public static void main(String[] args) {
//2) create an integer array, find the maximum number in the array 
				int [] arr = {10,20,45,40,5,70,85,15,75};
				int number = arr.length-1;
				Arrays.sort(arr);
				System.out.println("Array sorting: "+Arrays.toString(arr));
				System.out.println("Position of index number : "+number);
				System.out.println("maximum number in array: "+arr[8]);
				
				System.out.println("___________________________________");//Other way
				
				int [] array = {100,250,154,1,1687,254,245,177};
				int max = array[0];
				for(int i = 0; i<array.length; i++) {
				if(array[i]>max) {
				max = array[i];
				}
				}
				System.out.println("Maximum number in the array: "+max);
	            }
                }
