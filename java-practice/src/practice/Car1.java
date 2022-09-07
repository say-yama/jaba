package practice;

public class Car1 {
	int no;
	int speed;

	void setNo(int n) {
		no = n;
	}

	void run(int s) {
		speed = s;
	}

	void stop() {
		speed = 0;
	}

	void display() {
		System.out.println("ナンバーは" + no + "速度は" + speed);
	}

}
