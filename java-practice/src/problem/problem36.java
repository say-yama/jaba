package problem;

public class problem36 {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			for (int x = 10; i + x > 10; x--) {
				System.out.print("■");

			}
				for (int n = 0; i + n < 10; n++) {
					System.out.print("□");
				}
				System.out.println(+i);
			}
	}
}
