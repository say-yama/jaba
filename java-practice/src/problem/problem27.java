package problem;

public class problem27 {

	public static void main(String[] args) {
		int n;
		while (true) {
			n = (int) (Math.random() * 10) + 1;
			if (n != 10) {
				System.out.println(n);
			} else {
				break;
			}
		}
		System.out.println("終了します");

	}

}
