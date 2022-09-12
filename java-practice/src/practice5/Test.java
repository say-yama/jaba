package practice5;

//値の入力の取得
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args)
			//	値の入力と取得
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if (x > y) {
			System.out.println(x + "は" + y + "より大きい");
		}

	}

}
