package classMethod.human;

public class Human4 {

	static public int humanCount = 0;
	public String name;
	public static final String GREETING = "こんにちわ";

	public Human4(String name) {
		this.name = name;
		Human4.humanCount++;
	}

	static public void staticMethodPrint() {
		System.out.println("人の数は" + Human4.humanCount);
	}

	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
	}

}
