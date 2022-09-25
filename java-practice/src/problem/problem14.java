package problem;

public class problem14 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10) + 1;
		System.out.println(a);
		if (a >= 5) {
			System.out.println("5以上");
		} else {
			System.out.println("5未満です");
		}
	}

}
