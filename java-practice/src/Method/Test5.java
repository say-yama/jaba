package Method;

public class Test5 {

	public static void main(String[] args) {
		Try('a', 3);
		System.out.println();
		Try('b', 4);
		System.out.println();
		Try('c', 5);
	}

	static void Try(char x, int y) {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(x);

			System.out.println();
		}
	}
}