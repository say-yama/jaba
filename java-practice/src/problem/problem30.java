package problem;

public class problem30 {

	public static void main(String[] args) {
		int x = 0;
		for (int i = 0; i < 5; i++) {
			int n = (int) (Math.random() * 100) + 1;
			System.out.println(n);
			if (x < n) {
				x = n;
			}
		}
		System.out.println("最大値：" + x);
	}

}
