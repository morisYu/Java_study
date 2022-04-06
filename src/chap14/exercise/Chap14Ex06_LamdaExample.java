package chap14.exercise;

import java.util.function.ToIntFunction;

public class Chap14Ex06_LamdaExample {
	private static Student[] students = { new Student("ȫ�浿", 90, 96), new Student("�ſ��", 95, 93) };

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		int count = 0;
		for (Student score : students) {
			sum += function.applyAsInt(score);
			count++;
		}
		double result = (double) sum / count;
		return result;
	}

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("���� ��� ����: " + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("���� ��� ����: " + mathAvg);
		System.out.println();
		
		// �Ű������� �� ���ٽ��� �޼ҵ� ������ ����
		double englishAvg2 = avg(Student::getEnglishScore);
		System.out.println("���� ��� ����: " + englishAvg2);
		
		double mathAvg2 = avg(Student::getMathScore);
		System.out.println("���� ��� ����: " + mathAvg2);
	}

	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}
	}
}
