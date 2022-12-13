package InterviewPrograms;

import java.util.Arrays;

public class DuplicateElementArray {

	public static void main(String[] args) {
//Write code to filter duplicate elements from an array and print as a list?
		
		int arr [] = new int [] {5,3,4,5,4,6,5,3,2,1,7,8};
		Arrays.sort(arr);
		int  temp []  = new int [arr.length];
		int j = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] !=arr[i+1]) {
			temp[j]=arr[i]; 
			j++;	
			}	
		}
		temp[j]=arr[arr.length-1];
		System.out.println("After remove duplicate:");
		for(int i =0; i<=j;i++){
			System.out.println(temp[i]);
		}
		

	}

}
