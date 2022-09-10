package practice3;
//
//２０の配列数
//0から5ずつ配列に順次追加
//配列0～10の奇数配列の数字をカンマ区切りで表示
//配列11～20の偶数配列の数字を同上


public class Test4 {

	public static void main(String[] args) {
		int[] x = new int[20];
		String str = "";
		x[0] = 0;
		for (int i = 1; i < x.length; i++) {
			x[i] = x[i - 1] + 5;
		}
		System.out.println("\n奇数:");
		for (int i = 0; i < 11; i++) {
			if (x[i] % 2 != 0) {
				str += String.valueOf(x[i]) + ",";
			}
		}
		System.out.println(str.substring(0, str.length() - 1));
		System.out.println("\n偶数:");
		str = "";
		for (int i = 11; i < 20; i++) {
			if (x[i] % 2 == 0) {
				str += String.valueOf(x[i]) + ",";
			}
		}
		System.out.println(str.substring(0, str.length() - 1));
		System.out.println("\n");
	}
}
