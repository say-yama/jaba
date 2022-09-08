package practice;

public class Car4 {
	private int no;
	static private int count = 0;

	public Car4() {
		no = 0;
		count++;
		System.out.println("ナンバーなしで作りました");
	}

	public Car4(int n) {
		no = n;
		count++;
		System.out.println("ナンバー" + no + "を作りました");
	}

	static public void display() {
		System.out.println(count + "台作成済みです");
	}

}