package basicProgram_Java_2;

public class Assignment {

	public static void main(String[] args) {
		String s = "02/07/2001";
		String arr[] = s.split("/");
		int a[]= new int[arr.length];
		int finalSum=0;
		for(int i = 0;i<arr.length;i++) {
			a[i]=Integer.parseInt(arr[i]);
//			System.out.println(a[i]);
			int x = a[i];
			int cnt = 0;
			while(x!=0) {
				x=x/10;
				cnt++;
			}
//			System.out.println(cnt);
			int sum[] = new int[arr.length];
			int x1= a[i];
			for(int j=0;j<cnt;j++) {
				sum[i]= sum[i]+x1%10;
				x1=x1/10;
			}
//			System.out.println(sum[i]);
			finalSum = finalSum+sum[i];
		}
		
		System.out.println("Splitted date summation is : "+finalSum);

	}

}
