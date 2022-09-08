package practice;

public class Car02 {
	int no;
	int speed;

	Car02() {
		no = 0;
	}

	Car02(int n) {
		no = n;
	}

	void run(int s) {
		speed = s;
	}

	void brake() {
		speed = 0;
	}

	void brake(int s) {
		speed -= s;
	}

	void display() {
		System.out.println("ナンバーは" + no + "速度は" + speed + "です");
	}

}
