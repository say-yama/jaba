package practice;

public class DriveCar1 {

	public static void main(String[] args) {
		Car01 car01 = new Car01();
		Car02 car02 = new Car02(2525);

		car01.setNo(2525);
		car01.run(30);
		car01.display();

		car01.brake(10);
		car01.display();
		
		car02.run(30);
		car02.display();
		
		car02.brake(10);
		car02.display();
	}

}
