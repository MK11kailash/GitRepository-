package InterviewPrograms;

public class MaxValueArray {

	public static void main(String[] args) {
//Program : Write a Java program to find out the maximum values from an array?
		
		int arr[] = {12,15,10,84,45,85,47};
		int max= arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
