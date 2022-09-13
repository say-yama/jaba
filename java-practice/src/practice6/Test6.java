package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args)
			throws IOException {

		System.out.println("0または1を10回入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = 0;
		int l = 0;

		for (int i = 1; i <= 10; i++) {
			int buttle = Integer.parseInt(br.readLine());
			if (buttle == 0) {
				w += 1;
			} else if (buttle == 1) {
				if (buttle == 1) {
					l += 1;
				}
			}
		}
		System.out.println("勝利" + w + "回");
		System.out.println("負け" + l + "回");
	}
}