package practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day = Integer.parseInt(br.readLine());

		switch (day) {
		case 1:
			System.out.println("元旦");
			System.out.println("成人の日");
		case 2:
			System.out.println("建国記念日");
		case 3:
			System.out.println("春分の日");
		case 4:
			System.out.println("昭和の日");
		case 5:
			System.out.println("憲法記念日");
			System.out.println("みどりの日");
			System.out.println("こどもの日");
		case 7:
			System.out.println("海の日");
		case 9:
			System.out.println("敬老の日");
			System.out.println("秋分の日");
		case 10:
			System.out.println("体育の日");
		case 11:
			System.out.println("文化の日");
			System.out.println("勤労感謝の日");
		case 12:
			System.out.println("天皇誕生日");

		}
	}
}