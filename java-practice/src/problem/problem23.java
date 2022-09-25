package problem;

public class problem23 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10) + 1;
		int i = 0;
		System.out.println(a);
		while (i < a) {
			System.out.print("■");
			i++;
		}
		System.out.println();
	}

}
