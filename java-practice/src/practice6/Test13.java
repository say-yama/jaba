package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test13 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = 0;
		int b = 0;

		while (s < 3 && b < 4) {
			System.out.println("ストライク＝1 or ボール＝2 ？");
			int x = Integer.parseInt(br.readLine());

			if (x == 1) {
				s += 1;
			} else if (x == 2) {
				b += 1;
			}
		}
		System.out.println(b + "ボール" + s + "ストライク");
	}
}