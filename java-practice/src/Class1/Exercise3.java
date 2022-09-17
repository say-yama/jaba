package Class1;

public class Exercise3 {
	public static void main(String[] args) {
		Dog MyDog = new Dog();
		Dog Dog = new Dog();

		MyDog.SetName("ぽち");
		MyDog.SetAge(12);
		MyDog.ShowProfile();
		Dog.SetName("犬");
		Dog.SetAge(0);
		Dog.ShowProfile();
	}
}
