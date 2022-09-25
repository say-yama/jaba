package problem;

public class problem31 {

	public static void main(String[] args) {
		int a = 100;
		for (int i = 0; i < 5; i++) {
			int n = (int) (Math.random() * 100) + 1;
			System.out.println(n);
			if (n < a) {
				a = n;
			}
		}
		System.out.println("最小値：" + a);
	}

}
