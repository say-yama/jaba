package problem;

public class problem48 {

	public static void main(String[] args) {
		int[][] x = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int s = 0; s < 3; s++) {
				x[i][s] = (int) (Math.random() * 10);
				System.out.print(x[i][s]);
			}
			System.out.println();
		}
	}
}
