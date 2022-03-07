package chap11.sec03.art04;

// 클래스 복제를 허용하기 위해서 반드시 Cloneable 인터페이스가 구현되어야 함
public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public Car car;

	public Member(String id, String name, String password, int age, boolean adult, Car car) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.car = car;
	}

	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
