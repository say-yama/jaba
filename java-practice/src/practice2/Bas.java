package practice2;

public class Bas extends Vehicle implements Stopable {

	public Bas(int crewNum) {
		this.crewNum = crewNum;
	}

	public void showCrewNum() {
		System.out.println("バスの乗客" + crewNum + "名");
	}
	
	public void stop() {
		System.out.println("次止まります");
	}

}
