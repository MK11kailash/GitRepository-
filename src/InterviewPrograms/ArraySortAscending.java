package InterviewPrograms;

public class ArraySortAscending {

	public static void main(String[] args) {
		
//	Program: Write a program to sort the array in ascending order.
		int arr[]=new int[] {7,5,4,1,2,3,6};
		int temp=0;
		System.out.println("Original Array: ");
		for(int e:arr) {
			System.out.print(e);
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("Ascending order:");
		for(int i= 0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
