package problem;

public class problem43 {

	public static void main(String[] args) {
		int[] a = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			a[i] = (int) (Math.random() * 10) + 1;
			System.out.print(a[i] + " ");
			sum += a[i];
		}
		System.out.println();
		System.out.println(sum);
		int ave = sum / 5;
		System.out.println(ave);
		for (int i = 0; i < 5; i++) {
			if (a[i] > ave) {
				System.out.print(a[i]);
			}
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			if (a[i] < ave) {
				System.out.print(a[i]);
			}
		}
		System.out.println();
	}
}
