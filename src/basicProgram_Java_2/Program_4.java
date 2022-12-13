package basicProgram_Java_2;

public class Program_4 {
	
	public static void main(String[] args) {
//		4. Create an array of 5 elements of integer type and sum all the numbers
		
		int arr []=new int [5];
		arr [0] = 5;
		arr [1] = 10;
		arr [2] = 15;
		arr [3] = 20;
		arr [4] = 25;
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of the all elements : "+sum);
		//System.out.println("sum of the all elements : "+arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);

	}

}
