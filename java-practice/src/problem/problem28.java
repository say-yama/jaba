package problem;

public class problem28 {

	public static void main(String[] args) {
		int n;
		while (true) {
			n = (int) (Math.random() * 100) + 1;
			System.out.println(n);
			if (n % 10==0) {
				break;
			}
		}
		System.out.println("終了します");
	}
}
