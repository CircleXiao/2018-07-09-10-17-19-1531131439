package practice06;

public class Teacher extends Person{
	private int klass;

	public Teacher(String name, int age) {
		super(name, age);
	}
	
 	public Teacher(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}
	
	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}
	
	public String introduce() {		
		if (this.getKlass() > 0) {
			return super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
		} else {
			return super.introduce() + " I am a Teacher. I teach No Class.";
		}
	}
}
