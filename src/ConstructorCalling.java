
public class ConstructorCalling {
	
//	default Cunstructor calling String:null,Integer:0 
	int id;
	public ConstructorCalling(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	String name;
	void Student(int i, String string) {
		System.out.println(name+" "+id);
	}

	public static void main(String[] args) {
		ConstructorCalling calling =new ConstructorCalling(11, "mk");
	
		calling.Student(11,"kk");
		
		
		
		
		

	}

}
