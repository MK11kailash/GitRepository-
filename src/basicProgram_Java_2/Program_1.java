package basicProgram_Java_2;

public class Program_1 {

	public static void main(String[] args) {
//		1. Declare three integer variables and check which number is greatest.
		 int a = 110;
		 int b= 1110;
		 int c = 110;
		 if(a==b && a==c && b==c ) {
			 System.out.println("all equals");
		 }
		 else if(a>b && c<a) {  
			System.out.println("a is greter: "+a);
		 }
		 else if(b>c) {
			 System.out.println("b is greter: "+b);
		 }
		 else {
			 System.out.println("c is greter: "+c);
		 }
		



	}

}
