package chap14.sec05.art03;

// Function 함수적 인터페이스의 특징은 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
// 이 메소드들은 매개값을 리턴값으로 매핑(타입 변환)하는 역할을 한다.
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	// list에 학생 정보 저장
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
			);
	
	// Function<T, U> 객체 T를 객체 U로 매핑
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student));
		}
		System.out.println();
	}
	
	// ToIntFunction<T> 객체 T를 int로 매핑
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생이름]");
		printString(t -> t.getName());
		
		System.out.println("[영어점수]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[수학점수]");
		printInt(t -> t.getMathScore());
	}
}
