package problem;

public class problem38 {

	public static void main(String[] args) {
		int[] n = new int[7];
		for (int i = 0; i < 7; i++) {
			n[i] = (int) (Math.random() * 10) + 1;
			System.out.print("n["+i+"]=" + n[i] + " ");
		}
		System.out.println();

	}
}
