package problem;

public class problem19 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100)+1;
		System.out.println(a);
		if(a>=80) {
		System.out.println("優");
		}
		else if(a>=70) {
			System.out.println("良");
		}
		else if(a>=60) {
			System.out.println("可");
		}
		else {
			System.out.println("不可");
		}
	}

}
