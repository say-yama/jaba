package Class1;

public class Dog {
	private String Name;
	private int Age;
	private String Select;

	public Dog(String sel) {
		Select = sel;
	}
	
	public void SetName(String nm) {
		Name = nm;
	}
	
	public void SetAge(int age) {
		Age = age;
	}
	

	public void ShowProfile() {
		System.out.println("名前は、" + Name + "です。");
		System.out.println("年齢は、" + Age + "歳。");
		System.out.println("犬種が、" + Select + "です。");
	}
	
}
