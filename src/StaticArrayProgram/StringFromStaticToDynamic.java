package StaticArrayProgram;

public class StringFromStaticToDynamic {
	public static void main(String[] aurg) {
//		String str="This is my order id 1234";
//		System.out.printf(str.substring(str.indexOf("id")+3),str.length());
//		System.out.println(str.substring(str.indexOf("id")+3,str.length()));
		
		String strr="Your order 12345 is generated successfully";
		String [] s= strr.split(" ");
		String s1 = s[s.length-3]; 
		for(int i=s.length-3;i>0;i--) {
			System.out.println(s1.charAt(i));
		
		//System.out.println(strr.substring(strr.indexOf("order")+5,strr.indexOf("i")-1));
		}
	}

}
