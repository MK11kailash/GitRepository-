package basicProgram_Java_2;

public class Program_7 {
	public static void Fibonacci(int n) {
		
		int n1=0; //first this is strarting number 
		int n2 =1;// second number
		int n3=1;
	    for(int i=0; i<n; i++){ //loop checking coundition print and updating
	    System.out.println(n1+" ");//concatinating with spece 
	    n3=n2+n1;//swaping number n3=1+0=1
	    n2=n3; //n3 have =1 
	    n1=n2; //n1=n2 means now n1 and also n2 have=1  	
	    }
	}
	//}
	public static void main(String[] args) {
// 7. Create a fibonacci series upto 21 as below
//		1, 2 ,3 ,5,8,13,21
		int n=10;
		Program_7.Fibonacci(n);
		
		System.out.println("_________________________________");
		String str ="Kailash is my name";
		System.out.println("Origenal Sting: "+str);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("Reverse string: "+sb);
//		find of "i" second position of the string
		System.out.println(str.contains("i"));
		
		
	}
}
		
	

		

