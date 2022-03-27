package chap13.sec06;

public class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
