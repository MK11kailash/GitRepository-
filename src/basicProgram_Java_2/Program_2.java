package basicProgram_Java_2;

public class Program_2 {

	public static void main(String[] args) {
//		2. Declare three integer variables and check which number is smallest
		 int a = 110;
		 int b= 10;
		 int c = 205;
		 if((a<b) && (c>a)) {
			System.out.println("a is Samllest: "+a);
		 }
		 else if(b<c) {
			 System.out.println("b is Samllest: "+b);
		
		 }
		 else {
			 System.out.println("c is Samllest: "+c);
		 }
	}
}