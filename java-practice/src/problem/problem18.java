package problem;

public class problem18 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10) + 1;
		int b = (int) (Math.random() * 10) + 1;
		System.out.println(a);
		System.out.println(b);
		if (a > b) {
			System.out.println("aの方が大きい");
		} else if (a < b) {
			System.out.println("bの方が大きい");
		} else {
			System.out.println("aとbは等しい");
		}
	}

}
