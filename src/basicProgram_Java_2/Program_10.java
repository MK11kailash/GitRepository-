package basicProgram_Java_2;

public class Program_10 {
	
	public static void main(String[] args) {
//	 10. Enter the birth year and check if the year is leap or not.
//Logic: what is leap year : A normaly year have 365 days but leap yr. has 366 days
// leap years are any year that can be exactly divided by 4 only
		    int a =2024; 
	        int b=4;
			if(a%400==0) {
				System.out.println("This is leap year: "+a);
			}
			else if(a%100==0) {
				System.out.println("This is not leap: "+a);
			}
			else if(a%b==0) {
				System.out.println("This is leap year: "+a);
			}
			else {
				System.out.println("This is not leap year: "+a);
			}
		    }
			}
			