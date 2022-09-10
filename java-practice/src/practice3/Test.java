package practice3;

//1~10を偶数のみ昇順表示

public class Test {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 1) {
				System.out.println(i);
			}
		}
	}

}
