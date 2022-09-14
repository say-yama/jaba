package Hairetu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x[] = new int[10];
		int cnt, sum;

		for (cnt = 0, sum = 0; cnt < 10 && sum <= 100; cnt++) {
			x[cnt] = Integer.parseInt(br.readLine());
			sum += x[cnt];
		}
		for (int i = 0; i < cnt; i++)
			System.out.println(x[i]);
	}

}
