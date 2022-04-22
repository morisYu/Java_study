package chap15.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 학번이 같으면 동일한 객체로 판단해서 중복 저장이 되지 않게
// Chap15Ex08_Student 클래스에서 equals() 메소드 재정의
public class Chap15Ex08_HashSetExample {
	public static void main(String[] args) {

		Set<Chap15Ex08_Student> set = new HashSet<Chap15Ex08_Student>();

		set.add(new Chap15Ex08_Student(1, "홍길동"));
		set.add(new Chap15Ex08_Student(2, "신용권"));
		set.add(new Chap15Ex08_Student(1, "조민우"));

		Iterator<Chap15Ex08_Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Chap15Ex08_Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}
