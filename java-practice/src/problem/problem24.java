package problem;

public class problem24 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10)+1;
		int num=0;
		System.out.println(a);
		do {
			System.out.print("■");
			num++;
		}while(num<a);
		System.out.println();
	}

}
