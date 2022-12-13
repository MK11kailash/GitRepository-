package Above_Avg_Programs_4;

import java.util.Scanner;

public class program_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element");
		  String s=sc.nextLine();
            int count=0; 
		  
		  for(int i=0;i<s.length();i++) {
			  if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				  count++;
			  }
		  }
		  System.out.println(count);
		  
	}

}
