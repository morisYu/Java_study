package chap11.sec03.art02;

public class Key2 {
	public int number;

	public Key2(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key2) {
			Key2 compareKey = (Key2) obj;
			if(this.number==compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	// KeyExample에서 "홍길동" 을 읽어올려면 hashCode() 메소드를 재정의해야 한다.
	// 객체가 새로 생성될 때마다 다른 hashCode가 부여되는데 아래와같이 재정의를 하면 생성자에 입력한 값에 따라 hashCode 저장 가능
	@Override
	public int hashCode() {
		return number;
	}
}
