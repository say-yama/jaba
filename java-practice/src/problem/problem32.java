package problem;

public class problem32 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10) + 1;

		if (a >= 5) {
			for (int i = 0; i < a; i++) {
				System.out.print("★");
			}
			System.out.println();
		} else {
			System.out.println(a);
		}
	}

}
