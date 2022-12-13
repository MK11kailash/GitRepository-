package Logic_Builder_Programs_3;

public class Program_5 {

	public static void main(String[] args) {
// 5) Write a program to sum even numbers in   1-20 using a while loop.
		int sum=0;
		for(int i=1; i<=20;i++) {
		if(i%2==0) {
		System.out.println(i);
		sum=sum+i;
		}
		}
		System.out.println(sum);
	    }

        }
