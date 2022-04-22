package chap15.sec05.art04;

// TreeSet과 TreeMap은 정렬을 위해 java.lang.Comparable을 구현한 객체를 요구하는데
// Integer, Double, String 모두 Comparable 인터페이스를 구현하고 있다.
// 사용자 정의 클래스도 Comparable을 구현한다면 자동 정렬이 가능함.
public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if(age<o.age) {
			return -1;
		}else if(age == o.age) {
			return 0;
		}else {
			return 1;
		}
	}
}
