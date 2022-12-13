package Logic_Builder_Programs_3;

public class Program_8 {

	public static void main(String[] args) {
		
//		8)Java program to print array in. Reverse order 
		
		int [] arr = new int[] {10,20,30,40,50};
		
		System.out.println("Original Array: ");
		
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println("Revrse Array : ");
		
		for(int i=arr.length-1; i>=0; i--) {
		System.out.println(arr[i]);
		}
	    }
        }


