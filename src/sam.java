
public class sam {

	public static void main(String[] args) {
		
		int number = 12345;
		int length = 0;
		
		for(int i =1;number!=0;i++) 
		{
			number=number/10;
			length++;
		}
		System.out.println(length);
	}

}
