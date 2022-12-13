package basicProgram_Java_2;

public class Program_8 {
	public static void main(String[] args) {
// 8. Create an array of 20 elements and print average of it.
//	logic for average calculation : sum of value/ number of value = avg
		int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
 		double avg=0;
		for(double e:arr) {
			avg=e+avg;
		}
		System.out.println("average of all numbers : "+(avg/arr.length));
		}
	}