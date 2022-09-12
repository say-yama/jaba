package practice4;

//値の入力の取得
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args)
//	値の入力と取得
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//一行分の文字列の取得
		String s = br.readLine();
//	文字列を数値に書き換えて取得
//		int n = Integer.parseInt(s);
		System.out.println(s);
	}

}
