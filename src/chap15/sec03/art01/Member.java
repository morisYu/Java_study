package chap15.sec03.art01;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// name 과 age 가 같으면 true를 리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return (member.name.equals(name)) && (member.age==age);
		}else {
			return false;
		}
	}
	
	// name 의 해시코드와 age를 더해서 hashCode를 리턴
	// name 과 age가 같으면 같은 hashCode를 가짐.
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
}
