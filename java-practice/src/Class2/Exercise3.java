package Class2;

public class Exercise3 {
	public static void main(String[] args) {
		Cat MyCat = new Cat();
		Dog MyDog = new Dog();

		MyDog.Name = "ぽち";
		MyDog.Age = 12;
		MyCat.Name = "タマ";
		MyCat.Age = 12;
		MyDog.ShowProfile();
		MyCat.ShowProfile();
		MyDog.Speak();
		MyCat.Speak();
	}
}
