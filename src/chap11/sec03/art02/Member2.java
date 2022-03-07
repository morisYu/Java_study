package chap11.sec03.art02;

public class Member2 {
	public String id;
	
	public Member2(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	// id 문자열에 대한 hashCode를 리턴
	// id 가 같은 Member2 객체인 경우 같은 hashCode 를 가짐
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
