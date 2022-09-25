package problem;

public class problem33 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10) + 1;
		System.out.println(a);
		if (a % 2 == 0) {
			for (int i = 0; i < a; i++) {
				System.out.print("★");
			}
		} else {
			for (int i = 0; i < a; i++) {
				System.out.print("☆");
			}

		}

		System.out.println();
	}
}
