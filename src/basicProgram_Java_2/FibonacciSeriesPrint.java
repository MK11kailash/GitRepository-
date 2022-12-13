package basicProgram_Java_2;

public class FibonacciSeriesPrint {
	public static void print(int n) {
		int n1=0;
		int n2=1;
		int n3=1;
		for(int i=0; i<n; i++) {
		System.out.println(n1+" ");
		n1=n2;
		n2=n3;
		n3=n1+n2;
		}
	    }
	public static void main(String[] args) {
		int n =10;
		FibonacciSeriesPrint.print(n);
		
		System.out.println("_________________________");
		
		int num1=0;
		int num2=1;
		int num3=1;
		int number=5;
		for(int i =0; i<=number; i++)
		{
		System.out.println(num1+" ");	
		num1=num2;
		num2=num3;
		num3=num1+num2;
		}
	}

}
