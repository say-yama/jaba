package problem2;

public class problem6_1 {

	public static void main(String[] args) {
		Minmax m = new Minmax();
		int a = 4, b = 2, c =3;
		System.out.println(a + "と" + b + "のうち、最大のものは" + m.max(a, b));
		System.out.println(a + "と" + b + "のうち、最小のものは" + m.min(a, b));
	}

}
