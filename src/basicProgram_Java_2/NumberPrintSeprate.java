package basicProgram_Java_2;

public class NumberPrintSeprate {
	public static void main(String[] args) {
		int n = 123456;
		int reverse=0;
		int reminder=0;
		for(int i=0; n>0;i++) {
			i=n%10;
			reminder=reminder*10+n;
			n=n/10;
			System.out.println(i);		
		}
	}
}
