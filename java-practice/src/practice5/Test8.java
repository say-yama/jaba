package practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8 {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("曜日を入力して下さい。0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int day = Integer.parseInt(br.readLine());

		System.out.println("時間を入力して下さい。0=午前、1=午後、2=夜間");
		int time = Integer.parseInt(br.readLine());

		boolean ok = false;

		if (time == 0) {
			if (day == 1 || day == 3 || day == 6) {
				ok = true;
			}
		}
		if (time == 1) {
			if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
				ok = true;
			}
		} else {
			if (day == 1 || day == 2 || day == 4 || day == 5) {
				ok = true;
			}
		}

		if (ok == true) {
			System.out.println("診療所は開いています");
		} else {
			System.out.println("休診です");
		}
	}
}