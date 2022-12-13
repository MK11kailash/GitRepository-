package Logic_Builder_Programs_3;

public class ArraySortingLogic {

	public static void main(String[] args) {
		// 
		int Num = 0;
		
		int arr [] = {100,200,503,5009,504,600};
		
		for(int i=0; i<arr.length; i++)
		{
		for(int j=i+1; j<arr.length; j++) 
		{
		if(arr[i]>arr[j]) 
		{
		Num = arr [i];
		arr[i] = arr[j];
		Num = arr[j] ;
		}
		}
		}
		System.out.println(Num);
	    }
        }
