package problem;

public class problem37 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			for (int n = 1; n < 11; n++) {
				if (n != i) {
					System.out.print("□");
				} else {
					System.out.print("■");
				}
			}
			System.out.println(+i);
		}
	}
}
