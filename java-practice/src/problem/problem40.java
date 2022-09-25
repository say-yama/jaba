package problem;

public class problem40 {

	public static void main(String[] args) {
		int data[] = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = (int) (Math.random() * 100) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();

		System.out.print("偶数は");
		for (int i = 0; i < 10; i++) {
			if (data[i] % 2 == 0) {
				System.out.print(data[i]+" ");
			}
		}
		System.out.println();
		
		System.out.print("奇数は");
		for (int i = 0; i < 10; i++) {
			if (data[i] % 2 != 0) {
				System.out.print(data[i]+" ");
			}
		}
		System.out.println();
	}
}