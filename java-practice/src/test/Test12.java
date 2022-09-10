package test;

public class Test12 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			int x = 10;
			x *= i;
			System.out.println(x);
		}
		for (int i = 3; i < 0; i--) {
			int x = 10;
			x *= i;
			System.out.println(x);
		}
	}

}