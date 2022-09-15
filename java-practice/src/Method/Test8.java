package Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n[] = new int[10];

		for (int i = 0; i < 10; i++)
			n[i] = Integer.parseInt(br.readLine());

		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (n[i] < n[j]) {
					int t = n[i];
					n[i] = n[j];
					n[j] = t;
				}
			}
		}
		for (int i = 0; i < 10; i++)
			System.out.print(n[i] + " ");
	}
}