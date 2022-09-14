package Hairetu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n[] = new int[10];

		for (int i = 0; i < 10; i++)
			n[i] = Integer.parseInt(br.readLine());

		System.out.print("\n偶数:");

		for (int x : n)
			if (x % 2 == 0)
				System.out.print(n + "");
		System.out.print("\n奇数:");

		for (int x : n)
			if ((x % 2) != 0)
				System.out.print(n + " ");
	}
}
