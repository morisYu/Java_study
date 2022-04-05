package chap14.sec05.art04;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
// Operator 함수적 인터페이스는 Function과 동일하게 매개 변수와 리턴값이 있는 applyXXX()
// 메소드를 갖고 있지만, 매개값을 리턴값으로 매핑(타입 변환) 하는 역할보다는 매개값을 이용해서
// 연산을 수행 후 동일한 타입으로 리턴값을 제공하는 역할을 한다.
import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("신용권", 80),
			new Student("김말자", 91));

	// BinaryOperator 는 객체 T 와 객체 T 를 연산 후 객체 T 를 리턴
	public static Student reStudent(BinaryOperator<Student> s) {
		Student result = list.get(0);
		for (Student student : list) {
			result = s.apply(result, student);
		}
		return result;
	};

	// IntBinaryOperator 는 두 개의 int를 연산한다.
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		// int 매개변수 a,b를 이용한 연산식을 람다식으로 대입
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("최대값: " + max);

		// 최소값 얻기
		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("최소값: " + min);

		// 점수가 높은 학생의 이름 출력
		Student rename = reStudent((a, b) -> {
			if (a.getscore() > b.getscore()) {
				return a;
			} else {
				return b;
			}
		});
		System.out.println(rename.getName());

	}
}

class Student {
	public String name;
	public int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getscore() {
		return score;
	}
}
