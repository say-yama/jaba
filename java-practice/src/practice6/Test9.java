package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test9 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int min = 0;

		for (int i = 1; i <= 10; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n > max) {
				max = n;
			} else if (n < min) {
				min = n;
			}
		}
		System.out.println("最大値は" + max);
		System.out.println("最低値は" + min);
	}
}