package practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		if (x % 2 == 0) {
			if (x >= 0) {
				System.out.println(x + "は正の偶数である");
			} else {
				System.out.println(x + "は負の偶数である");
			}
		} else {
			if (x >= 0) {
				System.out.println(x + "は正の奇数である");
			} else {
				System.out.println(x + "は負の奇数である");
			}
		}
	}
}
