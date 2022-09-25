package problem;

public class problem22 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10) + 1;
		System.out.println(a);
		for (int i = 0; i < a; i++) {
			System.out.print("■");
		}
		System.out.println();
	}

}
