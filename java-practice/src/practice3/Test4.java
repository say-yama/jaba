package practice3;
//

//２０の配列数
//0から5ずつ配列に順次追加
//配列0～10の奇数配列の数字をカンマ区切りで表示
//配列11～20の偶数配列の数字を同上

public class Test4 {

	public static void main(String[] args) {
		//		配列の作成
		int[] x = new int[20];
		//		文字列の初期値
		String str = "";
		//		初期値の作成
		x[0] = 0;
		//		配列[]に1~配列数に+5しながら導入
		for (int i = 1; i < x.length; i++) {
		//	x[1つ前の配列] + 5する
			x[i] = x[i - 1] + 5;
		}
		//		\n→改行
		System.out.println("\n奇数:");
		for (int i = 0; i < 11; i++) {
			//		偶数の確認
			if (x[i] % 2 != 0) {
				//		String.valueOf(引数)→引数をStringの文字列に変換
				str += String.valueOf(x[i]) + ",";
			}
		}
		//		String.substring(Index, index)部分抜き出し
		System.out.println(str.substring(0, str.length() - 1));
		System.out.println("\n偶数:");
		str = "";
		for (int i = 11; i < 20; i++) {
			//		奇数の確認
			if (x[i] % 2 == 0) {
				str += String.valueOf(x[i]) + ",";
			}
		}
		System.out.println(str.substring(0, str.length() - 1));
		System.out.println("\n");
	}
}
