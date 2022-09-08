package practice;

public class Car3 {
	private int no;
	private int speed;

	public Car3() {
		no = 0;
	}

	public Car3(int n) {
		no = n;
	}

	public void run(int s) {
		speed = s;
	}

	public void brake() {
		speed = 0;
	}

	public void brake(int s) {
		speed -= s;
	}

	public void display() {
		System.out.println("ナンバーは" + no + "速度は" + speed);
	}

}