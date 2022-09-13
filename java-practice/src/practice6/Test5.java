package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		for(int i=0; i< 10; i++) {
			int n = Integer.parseInt(br.readLine());
			sum += n;
		}
		System.out.println("平均は"+ (sum/10));
		
	}
}