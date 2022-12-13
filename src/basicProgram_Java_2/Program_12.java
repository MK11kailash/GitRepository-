package basicProgram_Java_2;

public class Program_12 {
	
	public static void main(String[] args) {
//		12. Enter your birthday , month and year in below format
//		06/03/1992
//		And perform summation until it reaches to one digit number
//		E.g. 06+03+1992 = 2001
//		Then do 2+0+0+1=3
//		I want final number as 3
		
		String str = "11/07/1993";
		String [] str1=str.split("/");		
	int a1 =Integer.parseInt(str1[0]);
	int a2 =Integer.parseInt(str1[1]);
	int a3 =Integer.parseInt(str1[2]);
		System.out.println(a1+""+a2+""+a3);
		int b1[]= new int[8];
		int c=a1;
		int d = 0;
		while(c!=0) {
			c=c/10;
			d++;
		}
		System.out.println("d: "+d);
		
		for(int i=0;i<d;i++) {
			b1[i]=a1%10;
			a1=a1/10;
		}
//		b1[0]=a1%10;
//		a1=a1/10;
//		b1[1]=a1%10;
		
		int c1=a2;
		int d1 = 0;
		while(c1!=0) {
			c1=c1/10;
			d1++;
		}
		System.out.println("d1: "+d1);
		
		for(int i=0;i<d1;i++) {
			b1[i]=a2%10;
			a2=a2/10;
		}
		
		int c2=a3;
		int d2 = 0;
		while(c2!=0) {
			c2=c2/10;
			d2++;
		}
		System.out.println("d2: "+d2);
		
		for(int i=0;i<d2;i++) {
			b1[i]=a3%10;
			a3=a3/10;
		}
		int sum =0;
		for(int i=0;i<d2;i++) {
			System.out.println(b1[i]);
			sum= sum+b1[i];
		}
		System.out.println("Total d2: "+sum); //
		for(int i=0;i<d1;i++) {
			b1[i]=a2%10;
			a2=a2/10;
		}

		int x = d2+d+c1;
		System.out.println(d2);
		System.out.println(d);
		System.out.println(c1);
		System.out.println(x);
	}
	}

//for(String e:str1) {
//System.out.println(e);
//int str3=Integer.parseInt(e);
//}
//System.out.println("-----------------------");
//System.out.println(str1[0]);
//System.out.println(str1[1]);