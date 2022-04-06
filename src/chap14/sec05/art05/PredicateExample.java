package chap14.sec05.art05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Predicate 함수적 인터페이스는 매개변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고있다.
// 이 메소드들은 매개값을 조사해서 true 또는 false 를 리턴한다.
public class PredicateExample {
	private static List<Student> list = Arrays.asList(new Student("홍길동", "남자", 90), new Student("김순희", "여자", 90),
			new Student("감자바", "남자", 95), new Student("박한나", "여자", 92));

	public static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			if (predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: "+maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: "+femaleAvg);
	}
}
