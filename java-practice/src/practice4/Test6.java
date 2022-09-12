package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args)
			throws IOException {
		System.out.println("貴方の年齢を教えてください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		System.out.println(n + "歳ですね");
		System.out.println("あなたは産まれてから約" + (n * 365) + "日経過しました");
	}

}
