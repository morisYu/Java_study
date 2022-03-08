package chap11.exercise;

public class Chap11Ex03_Student {
	private String studentNum;

	public Chap11Ex03_Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	// ��ü�� �������� ��ü �ּ�(�ؽ��ڵ�)�� �ʵ尪�� ���ƾ� ��
	// ���� �����Ǵ� ��ü�� ���� ��ü���� �Ǻ�(�ʵ尪 ��)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Chap11Ex03_Student) {
			Chap11Ex03_Student compare = (Chap11Ex03_Student) obj;
			if(studentNum.equals(compare.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
	// ��� �ʵ尡 ������ ���� �ؽ��ڵ带 �����ϵ��� �ؾ� ��
	@Override
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		return hashCode;
	}
}
