
public class practice {

	public static void main(String[] args) {
		//		三角形の計算
		int height = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		int area;

		area = height * width / 2.0;

		System.out.println("高さ：" + height);
		System.out.println("幅：" + width);
		System.out.println("面積：" + area);
		//		円の計算
		int radius = Integer.parseInt(args[0]);
		double pi = 3.141592;
		double area;

		area = radius * radius * pi;

		//		小数点第３位以降を切り捨て
		area = (int) (area * 100);
		area = area / 100;

		System.out.println("半径：" + radius);
		System.out.println("面積：" + area);
		//				比較プログラム
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if (a > b) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		} else {
			System.out.println("同じです");
		}
		//		繰り返し文
		int i = 1;

		while (i <= 10) {
			System.out.println(i + "回目：" + "フリーラーニングを広げたい！");
			i++;
		}
		//		コマンドラインの入力文字列を表示
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
