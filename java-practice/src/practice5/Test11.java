package practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("好きな寿司の番号を入力ください。1：まぐろ　2：えび　３：サーモン");
		int sushi = Integer.parseInt(br.readLine());

		switch (sushi) {
		case 1:
			System.out.println("まぐろを選んだあなたは高級志向！");
			break;
		case 2:
			System.out.println("えびを選んだあなたは甘党かも？");
			break;
		case 3:
			System.out.println("サーモンを選んだあなたはお魚が肉派ですね");
			break;
		}
	}
}