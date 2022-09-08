package practice;

public class Taxi extends Car5 {
	private int price;

	public void start() {
		price = 420;
	}

	public void run() {
		price += 80;
	}

	public void display() {
		System.out.println("料金は" + price + "円");
	}

}
