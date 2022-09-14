package Hairetu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		for (int i = 1; i <= 10; i++) {
			int n = Integer.parseInt(br.readLine());
			if (max < n) {
				max = n;
			}
		}

		System.out.println("最大値は" + max);
	}
}