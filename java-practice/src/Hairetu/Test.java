package Hairetu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int values[] = new int[10];

		for (int i = 0; i < 10; i++)
			values[i] = Integer.parseInt(br.readLine());

		System.out.println();

		for (int i = 0; i < 10; i++)
			System.out.println(values[i] * 2);
	}

}
