package classMethod;

import classMethod.human.Human4;

public class ClassMethod4 {

	public static void main(String[] args) {
		Human4 yamada = new Human4("山田");
		Human4.staticMethodPrint();
		System.out.println(Human4.GREETING);
		yamada.instanceMethodPrint();
	}

}
