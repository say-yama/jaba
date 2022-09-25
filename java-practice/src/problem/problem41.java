package problem;

public class problem41 {

	public static void main(String[] args) {
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = (int) (Math.random() * 10) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			if (data[i] % 3 == 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			if (data[i] % 2 != 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
	}
}
