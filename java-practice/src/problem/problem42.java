package problem;

public class problem42 {

	public static void main(String[] args) {
		int[] data = new int[10];
		int a = 1;
		int b = 1;
		int c = 1;

		for (int i = 0; i < 10; i++) {
			data[i] = (int) (Math.random() * 10) + 1;
			System.out.print(data[i] + " ");
			if (a < data[i]) {
				a = data[i];
			} else if (b > data[i]) {
				b = data[i];
			}
			c += data[i];
		}
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c / 10);
	}
}
