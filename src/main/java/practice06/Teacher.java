package practice06;

import java.lang.reflect.Field;

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
		String fieldname = "klass";
		Field[] fields = this.getClass().getDeclaredFields();
		boolean isKlassExist = false;
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getName().equals(fieldname)) {
				isKlassExist = true;
				break;
			}
		}
		
		if (isKlassExist) {
			return super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
		} else {
			return super.introduce() + " I am a Teacher. I teach No Class.";
		}
	}
}
