
public class ClassMethod {
	public static void main(String[] args) {
		Human yamada = new Human();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です");
		Human sato = new Human("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + yamada.age + "です");

	}

}
