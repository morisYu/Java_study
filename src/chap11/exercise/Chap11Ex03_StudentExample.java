package chap11.exercise;

import java.util.HashMap;

public class Chap11Ex03_StudentExample {
	public static void main(String[] args) {

		// Student 키로 총점을 저장하는 HashMap 객체 작성
		HashMap<Chap11Ex03_Student, String> hashMap = new HashMap<Chap11Ex03_Student, String>();

		// new Student("1")의 점수 95 를 저장
		Chap11Ex03_Student stu1 = new Chap11Ex03_Student("1");
		System.out.println(stu1);
		hashMap.put(stu1, "95");

		// new Student("1")의 점수를 읽어옴
		Chap11Ex03_Student stu2 = new Chap11Ex03_Student("1");
		System.out.println(stu2);
		String score = hashMap.get(stu2);
		System.out.println("1 번 학생의 총점: " + score);
	}
}
