package problem;

public class problem45 {

	public static void main(String[] args) {
		int[] n = new int[10];
		String l = "";
		String s = "";

		for (int i = 0; i < 10; i++) {
			n[i] = (int) (Math.random() * 101);
			System.out.print(n[i]);

			if (n[i] >= 50) {
				l += String.valueOf(n[i] + " ");
			} else {
				s += String.valueOf(n[i] + " ");
			}
		}
		System.out.println();
		System.out.println("50上" + l);
		System.out.println("50下" + s);

	}
}
