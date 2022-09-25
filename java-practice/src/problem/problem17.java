package problem;

public class problem17 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 3) + 1;
		System.out.println(a);
		if (a == 1) {
			System.out.println("グー");
		} else if (a == 2) {
			System.out.println("パー");
		} else {
			System.out.println("チョキ");
		}
	}

}
