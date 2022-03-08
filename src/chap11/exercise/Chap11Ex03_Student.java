package chap11.exercise;

public class Chap11Ex03_Student {
	private String studentNum;

	public Chap11Ex03_Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	// 객체가 같을려면 객체 주소(해시코드)와 필드값이 같아야 함
	// 새로 생성되는 객체가 같은 객체인지 판별(필드값 비교)
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
	
	// 멤버 필드가 같으면 같은 해시코드를 리턴하도록 해야 함
	@Override
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		return hashCode;
	}
}
