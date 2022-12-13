import java.util.ArrayList;

public class ConstuctorInArray {
	
//	 Question interview : can we pass ArrayList to Constructor: Yes we can pass ArrayList as a argument to constructor
	
	
	public ConstuctorInArray(ArrayList myList) {
		
	}

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();

		myList.add("one");

		myList.add("two");

		myList.add("three");
			
		
	ConstuctorInArray call =new ConstuctorInArray(myList);

	System.out.println(myList);
	}

    }
