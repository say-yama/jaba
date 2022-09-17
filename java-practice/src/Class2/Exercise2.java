package Class2;

public class Exercise2 {
	public static void main(String[] args) {
		Cat MyCat = new Cat();
		Dog MyDog = new Dog();

		MyCat.Name = "タマ";
		MyCat.Age = 1;
		MyDog.Name = "ぽち";
		MyDog.Age = 12;
		MyCat.ShowProfile();
		MyCat.Sleep();
		MyDog.ShowProfile();
		MyDog.Run();
	}
}
