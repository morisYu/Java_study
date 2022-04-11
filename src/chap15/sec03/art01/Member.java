package chap15.sec03.art01;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// name �� age �� ������ true�� ����
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return (member.name.equals(name)) && (member.age==age);
		}else {
			return false;
		}
	}
	
	// name �� �ؽ��ڵ�� age�� ���ؼ� hashCode�� ����
	// name �� age�� ������ ���� hashCode�� ����.
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
}
