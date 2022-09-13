package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test18 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;

		for (;;) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;

			x += n;
		}
		System.out.println(x);
	}
}