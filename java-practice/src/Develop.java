import java.util.Scanner;

public class Develop {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i = 1; i >= n; i++) {
			if (i % x == 0) {
				System.out.println("A");
			} else if (i % y == 0) {
				System.out.println("B");
			} else if (i % x == 0 && i % y == 0) {
				System.out.println("AB");
			} else {
				System.out.println("N");
			}
		}
	}
}