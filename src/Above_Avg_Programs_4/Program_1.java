package Above_Avg_Programs_4;

import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
//1)  Take two string input from user, concatenate those string and print
		
		System.out.println("Taking inpute from the user: ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st String: ");
		String str1 = sc.next();
		
		System.out.print("Enter 2nd String: ");
		String str2 = sc.next();
		
		String concatenate = str1+" "+str2;
		
		System.out.println("Concatenate two String Output:: ");
		System.out.println(concatenate);

	}

}
