package basicProgram_Java_2;

public class Program_11 {
	
	public static void main(String[] args) {
//  11. Declare a six digit number and print each number separately.
		int number=950323;
		for(int i=0;number>0;i++) {
			i=number%10; //last digit find
			number=number/10; //last remove 
			System.out.println(i);
		}
		}	
	}
		
		
		



