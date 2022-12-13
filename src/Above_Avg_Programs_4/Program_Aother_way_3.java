package Above_Avg_Programs_4;

public class Program_Aother_way_3 {
	public static void main(String[] args) {
//		3) Take string input from user and count number of words in the same

	int number=1;
	
	String str = "java is object oriented programing language";
	
	for(int i=0; i<str.length();i++)
	{
	if(str.charAt(i)==' ') 
	{
	number=number+1;	
	}	
	}
	System.out.println(number);
    }
    }
