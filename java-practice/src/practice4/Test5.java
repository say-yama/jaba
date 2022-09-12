package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		System.out.println((x + y) / 2);
		double z = (x + y) / 2;
		System.out.println(z);
	}

}
