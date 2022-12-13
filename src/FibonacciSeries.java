
public class FibonacciSeries {

	public static void main(String[] args) {

		int num = 0, next = 1, result = 0;
		for (int i = 0; i <10; i++) {
			result = num + next;
			num = next;
			next = result;
			System.out.println(result+" ");
		}
	}

}