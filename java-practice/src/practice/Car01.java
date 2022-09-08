package practice;

public class Car01 {
	int no;
	int speed;

	void setNo(int n) {
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
