package Logic_Builder_Programs_3;

public class Program_4 {

	public static void main(String[] args) {
// 4) from 1-100 print all numbers which are either divisible by 5 or 3
		
		for(int i=1; i<=100; i++) {
		if(i%3==0 ) {	
		System.out.println("divisible by 3: "+i);	
		}
		else if(i%5==0) {
		System.out.println("Divisible by 5: "+i);
		}
		}
	    }
        }
