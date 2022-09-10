package practice3;

//1~10までの偶数の数と和

public class Test2 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 1) {
				x += 1;
				y += i;
			}
		}
		System.out.println("偶数の数は" + x + "個");
		System.out.println("偶数の和は" + y);

	}

}
