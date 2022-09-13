package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		for (int i = 0, out = 0; i < x; i++) {
			System.out.println(out++);
			if (out > 9)
				out = 0;

//			for (int i = 0; i < x; i++) {
//				System.out.println(i % 10);
//			}
		}
	}
}