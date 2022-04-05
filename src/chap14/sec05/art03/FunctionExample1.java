package chap14.sec05.art03;

// Function �Լ��� �������̽��� Ư¡�� �Ű����� ���ϰ��� �ִ� applyXXX() �޼ҵ带 ������ �ִ�.
// �� �޼ҵ���� �Ű����� ���ϰ����� ����(Ÿ�� ��ȯ)�ϴ� ������ �Ѵ�.
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	// list�� �л� ���� ����
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
			);
	
	// Function<T, U> ��ü T�� ��ü U�� ����
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student));
		}
		System.out.println();
	}
	
	// ToIntFunction<T> ��ü T�� int�� ����
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[�л��̸�]");
		printString(t -> t.getName());
		
		System.out.println("[��������]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[��������]");
		printInt(t -> t.getMathScore());
	}
}
