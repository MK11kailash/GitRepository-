package InterviewPrograms;

public class StringReverseProgram {
	
	public static void main(String[] args) {
//Program: WAP to print given string in reverse using loop
		
		String str = "I am Happy";
		for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
		}
		
	}

}
