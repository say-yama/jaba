package problem;

public class problem46 {

	public static void main(String[] args) {
		int[] n = new int[7];

		for (int i = 0; i < 7; i++) {
			n[i] = (int) (Math.random() * 10) + 1;
			System.out.print(n[i]);

			for (int x = 0; x < n[i]; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
