package test3;

public class Test4 {
	public static void main(String[] args) {
		int[] n = new int[20];
		n[0] = 0;
		String knum = "";
		String gnum = "";

		for (int i = 1; i < n.length; i++) {
			n[i] = n[i - 1] + 5;
			if (i < 11) {
				if (n[i] % 2 != 0) {
					knum += n[i]+" ";
//					System.out.print(knum);
				}
			} else if (i > 10) {
				if (n[i] % 2 == 0) {
					gnum += n[i]+ " ";
//					System.out.print(gnum);
				}
			}
		}
		System.out.println("奇数は" + knum);
		System.out.println("偶数は" + gnum);
	}

}
