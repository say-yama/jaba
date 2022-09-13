package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test14 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;

		while (total < 100) {
			int x = Integer.parseInt(br.readLine());
			total += x;
		}
		System.out.println("合計は" + total + "です");
	}
}