package club;

public class Student6 {
	public String name;
	public Club club;

	public Student6(String name, Club club) {
		this.name = name;
		this.club = club;
	}

	public void display() {
		System.out.println("名前は" + name);
		club.display();
	}

	public void practice() {
		club.practice();
	}

}
