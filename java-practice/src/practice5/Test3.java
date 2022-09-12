package practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if (x > y) {
			System.out.println(x + "は" + y + "より大きい");
		} else if (y < x) {
			System.out.println(x + "は" + y + "より小さい");
		} else {
			System.out.println("等しい");
		}
	}

}
