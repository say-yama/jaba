package problem;

public class problem35 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {

			for (int n = 1; n < 10; n++) {
				System.out.print(i + "*" + n + "=" + (i * n) + " ");
			}
			System.out.println();
		}
	}
}
