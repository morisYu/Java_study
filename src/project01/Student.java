package project01;

public class Student {
	String name;
	String number;


	public Student(String number, String name) {
		this.name = name;
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (student.name.equals(name)) {
				if (student.number.equals(number)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number.hashCode();
	}

}
