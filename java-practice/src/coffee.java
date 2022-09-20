import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class coffee {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		int s = Integer.parseInt(sc.readLine());
		int m = Integer.parseInt(sc.readLine());
		int l = Integer.parseInt(sc.readLine());
		String[] o = new String[n];
		int q = 0;

		for (int i = 0; i < n; i++) {
			o[i] = sc.readLine();
			switch (o[i]) {
			case "SS":
				q += (s / 2);
				break;
			case "S":
				q += (s);
				break;
			case "M":
				q += (m);
				break;
			case "L":
				q += (l);
				break;
			case "LL":
				q += (l * 2);
				break;
			}

		}
		System.out.println(q);
	}


}
