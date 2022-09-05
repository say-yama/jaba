package exeption;

//public class Exception2 {
//	public static void main(String[] args) {
//		try {
//			Exception2.division(100,0); 
//		} catch (ArithmeticException e) {
//			System.out.println("ArithemeticExeption例外が発生");
//		} catch (IllegalArgumentException e) {
//			System.out.println("IllegalArgumentException例外が発生");
//			throw e;
//		}
//		System.out.println("プログラム終了");
//	}
//
//	public static void division(int a, int b) {
//		System.out.println(a + "÷" + b + "は？");
//		if (b == 0) {
//			throw new IllegalArgumentException("引数が不正です");
//		}
//		int result = a / b;
//		System.out.println("計算結果" + result);
//	}
//
//}

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception2 {
	public static void main(String[] args) {
		try {
			Exception2.readFile("exception.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException例外が発生");
		}
		System.out.println("プログラム終了");
	}

	public static void readFile(String fileName) throws FileNotFoundException {
		System.out.println("ファイルの読み込み開始");
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}

}
