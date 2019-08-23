package practice08;

public class Klass {
	private int number;
	private Person leader;
	
	public Klass(int number) {
		this.number = number;
	}
	
	public void assignLeader(Student student) {
		this.leader = student;
	}
	
	public Person getLeader() {
		return this.leader;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getDisplayName() {
		return "Class " + this.number;
	}
}
