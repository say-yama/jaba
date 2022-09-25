package problem;

import java.util.Random;

public class problem44 {

	public static void main(String[] args) {
		int[] a = new int[5];
		Random rand = new Random();
		int l = 0;
		int s = 0;
		int n = 0;

		for (int i = 0; i < 5; i++) {
			a[i] = rand.nextInt(20) - 10;
			System.out.print(a[i]);

			if (a[i] > 0) {
				l++;
			} else if (a[i] < 0) {
				s++;
			} else {
				n++;
			}
		}

		System.out.println();
		System.out.println(l);
		System.out.println(s);
		System.out.println(n);
	}
}
