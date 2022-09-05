package exeption;

//public class Exception {
//
//	public static void main(String[] args) {
//		System.out.println("100 / 0は？");
//		int result = 100 / 0;
//		System.out.println("計算結果" + result);
//		System.out.println("プログラムの終了");
//	}
//
//}
public class Exception {

	public static void main(String[] args) {
		try {
			System.out.println("100 / 0は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		} finally {
			System.out.println("プログラムの終了");
		}
	}
}
