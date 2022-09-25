package problem;

public class problem20 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 50) + 1;
		System.out.println(a);
		if (a <= 50 && a % 2 == 0) {
			System.out.println("50以下の偶数です");
		} else if (a <= 50) {
			System.out.println("50以下です");
		} else if (a % 2 == 0) {
			System.out.println("偶数です");
		}
	}

}
