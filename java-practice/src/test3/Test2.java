package test3;

public class Test2 {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int count = 0;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			if (n[i] % 2 == 0) {
				sum += n[i];
				count++;
			}
		}
		System.out.println("偶数の数は" + count + "合計は" + sum);
	}

}
