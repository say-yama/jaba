package practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		if (x % 2 == 0) {
			System.out.println(x + "は" + "偶数です");
		} else {
			System.out.println(x + "は" + "奇数です");
		}

	}

}
