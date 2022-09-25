package problem;

import java.util.Random;

public class problem21 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(45) - 10;
		System.out.println(a);
		if (a >= 30) {
			System.out.println("真夏日です");
		} else if (a > 25 && a < 30) {
			System.out.println("夏日です");
		} else if (a < 0) {
			System.out.println("真冬日です");
		}
	}

}
