
public class PratamiterizeConstuctor {
//	int id;
//	String name;
//	creating prameterized cunstructor...
	 void Student(int id,String name) {
		
		//System.out.println("Calling Prarameterized constructor:");
		System.out.println("StudentId: "+id);
		System.out.println("Name: "+name);
	}
	 void Student(int age, int rollNumber) {
		 System.out.println("age: "+age);
		 System.out.println("rollNumber: "+rollNumber);
	 }

	public static void main(String[] args) {
//		creating object and passing value..
	PratamiterizeConstuctor para =new PratamiterizeConstuctor();
	para.Student(111, "kailash");
	para.Student(121,"sumitsir");
	para.Student(25, 01);
	
		

	}

}
