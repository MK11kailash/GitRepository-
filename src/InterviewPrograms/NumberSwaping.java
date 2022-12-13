 package InterviewPrograms;

public class NumberSwaping {
	
	public static void main(String[] args) {
//	Program: Write a Java program to swap two numbers without using third variable?
		int x =100;
		int y=200;
		System.out.println("Before Swaping Numbers: x "+x+" y "+y);
		x=x+y;
	//	System.out.println(x);//300
		y=x-y;
	//	System.out.println(y);//100
		x=x-y;
	//	System.out.println(x);//200
		System.out.println("After Swaping Number: x "+x+" y "+y);
	}

}
