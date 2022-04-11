package chap15.sec04.art01;

public class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// �й��� �̸��� ������ ��� true�� ����
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name == student.name);
		} else {
			return false;
		}
	}

	// �й��� �̸��� ���ٸ� ������ hashcode�� ����
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}
