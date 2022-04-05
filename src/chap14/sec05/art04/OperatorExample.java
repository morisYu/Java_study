package chap14.sec05.art04;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
// Operator �Լ��� �������̽��� Function�� �����ϰ� �Ű� ������ ���ϰ��� �ִ� applyXXX()
// �޼ҵ带 ���� ������, �Ű����� ���ϰ����� ����(Ÿ�� ��ȯ) �ϴ� ���Һ��ٴ� �Ű����� �̿��ؼ�
// ������ ���� �� ������ Ÿ������ ���ϰ��� �����ϴ� ������ �Ѵ�.
import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	private static List<Student> list = Arrays.asList(new Student("ȫ�浿", 90), new Student("�ſ��", 80),
			new Student("�踻��", 91));

	// BinaryOperator �� ��ü T �� ��ü T �� ���� �� ��ü T �� ����
	public static Student reStudent(BinaryOperator<Student> s) {
		Student result = list.get(0);
		for (Student student : list) {
			result = s.apply(result, student);
		}
		return result;
	};

	// IntBinaryOperator �� �� ���� int�� �����Ѵ�.
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// �ִ밪 ���
		// int �Ű����� a,b�� �̿��� ������� ���ٽ����� ����
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("�ִ밪: " + max);

		// �ּҰ� ���
		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("�ּҰ�: " + min);

		// ������ ���� �л��� �̸� ���
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
