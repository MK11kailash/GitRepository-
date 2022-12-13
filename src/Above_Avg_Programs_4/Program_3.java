package Above_Avg_Programs_4;

import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) { 
		
// 3) Take string input from user and count number of words in the same
		
		String str = new String();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String:");
		
		str = sc.nextLine();
		
		int count = 1;
		int i;
		
		for(i=0; i<str.length(); i++)
		{
	    if(str.charAt(i)==' ' && str.charAt(i+1)!=' ');// suppos: String= java is language:java is 4 char words java then one space then is
	    {
		count=count+1;
		}     
		}
		System.out.println("Number of words in the string:"+count);
	}
}
	    
