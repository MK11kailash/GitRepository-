package Above_Avg_Programs_4;

import java.util.Scanner;

public class program_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Take input from user");
		int a = sc.nextInt();
		
		System.out.println("Take input from user");
		int b = sc.nextInt();
		
		
		System.out.println("1-->addition;2-->substraction;3.-->multi;4.-->divide");
		System.out.println("Enter your choice Number");
		int calulator=sc.nextInt();
		
		switch(calulator){
			
		case 1:
			System.out.println(a+b);
		break;
		case 2:
			System.out.println(a-b);
		break;
		case 3:
			System.out.println(a*b);
		break;
		case 4:
			System.out.println(a%b);
		break;
		default :{
				System.out.println("please select correct option");
			}
			
		}
	}

}
