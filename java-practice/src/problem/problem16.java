package problem;

import java.util.Random;

public class problem16 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(20) - 10;
		System.out.println(a);
		if (a < 0) {
			System.out.println("負の値です");
		} else if (a > 0) {
			System.out.println("正の値です");
		} else {
			System.out.println("0です");
		}
	}

}
