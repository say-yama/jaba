package test3;

public class Test3 {

	public static void main(String[] args) {
		String num = "";

		for (int i = 1; i <= 10; i++) {
			num += i;
			if (i < 10) {
				num += ",";
			}
		}
		System.out.print(num);
		System.out.println();
	}

}
