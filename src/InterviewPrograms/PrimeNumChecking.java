package InterviewPrograms;

public class PrimeNumChecking {

	public static void main(String[] args) {
		
//Program 9: Write a method to check prime no. in Java.
		
		int num=19;
		int count;
		count =0;
		for( int i=2; i<num;i++){//2, 2<7,2++-->3,4,5,6,7
		if (num%i==0)//7/2==0-->7/2=0 not
		{
		count++;//num/2=0++
		}
		}
		if(count==0){
		System.out.println(" this is prime");
		}
		else {
		System.out.println(" this is not prime no");
		}
	    }
	    } 

		

	

	
	
