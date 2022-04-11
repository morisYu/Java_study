package chap15.sec04.art01;

public class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// 학번과 이름이 동일한 경우 true를 리턴
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name == student.name);
		} else {
			return false;
		}
	}

	// 학번과 이름이 같다면 동일한 hashcode를 리턴
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}
