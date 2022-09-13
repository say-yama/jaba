package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int scoreH = 0;
		int scoreK = 0;

		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "回表、巨人の得点は？");
			int K = Integer.parseInt(br.readLine());
			System.out.println(i + "回裏、阪神の得点は？");
			int H = Integer.parseInt(br.readLine());

			scoreK += K;
			scoreH += H;
		}
		System.out.println("巨人：" + scoreK + ",阪神：" + scoreH + "点");
		if (scoreK > scoreH) {
			System.out.println("巨人の勝ち");
		} else if (scoreK < scoreH) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}

	}
}