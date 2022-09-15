package Method;

public class Test4 {

	public static void main(String[] args) {
		Try(3);
		System.out.println();
		Try(4);
		System.out.println();
		Try(5);
	}

	static void Try(int x) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print("$");
			System.out.println();
		}
	}
}
