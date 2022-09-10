package test;

public class Test7 {

	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		int xy;

		xy = x;
		x = y;
		y = xy;

		System.out.println("x=" + x + ",y=" + y);
	}

}
