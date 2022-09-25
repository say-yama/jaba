package problem;

public class problem49 {

	public static void main(String[] args) {
		int[][] n = new int[3][3];
		int max = 0;
		int min = 9;

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				n[x][y] = (int) (Math.random() * 10);
				System.out.print(n[x][y]);
				if (n[x][y] > max) {
					max = n[x][y];
				} else if (n[x][y] < min) {
					min = n[x][y];
				}
			}
			System.out.println();
		}
		System.out.println(max);
		System.out.println(min);
	}
}
