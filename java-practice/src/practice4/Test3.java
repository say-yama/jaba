package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int x = Integer.parseInt(s);
		System.out.println(x);
		System.out.println(x * x);
		System.out.println(x * x * x);
	}

}
