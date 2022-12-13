
public class Rev {

	public static void main(String[] args) {
		int num =125;
		int rev =0;
		int rem=0;
		int tem = num;
		while(num >0) {
			rem=num%10;//125/10 = 5
			rev = (rev *10)+rem;// 0=0*10+5=>rev=5;
			num=num/10;	//125/10=>num=12;
	
		}
		if(num==rev) {
			
		}
		//System.out.println(rev);
			}

}