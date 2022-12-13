
public class Q1 {

	String name;
	public static void main(String[] args) {
		
		String str="pizza order number is 2237468";
		String s[] = str.split(" ");
		String s1 = s[s.length-1]; 
		
		for(int i =s1.length()-1; i>=0; i--) 
		{
		System.out.print(s1.charAt(i));
		}
		
	    }

        }
