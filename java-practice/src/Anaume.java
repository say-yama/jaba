import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anaume {

	public static void main(String[] args) throws IOException {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(sc.readLine());
		int f = Integer.parseInt(sc.readLine());

		while (s < f-1) {
			s++;
			System.out.print(s);
		}
		System.out.println();
	}
}